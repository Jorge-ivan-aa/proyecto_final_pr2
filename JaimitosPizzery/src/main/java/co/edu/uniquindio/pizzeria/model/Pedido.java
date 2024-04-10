package co.edu.uniquindio.pizzeria.model;

import java.util.ArrayList;

public class Pedido {

    public enum Estado {
        ENTREGADO,
        PREPARANDO,
        CANCELADO

    }
    private Cliente cliente;
    private String detalles;
    private Estado estado;
    private ArrayList<Producto> listaProductoPedido;

    public Pedido() {
    }

    public Pedido(Cliente cliente, String detalles, Estado estado) {
        this.cliente = cliente;
        this.detalles = detalles;
        this.estado = estado;
        this.listaProductoPedido = new ArrayList<>();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public ArrayList<Producto> getListaProductoPedido() {
        return listaProductoPedido;
    }

    public void addProductoPedido(Producto producto) {
        this.listaProductoPedido.add(producto);
    }
}