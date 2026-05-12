package ar.edu.utn.dds.k3003.model;

import ar.edu.utn.dds.k3003.catedra.dtos.donacion.EstadoDonacionEnum;

public class Donacion {

    String id;
    String donadorID;
    String depositoID;
    String descripcion;
    String productoID;
    int cantidad;
    EstadoDonacionEnum estado;

    public Donacion(){
        super();
        
    }

    public String getId(){
        
    }
    public void setId(){
        this.id = id;
    }
    
    public String getDonadorId(){
       return donadorID;
    }
    
    public void setDonadorId(String depositoId){
        this.depositoID = depositoID;
    }


    
}
