package br.edu.unicesumar.sistemaECommerce.DAO;

import java.util.List;

import br.edu.unicesumar.sistemaECommerce.model.Cliente;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.EntityManager;


//herança
public class ClienteDAO extends DAO<Cliente>{
    //Listando todos os clientes

    public List<Cliente> listAllClientes(){

        EntityManager em = null;
        try {

            em = getEntityManager();
            TypedQuery<Cliente> query = em.createQuery("SELECT c FROM Cliente c",Cliente.class);
    return query.getResultList();
        } catch(Exception e){
            return null;
        }
        finally {
           
            if (em != null) {
                em.close();
            }
    }
}
}
