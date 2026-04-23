package ar.edu.utn.dds.k3003.model;

import ar.edu.utn.dds.k3003.catedra.dtos.donadoresYEntidades.EstadoDonadorEnum;

public class Donacion {

    String id;
    String donadorID;
    String depositoID;
    String descripcion;
    String productoID;
    int cantidad;
    EstadoDonacionEnum estado;
}
