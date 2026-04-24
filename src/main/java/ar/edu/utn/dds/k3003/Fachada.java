package ar.edu.utn.dds.k3003;

import ar.edu.utn.dds.k3003.catedra.dtos.donadoresYEntidades.*;
import ar.edu.utn.dds.k3003.catedra.fachadas.FachadaDonadoresYEntidades;
import ar.edu.utn.dds.k3003.catedra.fachadas.FachadaIncentivos;
import ar.edu.utn.dds.k3003.exceptions.DonadorNoEncontradoException;
import ar.edu.utn.dds.k3003.exceptions.DonadorYaExistenteException;
import ar.edu.utn.dds.k3003.repositories.DonadoresRepository;
import ar.edu.utn.dds.k3003.repositories.DonadoresYEntidadesDataMapper;
import ar.edu.utn.dds.k3003.repositories.InMemoryDonadoresRepo;
import java.util.List;
import java.util.NoSuchElementException;
import lombok.val;

public class Fachada implements FachadaDonadoresYEntidades,FachadaDonaciones {

  private DonadoresRepository donadoresRepository;
 private EntidadBeneficaRepository entidadBeneficaRepository;
	private DonadoresYEntidadesDataMapper donadoresYEntidadesDataMapper =
      new DonadoresYEntidadesDataMapper();
  private DonacionService donacionService;
  
  public Fachada() {
    /*
    Para que se ejecuten correctamente los tests, se necesita tener un constructor vacio
    Es decir, que no reciba parametros.
    Si necesitan un constructor con parametros
    Java permite tener varios constructores conviviendo sin conflictos.
    */

    this.donadoresRepository = new InMemoryDonadoresRepo();
  }

  @Override
  public DonadorDTO agregarDonador(DonadorDTO donadorDTO) {
    if (this.donadoresRepository.findById(donadorDTO.id()).isPresent()) {
      throw new DonadorYaExistenteException("Ya existe un donador con ese ID");
    }

    val donador = donadoresYEntidadesDataMapper.toDonador(donadorDTO);

    val donadorGuardado = this.donadoresRepository.save(donador);

    return donadoresYEntidadesDataMapper.toDonadorDTO(donadorGuardado);
  }

  @Override
  public DonadorDTO buscarDonadorPorID(String donadorID) throws NoSuchElementException {
    val donadorOptional = this.donadoresRepository.findById(donadorID);

    if (donadorOptional.isEmpty()) {
      throw new DonadorNoEncontradoException("No existe un donador con ese ID");
    }
    val donadorFinal = donadorOptional.get();

    return donadoresYEntidadesDataMapper.toDonadorDTO(donadorFinal);
  }

  @Override
  public DonadorDTO modificarEstado(String donadorID, EstadoDonadorEnum estado)
      throws NoSuchElementException {

    val donadorOptional = this.donadoresRepository.findById(donadorID);

    if (donadorOptional.isEmpty()) {
      throw new DonadorNoEncontradoException("No existe un donador con ese ID");
    }

    val donadorFinal = donadorOptional.get();
    donadorFinal.setEstado(estado);

    this.donadoresRepository.deleteById(donadorID);
    this.donadoresRepository.save(donadorFinal);

    return donadoresYEntidadesDataMapper.toDonadorDTO(donadorFinal);
  }

  @Override
  public DonadorDTO modifcarCategoria(String donadorID, String categoria)
      throws NoSuchElementException {
    val donadorOptional = this.donadoresRepository.findById(donadorID);
    if (donadorOptional.isEmpty()) {
      throw new DonadorNoEncontradoException("No existe un donador con ese ID");
    }
    val donadorFinal = donadorOptional.get();
    donadorFinal.setCategoria(categoria);

    this.donadoresRepository.deleteById(donadorID);
    this.donadoresRepository.save(donadorFinal);

    return donadoresYEntidadesDataMapper.toDonadorDTO(donadorFinal);
  }

  @Override
  public void setFachadaIncentivos(FachadaIncentivos fachadaIncentivos) {}

  @Override
  public Boolean puedeDonar(String donadorID) throws NoSuchElementException {
  DonadorDTO = this.donadoresRepository.findById(donadorID);
    
    Boolean puededonar = if(DonadorDTO.estado = EstadoDonadorEnum.Verificado);
    
    return puededonar;
  }

  @Override
  public List<QuejaDTO> obtenerQuejasDe(String donadorID) throws NoSuchElementException {
      val donadorDTO = buscatDonadorPorId(donadorId);
	  val quejas = donacionService.obtenerQuejasDe(donadorDTO);
	  
    return quejas;
  }

  @Override
  public NecesidadMaterialDTO satisfacerNecesidad(String necesidadID, Integer cantidad)
      throws NoSuchElementException {
  ProductoSolicitadoDTO productoSolicitado = buscarProductoPorId(necesidadID);
	 List<NecesidadMaterialDTO> listaNecesidadMaterial = obtenerNecesidadesInsatisfechasDe(productoSolicitado);
     NecesidadMaterialDTO necesidadMaterial = listaNecesidadMaterial.primeraNecesidad();
	
		  
    return necesidadMaterial;
  }

  @Override
  public DonadorStatsDTO estadisticasDonador(String donadorID) {
    return null;
  }

  @Override
  public EntidadBeneficaDTO agregarEntidad(EntidadBeneficaDTO entidadBeneficaDTO) {
   
    if (this.entidadBeneficaRepository.findById(entidadBeneficaDTO.id()).isPresent()) {
      throw new EntidadYaExistenteException("Ya existe una entidad con ese ID");
    }

    val entidad = donadoresYEntidadesDataMapper.toEntidadBenefica(entidadBeneficaDTO);

    val entidadGuardada = this.entidadBeneficaRepository.save(entidad);
	  
	  
    return entidad;
  }

  @Override
  public EntidadBeneficaDTO buscarEntidadPorID(String entidadID) throws NoSuchElementException {
    

	  
    return null;
  }

  @Override
  public NecesidadMaterialDTO registrarNecesidad(NecesidadMaterialDTO necesidadMaterialDTO) {


	  
    return null;
  }

  @Override
  public QuejaDTO agregarQueja(QuejaDTO quejaDTO) throws NoSuchElementException {
   if (this.donadoresRepository.findById(quejaDTO.id()).isPresent()) {
      throw new DonadorYaExistenteException("Ya existe una Quja con ese ID");
   }

      val queja = quejasDataMapper.toDonador(donadorDTO);

    val quejaGuardada = this.quejasRepository.save(donador);

    return quejasDataMapper.toQuejaDTO(donadorGuardado);
	  
	  return quejaDTO;
  }

  @Override
  public List<NecesidadMaterialDTO> obtenerNecesidadesInsatisfechasDe(
      String productoSolicitadoId)
	{
		
    EntidadBeneficaDTO entidadBenefica = buscarEntidadPorID(productoSolicitado.getId);
    val listaNecesidadMaterales = entidadBenefica.getId();.

		
    return List.of();
  }

  @Override
  public DonacionDTO registrarDonacion(DonacionDTO donacionDTO) {
	  
	  
	  return null;
  }
  
  @Override
  public DonacionDTO buscarDonacionPorID(String donacionID) throws NoSuchElementException
  
  {
	  
	  return null;
  }
	
}
