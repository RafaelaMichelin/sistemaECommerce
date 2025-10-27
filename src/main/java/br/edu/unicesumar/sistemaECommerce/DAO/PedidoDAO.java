package br.edu.unicesumar.sistemaECommerce.DAO;
import java.util.List;

import br.edu.unicesumar.sistemaECommerce.model.Pedido;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.EntityManager; 

public class PedidoDAO extends DAO<Pedido> {
     public List<Pedido> listAllCPedidos(){

        EntityManager em = null;
        try {

            em = getEntityManager();
            TypedQuery<Pedido> query = em.createQuery("SELECT p FROM Pedido p",Pedido.class);

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
