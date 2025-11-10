package br.edu.unicesumar.sistemaECommerce.service;
import br.edu.unicesumar.sistemaECommerce.utils.Utils;
import br.edu.unicesumar.sistemaECommerce.DAO.ClienteDAO;
import br.edu.unicesumar.sistemaECommerce.model.Cliente;

public class ClienteService {
    
    private ClienteDAO ClienteDAO;

    public ClienteService(){
        ClienteDAO = new ClienteDAO();

    }
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

}
