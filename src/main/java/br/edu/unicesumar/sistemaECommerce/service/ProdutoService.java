package br.edu.unicesumar.sistemaECommerce.service;

import br.edu.unicesumar.sistemaECommerce.DAO.ProdutoDAO;
import br.edu.unicesumar.sistemaECommerce.model.Produto;
import br.edu.unicesumar.sistemaECommerce.model.Produto;

public class ProdutoService {
    
    private ProdutoDAO produtoDAO;

    //construtor
    public ProdutoService(){
        produtoDAO = new ProdutoDAO();
    }

    //método save produto
    public void saveProduto(Produto produto){
        if(produto.getNome() == null || produto.getNome().isEmpty()){
            return;
        }

        produtoDAO.save(produto);
    }

    //update
    public void updateProduto(Produto produto){
        produtoDAO.update(produto);
}

    //delete 
     public void deleteProduto(Produto produto){
        produtoDAO.delete(produto);
}
    
}
