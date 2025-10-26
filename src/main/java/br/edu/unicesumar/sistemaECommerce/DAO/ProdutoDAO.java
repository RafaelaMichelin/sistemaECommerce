package br.edu.unicesumar.sistemaECommerce.DAO;


import br.edu.unicesumar.sistemaECommerce.model.Produto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.util.List;

public class ProdutoDAO extends DAO<Produto> {
    
    public List<Produto> listAllProdutos() {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Produto> query = em.createQuery("SELECT p FROM Produto p", Produto.class);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            em.close();
        }
    }
}
