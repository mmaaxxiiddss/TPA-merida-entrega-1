package ar.edu.utn.dds.k3003.model;

public class NecesidadMaterial {
  
  private int Id;
  private String entidadId;
  private int nivelDeUrgencia;
  private String descripcion;
  private String productoSolicitadoID;
  private int cantidadObjetivo;
  private Enum tipoNecesidadEnum;
  
  public String getId() {
    return id;
  }

  public void setNivelDeUrgencia(String nivelDeUrgencia) {
    this.nivelDeUrgencia = nivelDeUrgencia;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }





}
