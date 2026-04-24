package ar.edu.utn.dds.k3003.servicez;


private DonacionController donacionController;


public class DonacionService()
{

public List<QuejasDTO> obtenerQuejasDe(DonadorDTO donadorDTO){
  val listaDeQuejas = this.donacionController.obtenerQuejasDe(donadorDTO.Id);
return null;
}

public NecesidadMaterialDTO registratNecesidadMaterial(NecesidadMaterialDTO){
  
  val necesidadMaterial = this.donacionController.registrarNecesidadMaterial(necesidadMaterialDTO)
  return necesidadMaterial;

}

public NecesidadMaterialDTO guardarNecesidadMaterial(NecesidadMaterialDTO necesidadMaterial){
  val necesidadMaterial = this.donacionController.guardarNecesidadMaterial(necesidadMaterialDTO)
  return necesidadMaterial;
  }

public EntidadBeneficaDTO buscarEntidadPorId(){
    return this.donacionController.buscarEntidadPorId();
    
  }
}
