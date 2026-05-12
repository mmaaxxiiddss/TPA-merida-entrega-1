package ar.edu.utn.dds.k3003.model;

public class EntidadBenefica {
  
  private String Id;
  private String razonSocial;
  private String domicilio;
  private String telefono;
  private String correo;

}

public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

public String getRazonSocial() {
    return razonSocial;
  }

  public void setRazonSocial()(String razonSocial) {
    this.razon = razonSocial;
  }

  public String getDomicilio() {
    return domicilio;
  }

  public void setDomicilio(String domicilio) {
    this.domicilio = domicilio;
}

public String getTelefono(){
    return telefono;
}

public void setTelefono(String telefono){
  this.telefono = telefono;
  }

public List<NecesidadMaterial> getNecesidades(){
     return necesidades;
}

}
