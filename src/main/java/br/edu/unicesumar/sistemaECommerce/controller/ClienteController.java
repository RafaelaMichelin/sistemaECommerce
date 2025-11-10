package br.edu.unicesumar.sistemaECommerce.controller;
import br.edu.unicesumar.sistemaECommerce.model.Cliente; 
import br.edu.unicesumar.sistemaECommerce.service.ClienteService;
import javafx.scene.control.Label;
import javafx.fxml.FXML;

public class ClienteController {

    @FXML
    private Label label;

    ClienteService clienteService = new ClienteService();
    //método
    @FXML
    public void saveCliente(){

        Cliente c = new Cliente();{
            c.setNome("");
            c.setCpf("");
            c.setEmail("");
          

            clienteService.saveCliente(c);
 
        }
    }

    @FXML
  public void updateCliente() {
    Cliente c = new Cliente();
    c.setId(1);
    c.setNome("");
    c.setCpf("");
    c.setEmail("");

    clienteService.updateCliente(c);

    label.setText("Cliente atualizado com sucesso!");
}

//Deletar
 @FXML
public void deleteCliente() {
    Cliente c = new Cliente();
    c.setId(1); 

    clienteService.deleteCliente(c);

    label.setText("Cliente removido com sucesso!");
}
} 
