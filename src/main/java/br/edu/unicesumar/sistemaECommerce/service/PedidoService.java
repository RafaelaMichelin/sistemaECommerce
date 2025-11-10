package br.edu.unicesumar.sistemaECommerce.service;
import br.edu.unicesumar.sistemaECommerce.DAO.PedidoDAO;
import br.edu.unicesumar.sistemaECommerce.model.Pedido;
import br.edu.unicesumar.sistemaECommerce.enumerate.StatusPedido;

public class PedidoService {

    private PedidoDAO pedidoDAO;

    public PedidoService(){
        pedidoDAO = new PedidoDAO();

    }

     public void savePedido(Pedido pedido){
       
           if (pedido.getCliente() == null) {
            System.out.println("Erro: o pedido precisa estar associado a um cliente!");
            return;
        }

        if (pedido.getValorTotal() <= 0) {
            System.out.println("Erro: valor total inválido!");
            return;
        }

        pedidoDAO.save(pedido);
        System.out.println("Pedido salvo com sucesso!");

        }

     public void updateStatus(Pedido pedido, StatusPedido novoStatusPedido){

          if (pedido == null) {
            System.out.println("Erro: Pedido inválido");
            return;
        }

        //condição, se o status do pedido estiver como entregue, então:
        if (pedido.getStatusPedido() == StatusPedido.ENTREGUE){
        System.out.println("Não é possível alterar o status deste pedido!");
        return;
    }
        pedido.setStatusPedido(novoStatusPedido);
        pedidoDAO.update(pedido);
        System.out.println(" Status do Pedido atualizado com sucesso para: "+novoStatusPedido);

     }

     //deletar
     public void deletePedido(Pedido pedido){
        pedidoDAO.delete(pedido);
     }
    
}
