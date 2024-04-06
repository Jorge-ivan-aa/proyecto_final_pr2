package co.edu.uniquindio.pizzeria.model;

import javafx.scene.control.cell.PropertyValueFactory;

public class Bebida extends Producto {
  
  private String contenido;
  private String tipo;

  public Bebida(String nombre, double precio, String contenido, String tipo) {
    super(nombre, precio);
    this.contenido = contenido;
    this.tipo = tipo;
  }

  public String getContenido() {
      return contenido;
  }

  public void setContenido(String contenido) {
      this.contenido = contenido;
  }

  public String getTipo() {
      return tipo;
  }

  public void setTipo(String tipo) {
      this.tipo = tipo;
  }
}
