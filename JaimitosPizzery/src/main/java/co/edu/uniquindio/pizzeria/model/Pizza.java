package co.edu.uniquindio.pizzeria.model;

import java.util.ArrayList;

public class Pizza extends Producto {
  private String tamano;
  private ArrayList<Ingrediente> ingredientes;

  public Pizza(String nombre, double precio, String tamano) {
    super(nombre, precio);
    this.tamano = tamano; 
    this.ingredientes = new ArrayList<>();
  }

  public String getTamano() {
      return tamano;
  }

  public void setTamano(String tamano) {
      this.tamano = tamano;
  }

  public ArrayList<Ingrediente> getIngredientes() {
      return ingredientes;
  }

  public void setIngredientes(Ingrediente ingrediente) {
      this.ingredientes.add(ingrediente);
  }

}
