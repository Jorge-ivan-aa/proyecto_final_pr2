package co.edu.uniquindio.pizzeria.model;

import java.util.ArrayList;

public class Cliente extends Usuario {

  private String direccion;
  private String celular;
  private ArrayList<Pedido> listaPedido;

  public Cliente(String nombre, String direccion, String celular) {
    super(nombre);
    this.direccion = direccion;
    this.celular = celular;
    this.listaPedido = new  ArrayList<>();
  }

  public String getDireccion() {
      return direccion;
  }

  public void setDireccion(String direccion) {
      this.direccion = direccion;
  }

  public String getCelular() {
      return celular;
  }

  public void setCelular(String celular) {
      this.celular = celular;
  }

  public ArrayList<Pedido> getListaPedido() {
        return listaPedido;
  }

  public  void addPedido(Pedido pedido) {
      this.listaPedido.add(pedido);
  }

}