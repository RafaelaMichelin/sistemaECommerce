package br.edu.unicesumar.sistemaECommerce;

import br.edu.unicesumar.sistemaECommerce.DAO.CategoriaDAO;
import br.edu.unicesumar.sistemaECommerce.DAO.ProdutoDAO;
import br.edu.unicesumar.sistemaECommerce.DAO.DAO;
import br.edu.unicesumar.sistemaECommerce.model.Categoria;
import br.edu.unicesumar.sistemaECommerce.model.Produto;
import br.edu.unicesumar.sistemaECommerce.model.Cliente;
import br.edu.unicesumar.sistemaECommerce.model.Pedido;


public class MainApp {
    public static void main(String[] args) {

        System.out.println(" Iniciando teste de persistência...");

        try {
            // Criando uma categoria
            Categoria categoria = new Categoria();
            categoria.setNome("Eletrônicos");

            // Criando um produto
            Produto produto = new Produto();
            produto.setNome("Notebook ");
            produto.setPreco(4999.99);
           

            // Instanciando DAOs
            CategoriaDAO categoriaDAO = new CategoriaDAO();
            ProdutoDAO produtoDAO = new ProdutoDAO();

            // Salvando no banco
            categoriaDAO.save(categoria);
            produtoDAO.save(produto);

            // Listando produtos
            System.out.println("\nProdutos cadastrados:");
            for (Produto p : produtoDAO.listAllProdutos()) {
                System.out.println("- " + p.getNome() + " | R$ " + p.getPreco());
            }

            System.out.println("\n Conexão e persistência bem-sucedidas!");
        } catch (Exception e) {
            System.out.println(" Erro ao testar persistência:");
            e.printStackTrace();
        } finally {
            DAO.closeFactory();
        }
    }
}

