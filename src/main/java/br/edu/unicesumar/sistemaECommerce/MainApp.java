package br.edu.unicesumar.sistemaECommerce;

import br.edu.unicesumar.sistemaECommerce.DAO.CategoriaDAO;
import br.edu.unicesumar.sistemaECommerce.DAO.ClienteDAO;
import br.edu.unicesumar.sistemaECommerce.DAO.DAO;
import br.edu.unicesumar.sistemaECommerce.DAO.ProdutoDAO;
import br.edu.unicesumar.sistemaECommerce.model.Categoria;
import br.edu.unicesumar.sistemaECommerce.model.Cliente;
import br.edu.unicesumar.sistemaECommerce.model.Produto;

public class MainApp {
    public static void main(String[] args) {

        System.out.println("Iniciando teste de persistência...");

        ClienteDAO clienteDAO = new ClienteDAO(); 

        try {
            // buscar cliente existente pelo id
            Cliente cliente = new Cliente();
            cliente.setId(1); 

            clienteDAO.delete(cliente); // deletando

            System.out.println("\nCliente deletado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao testar persistência:");
            e.printStackTrace();
        } finally {
            DAO.closeFactory();
        }
    }
}


