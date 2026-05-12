package ar.edu.utn.dds.k3003.servicez;


private DonacionController donacionController;


public class DonacionService()
{

public List<QuejasDTO> obtenerQuejasDe(DonadorDTO donadorDTO){
  
val listaDeQuejas = this.donacionController.obtenerQuejasDe(donadorDTO);
return listaDeQuejas;
  
}

public NecesidadMaterialDTO registrarNecesidadMaterial(NecesidadMaterialDTO){
   
  return this.donacionController.registrarNecesidadMaterial(necesidadMaterialDTO);

}

public EntidadBeneficaDTO guardarNecesidadMaterial(EntidadBeneficaDTO entidadBeneficaDTO,NecesidadMaterialDTO necesidadMaterialDTO){
  
  return this.donacionController.guardarNecesidadMaterial(entidadBeneficaDTO,NecesidadMaterialDTO);

}

public EntidadBeneficaDTO buscarEntidadPorId(String id){
    
  return this.donacionController.buscarEntidadPorId(id);
    
}




}





