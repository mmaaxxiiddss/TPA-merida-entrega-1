package ar.edu.utn.dds.k3003.servicez;


private DonacionController donacionController;


public class DonacionService()
{

List<QuejasDTO> obtenerQuejasDe(DonadorDTO donadorDTO){
  val listaDeQuejas = this.donacionController.obtenerQuejasDe(donadorDTO.Id);
return null;
}

NecesidadMaterialDTO registratNecesidadMaterial(NecesidadMaterialDTO){
  
  val necesidadMaterial = this.donacionController.registrarNecesidadMaterial(necesidadMaterialDTO)
  return necesidadMaterial;

}

NecesidadMaterialDTO guardarNecesidadMaterial(NecesidadMaterialDTO necesidadMaterial){
  val necesidadMaterial = this.donacionController.guardarNecesidadMaterial()
  return necesidadMaterial;
  }

}
