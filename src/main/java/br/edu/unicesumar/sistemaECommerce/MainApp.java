package br.edu.unicesumar.sistemaECommerce;

import br.edu.unicesumar.sistemaECommerce.DAO.CategoriaDAO;
import br.edu.unicesumar.sistemaECommerce.DAO.ClienteDAO;
import br.edu.unicesumar.sistemaECommerce.DAO.ProdutoDAO;
import br.edu.unicesumar.sistemaECommerce.DAO.DAO;
import br.edu.unicesumar.sistemaECommerce.DAO.ProdutoDAO;
import br.edu.unicesumar.sistemaECommerce.model.Categoria;
import br.edu.unicesumar.sistemaECommerce.model.Cliente;
import br.edu.unicesumar.sistemaECommerce.model.Produto;

public class MainApp {
    public static void main(String[] args) {

        System.out.println("Iniciando teste de persistência...");

        ProdutoDAO produtoDAO = new ProdutoDAO(); 

        try {
            // busca existente pelo id
            Produto produto = new Produto();
            produto.setId(102); 

            produtoDAO.delete(produto); // deletando

            System.out.println("\nProduto deletado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao testar persistência:");
            e.printStackTrace();
        } finally {
            DAO.closeFactory();
        }
    }
}


