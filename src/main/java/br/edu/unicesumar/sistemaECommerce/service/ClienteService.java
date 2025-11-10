package br.edu.unicesumar.sistemaECommerce.service;
import br.edu.unicesumar.sistemaECommerce.utils.Utils;
import br.edu.unicesumar.sistemaECommerce.DAO.ClienteDAO;
import br.edu.unicesumar.sistemaECommerce.model.Cliente;
import java.util.List;

public class ClienteService {
    
    private ClienteDAO ClienteDAO;

    public ClienteService(){
        ClienteDAO = new ClienteDAO();

    }
    //save
    public void saveCliente(Cliente cliente){
        if(cliente.getNome() == null || cliente.getNome().isEmpty()){
            return;
        }

         if(cliente.getCpf() == null || cliente.getCpf().isEmpty()){
            return;
        }
      //NEGANDO O CPF INVÁLIDO  
        if(!Utils.validarCPF(cliente.getCpf())){
            return;
        }

        ClienteDAO.save(cliente);
    }

    //update
    public void updateCliente(Cliente cliente){
        if(cliente.getNome() == null || cliente.getNome().isEmpty()){
         return;
    }
        ClienteDAO.update(cliente);
}

    //delete 
       public void deleteCliente(Cliente cliente) {
        ClienteDAO.delete(cliente);
    }

    //Listar clientes 
      public List<Cliente> listarClientes() {
        return ClienteDAO.listAllClientes();
    }

}
