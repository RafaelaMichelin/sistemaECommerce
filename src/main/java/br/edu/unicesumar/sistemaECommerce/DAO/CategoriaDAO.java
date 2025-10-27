package br.edu.unicesumar.sistemaECommerce.DAO;

import java.util.List;

import br.edu.unicesumar.sistemaECommerce.model.Categoria;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.EntityManager; 

public class CategoriaDAO extends DAO<Categoria> {
      public List<Categoria> listAllCategorias(){

        EntityManager em = null;
        try {

            em = getEntityManager();
            TypedQuery<Categoria> query = em.createQuery("SELECT c FROM Categoria c",Categoria.class);

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
