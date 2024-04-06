package co.edu.uniquindio.pizzeria.model;

public class Cliente extends Usuario {

  private String dirección;
  private String celular;

  public Cliente(String nombre, String dirección, String celular) {
    super(nombre);
    this.dirección = dirección;
    this.celular = celular;
  }

  public String getDirección() {
      return dirección;
  }

  public void setDirección(String dirección) {
      this.dirección = dirección;
  }

  public String getCelular() {
      return celular;
  }

  public void setCelular(String celular) {
      this.celular = celular;
  }

}
