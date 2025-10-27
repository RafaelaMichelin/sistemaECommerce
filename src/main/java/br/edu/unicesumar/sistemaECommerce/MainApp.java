package br.edu.unicesumar.sistemaECommerce;

import br.edu.unicesumar.sistemaECommerce.DAO.CategoriaDAO;
import br.edu.unicesumar.sistemaECommerce.DAO.ProdutoDAO;
import br.edu.unicesumar.sistemaECommerce.DAO.ClienteDAO;
import br.edu.unicesumar.sistemaECommerce.DAO.CarrinhoDAO;
import br.edu.unicesumar.sistemaECommerce.DAO.DAO;
import br.edu.unicesumar.sistemaECommerce.model.Categoria;
import br.edu.unicesumar.sistemaECommerce.model.Produto;
import br.edu.unicesumar.sistemaECommerce.model.Cliente;
import br.edu.unicesumar.sistemaECommerce.model.Pedido;
import br.edu.unicesumar.sistemaECommerce.model.Carrinho;

public class MainApp {
    public static void main(String[] args) {

        System.out.println(" Iniciando teste de persistência...");

        try {
            // Criando uma categoria
            Categoria categoria = new Categoria();
            categoria.setNome("Papelaria");
          

            // Criando um produto
            Produto produto = new Produto();
            produto.setNome("Lápis ");
            produto.setDescricao("Lápis de cor");
            produto.setPreco(10.00);

            //Criando um Cliente 
            Cliente cliente = new Cliente();
            cliente.setNome("Renan");
            cliente.setEmail("Renan@gmail.com");
           


            // Instanciando DAOs
            CategoriaDAO categoriaDAO = new CategoriaDAO();
            ProdutoDAO produtoDAO = new ProdutoDAO();
            ClienteDAO clienteDAO = new ClienteDAO();

            // Salvando no banco
            categoriaDAO.save(categoria);
            produtoDAO.save(produto);
            clienteDAO.save(cliente);

          

            System.out.println("\n Conexão e persistência bem-sucedidas!");
        } catch (Exception e) {
            System.out.println(" Erro ao testar persistência:");
            e.printStackTrace();
        } finally {
            DAO.closeFactory();
        }
    }
}

