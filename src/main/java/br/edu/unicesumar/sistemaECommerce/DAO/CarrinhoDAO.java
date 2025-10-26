package br.edu.unicesumar.sistemaECommerce.DAO;

import br.edu.unicesumar.sistemaECommerce.model.Carrinho;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.util.List;

public class CarrinhoDAO extends DAO<Carrinho>{

    public List<Carrinho> listAllCarrinhos() {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Carrinho> query = em.createQuery("SELECT c FROM Carrinho c", Carrinho.class);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            em.close();
        }
    }
    
}
