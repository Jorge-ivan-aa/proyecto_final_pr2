package co.edu.uniquindio.pizzeria.model;

public class Empleado extends Usuario {
  private String clave;

  public Empleado(String nombre, String clave) {
    super(nombre);
    this.clave = clave;
  }

  public String getClave() {
      return clave;
  }

  public void setClave(String clave) {
      this.clave = clave;
  }

}
