package br.edu.unicesumar.sistemaECommerce.controller;
import br.edu.unicesumar.sistemaECommerce.model.Produto;
import br.edu.unicesumar.sistemaECommerce.service.ProdutoService;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ProdutoController {
    
      @FXML
    private Label label;

    ProdutoService produtoService = new ProdutoService();

    @FXML
    public void saveProduto(){
      
        Produto p = new Produto();{
              p.setNome(null);
              p.setPreco(30);
              p.setDescricao("");
              
              produtoService.saveProduto(p);
        }
    }

    @FXML
    public void updateProduto(){
        Produto p = new Produto();{
            p.setId(1);
            p.setNome("");
            p.setPreco(20);
            p.setDescricao("");



    produtoService.updateProduto(p);
    label.setText("Produto atualizado com sucesso!");
        }
    }

     @FXML
    public void deleteProduto() {
    Produto p = new Produto();
    p.setId(1); 

    produtoService.deleteProduto(p);

    label.setText("Produto removido com sucesso!");
}
}

