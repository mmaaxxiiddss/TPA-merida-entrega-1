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
	private QuejasRepository quejasRepository;
	private QuejaDataMapper quejasDataMapper;
	private DonacionDataMapper donacionDataMapper;
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
	  this.quejasRepository = new InMemoryQuejasRepo();
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
  public DonadorDTO modificarCategoria(String donadorID, String categoria)
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
  public void setFachadaIncentivos(FachadaIncentivos fachadaIncentivos) {
	
  }

  @Override
  public Boolean puedeDonar(String donadorID) throws NoSuchElementException {
      val donador = donadoresRepository.findById(donadorID);
	  DonadorDTO = this.donadonadoresYEntidadesDataMapper.toDonadorDTO(donador);
  
	  val quejas = obtenerQuejasDe(donadorId)
	  if(quejas.isNotEmpty)return false;
	
    return true;
  }

  @Override
  public List<QuejaDTO> obtenerQuejasDe(String donadorID) throws NoSuchElementException {
      DonadorDTO donadorDTO = buscarDonadorPorId(donadorID);
	  if(donador = null)trhow new DonadorNoEncontradoException("");
	  List<QuejaDTO> quejas = donacionService.obtenerQuejasDe(donadorDTO);
	  
    return quejas;
  }

  @Override
  public NecesidadMaterialDTO satisfacerNecesidad(String necesidadID, Integer cantidad)
      throws NoSuchElementException {
		  
   
		  
		 
	 
	
		  
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
  
	  return this.donacionService.buscarEntidadPorId(entidadId);
  }

  @Override
  public NecesidadMaterialDTO registrarNecesidad(NecesidadMaterialDTO necesidadMaterialDTO) {
	  
    return this.donacionService.registrarNecesidad(necesidadMaterialDTO);

}

  @Override
  public QuejaDTO agregarQueja(QuejaDTO quejaDTO) throws NoSuchElementException {
  
	  if (this.quejasRepository.findById(quejaDTO.id().isPresent()) {
      throw new QuejaYaExistenteException("Ya existe una Queja con ese ID");
   }

    val queja = quejasDataMapper.toQueja(quejaDTO);
    val quejaGuardada = this.quejasRepository.save(queja);

    return quejasDataMapper.toQuejaDTO(quejaGuardada);
	
  }

  @Override
  public List<NecesidadMaterialDTO> obtenerNecesidadesInsatisfechasDe(EntidadBeneficaDTO entidadBeneficaDTO,String productoSolicitadoId)
	{
    List<NecesidadMaterialDTO> lista = donacionService.obtenerNecesidadesInsatisfechasDe(entidadBeneficaDTO,productoSolicitadoId);
    return lista;
    }

  @Override
  public DonacionDTO registrarDonacion(DonacionDTO donacionDTO) {
	  
	   return this.donacionService.registrarDonacion(donacionDTO);
	  
	  
  }
  
  @Override
  public DonacionDTO buscarDonacionPorID(String donacionId) throws NoSuchElementException
  {
	  
	  return this.donacionService.buscarDonacionPorId(donacionId);
  }
	
}
