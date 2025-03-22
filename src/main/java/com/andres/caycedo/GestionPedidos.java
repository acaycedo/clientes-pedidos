package com.andres.caycedo;

import java.util.ArrayList;
import java.util.List;

public class GestionPedidos {

    private List<Pedido> pedidos;
    private GestionClientes clientes;

    public GestionPedidos(GestionClientes clientes) {
        pedidos = new ArrayList<>();
        this.clientes = clientes;
    }

    public void crearPedido(String clienteId, String producto, int cantidad) throws PedidoInvalidoException {

        try {
            var cliente = clientes.buscarCliente(clienteId);
        } catch (ClienteNoEncontradoException e) {
            throw new PedidoInvalidoException("El cliente no existe");
        }

        if (producto.isEmpty()) {
            throw new PedidoInvalidoException("El producto no puede estar vacio.");

        }

        if (cantidad <= 0) {
            throw new PedidoInvalidoException("La cantidad no es valida.");

        }
        var pedido = new Pedido(clienteId, producto, cantidad);
        pedidos.add(pedido);

    }

    public Pedido buscarPedido(String clienteId, String producto) throws ClienteNoEncontradoException {
        var cliente = clientes.buscarCliente(clienteId);


        for (var pedido : pedidos) {
            if (pedido.getClienteId().equals(clienteId) && pedido.getProducto().equals(producto)) {
                return pedido;
            }
        }
        throw new ClienteNoEncontradoException("Cliente no encontrado con el ID: " + clienteId);
    }
}
