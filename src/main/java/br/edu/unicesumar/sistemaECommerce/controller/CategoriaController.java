package br.edu.unicesumar.sistemaECommerce.controller;

import br.edu.unicesumar.sistemaECommerce.model.Categoria;
import br.edu.unicesumar.sistemaECommerce.service.CategoriaService;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CategoriaController {
    
    @FXML
    private Label label;

    CategoriaService categoriaService = new CategoriaService();

    @FXML
    public void saveCategoria(){
      
        Categoria c = new Categoria();{
              c.setNome(null);
              
              categoriaService.saveCategoria(c);
        }
    }

    @FXML
    public void updateCategoria(){
        Categoria c = new Categoria();{
            c.setId(1);
            c.setNome("");

    categoriaService.updateCategoria(c);
    label.setText("Categoria atualizado com sucesso!");
        }
    }

     @FXML
    public void deleteCategoria() {
    Categoria c = new Categoria();
    c.setId(1); 

    categoriaService.deleteCategoria(c);

    label.setText("Categoria removida com sucesso!");
}
}
