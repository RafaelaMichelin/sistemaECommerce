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
        CategoriaDAO categoriaDAO = new CategoriaDAO();

        try {
            // busca existente pelo id
            Categoria categoria = new Categoria();
            categoria.setId(52); 

            categoriaDAO.delete(categoria); // deletando

            System.out.println("\nCategoria deletada com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao testar persistência:");
            e.printStackTrace();
        } finally {
            DAO.closeFactory();
        }
    }
}


