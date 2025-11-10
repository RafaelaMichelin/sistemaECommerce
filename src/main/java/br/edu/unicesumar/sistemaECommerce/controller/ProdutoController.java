package br.edu.unicesumar.sistemaECommerce.controller;
import br.edu.unicesumar.sistemaECommerce.model.Produto;
import br.edu.unicesumar.sistemaECommerce.service.ProdutoService;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ProdutoController {
    
     @FXML
    private Label label;

    ProdutoService produtoService = new ProdutoService();
    //método
    @FXML
    public void saveProduto(){

        Produto p = new Produto();{
            p.setNome("");
            p.setDescricao("");
            p.setPreco(12);
        
            produtoService.saveProduto(p);
 
        }
    }

    @FXML
  public void updateProduto() {
    Produto p = new Produto();
    if( p != null){
    p.setId(1);
    p.setNome("");
    p.setPreco(15);
    p.setDescricao("");

    produtoService.updateProduto(p);
    label.setText("Produto atualizado com sucesso!");
}
    else{
        label.setText("Produto não encontrado");
}
  }

//Deletar
 @FXML
public void deleteProduto() {
    Produto p = new Produto();
    if( p != null){

    produtoService.deleteProduto(p);
    label.setText("Produto removido com sucesso!");
    }
    else{
        label.setText("Produto não encontrado");
    }
   

}
}
