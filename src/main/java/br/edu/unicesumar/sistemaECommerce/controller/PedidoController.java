package br.edu.unicesumar.sistemaECommerce.controller;

import br.edu.unicesumar.sistemaECommerce.enumerate.StatusPedido;
import br.edu.unicesumar.sistemaECommerce.model.Cliente;
import br.edu.unicesumar.sistemaECommerce.model.Pedido;
import br.edu.unicesumar.sistemaECommerce.service.PedidoService;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PedidoController {
    
    PedidoService pedidoService = new PedidoService();

  @FXML
public void savePedido() {
    Pedido pedido = new Pedido();
    pedido.setCliente(new Cliente());
    pedido.getCliente().setId(1);
    pedido.setValorTotal(150.00);
    pedido.setStatusPedido(StatusPedido.ABERTO);

    pedidoService.savePedido(pedido);
}

@FXML
public void updatePedido() {
    Pedido pedido = new Pedido();
    pedido.setCliente(new Cliente());
    pedido.getCliente().setId(1);
    pedido.setValorTotal(200.00);
    pedido.setStatusPedido(StatusPedido.ABERTO); 
    
    pedidoService.updateStatus(pedido, StatusPedido.PAGO);
}


@FXML
public void deletePedido() {
    Pedido pedido = new Pedido();
    pedido.setStatusPedido(StatusPedido.ABERTO);

    pedidoService.deletePedido(pedido);
}

}
