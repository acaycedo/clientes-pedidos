package com.andres.caycedo;

public class Main {
    public static void main(String[] args) {
       var clientes = new GestionClientes();

       clientes.registrarCliente("1","Andres");
       clientes.registrarCliente("2","Maria");
       clientes.registrarCliente("3","Fredy");


       var pedidos = new GestionPedidos(clientes);

       try {
        pedidos.crearPedido("1", "Panela", 1);
        pedidos.crearPedido("2", "Arroz", 5);
        pedidos.crearPedido("5", "Arroz", 5);
       } catch (PedidoInvalidoException e) {
        System.err.println("Ha ocurrido un error al gestionar el pedido \n" + e.getMessage());
       }
       System.out.println("Hasta Pronto");
       
    }
}