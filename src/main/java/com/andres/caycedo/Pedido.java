package com.andres.caycedo;

public class Pedido {

    private String clienteId;
    private String producto;
    private Integer cantidad;

    public Pedido(String clienteId, String producto, Integer cantidad) {
        this.clienteId = clienteId;
        this.producto = producto;
        this.cantidad = cantidad;
    }
    
    public String getClienteId() {
        return clienteId;
    }
    public String getProducto() {
        return producto;
    }
    public Integer getCantidad() {
        return cantidad;
    }
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    
}
