package ar.edu.utn.dds.k3003.controllers;

private Fachada fachada;


public class DonacionController{

    public List<QuejasDTO> obtenerQuejasDe(DonadorDTO donadorDTO){
  
    val listaDeQuejas = this.fachada.quejaRepository.findById(donadorDTO.getId());
    List<Queja> lista = new ArrayList<>();
        for(val que -> listaDeQuejas){
            lista.add(this.fachada.quejaDataMapper.toQuejaDTO(que));
        }
    return lista;
  
    }

    public NecesidadMaterialDTO registrarNecesidadMaterial(EntidadBeneficaDTO entidadBeneficaDTO,NecesidadMaterialDTO necesidadMaterialDTO){
        entidadBeneficaDTO.getNecesidades().add(necesidadMaterialDTO);
        val entidad = fachada.entidadDataMapper.toEntidadBenefica(entidadBeneficaDTO);
        val entidadGuardada = this.fachada.entidadBeneficaRepository.save(entidad);
        
        return fachada.entidadDataMapper.toEntidadBeneficaDTO(entidadGuardada);

      }


    
  
}
