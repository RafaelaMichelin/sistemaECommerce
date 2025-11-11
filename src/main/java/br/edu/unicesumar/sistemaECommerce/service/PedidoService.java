package br.edu.unicesumar.sistemaECommerce.service;

import br.edu.unicesumar.sistemaECommerce.DAO.PedidoDAO;
import br.edu.unicesumar.sistemaECommerce.model.Pedido;
import br.edu.unicesumar.sistemaECommerce.enumerate.StatusPedido;

public class PedidoService {

    private PedidoDAO pedidoDAO;

    public PedidoService() {
        pedidoDAO = new PedidoDAO();
    }

    // SALVAR PEDIDO
    public void savePedido(Pedido pedido) {
        if (pedido.getCliente() == null) {
            System.out.println(" Erro: o pedido precisa estar associado a um cliente!");
            return;
        }

        if (pedido.getItens() == null || pedido.getItens().isEmpty()) {
            System.out.println(" Erro: o pedido deve conter ao menos um item!");
            return;
        }

        if (pedido.getValorTotal() <= 0) {
            System.out.println(" Erro: valor total inválido!");
            return;
        }

        if (pedido.getStatusPedido() == null) {
            pedido.setStatusPedido(StatusPedido.ABERTO);
        }

        pedidoDAO.save(pedido);
        System.out.println("Pedido salvo com sucesso!");
    }

    // ATUALIZAR STATUS
    public void updateStatus(Pedido pedido, StatusPedido novoStatusPedido) {
        if (pedido == null) {
            System.out.println(" Erro: Pedido inválido!");
            return;
        }

        if (novoStatusPedido == null) {
            System.out.println(" Erro: novo status não informado!");
            return;
        }

        if (pedido.getStatusPedido() == StatusPedido.ENTREGUE ||
            pedido.getStatusPedido() == StatusPedido.PAGO) {
            System.out.println(" Não é possível alterar o status deste pedido, ele já foi finalizado!");
            return;
        }

        pedido.setStatusPedido(novoStatusPedido);
        pedidoDAO.update(pedido);
        System.out.println(" Status do Pedido atualizado com sucesso para: " + novoStatusPedido);
    }

    // DELETAR PEDIDO
    public void deletePedido(Pedido pedido) {
        if (pedido == null || pedido.getId() == null) {
            System.out.println(" Erro: é necessário informar um pedido válido para exclusão!");
            return;
        }

        if (pedido.getStatusPedido() == StatusPedido.ENTREGUE ||
            pedido.getStatusPedido() == StatusPedido.ENVIADO) {
            System.out.println(" Erro: não é permitido deletar um pedido já finalizado!");
            return;
        }

        pedidoDAO.delete(pedido);
        System.out.println(" Pedido removido com sucesso!");
    }
}

