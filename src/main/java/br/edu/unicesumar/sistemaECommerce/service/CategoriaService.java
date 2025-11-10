package br.edu.unicesumar.sistemaECommerce.service;
import br.edu.unicesumar.sistemaECommerce.DAO.CategoriaDAO;
import br.edu.unicesumar.sistemaECommerce.model.Categoria;

public class CategoriaService {
    
    private CategoriaDAO categoriaDAO;


    //construtor
    public CategoriaService(){
        categoriaDAO = new CategoriaDAO();
    }

    public void saveCategoria(Categoria categoria){
        if(categoria.getNome() == null || categoria.getNome().isEmpty()){
            return;
        }

        categoriaDAO.save(categoria);
    }

    public void updateCategoria(Categoria categoria){
        categoriaDAO.update(categoria);
    }

    public void deleteCategoria(Categoria categoria){
        categoriaDAO.delete(categoria);
    }
}
