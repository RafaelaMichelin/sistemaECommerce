package br.edu.unicesumar.sistemaECommerce.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table; 
import jakarta.persistence.OneToMany;
import jakarta.persistence.JoinColumn;  
import jakarta.persistence.CascadeType;
import java.util.List;
import java.util.ArrayList;

@Entity
@Table(name="carrinho_tbl")

public class Carrinho {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long id;

	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="carrinho_id")


    private List<ItemCarrinho> itens;
 
    public Carrinho(){}

    public Carrinho(List<ItemCarrinho>itens){
        this.itens = itens;
    }

     public Long getId() {
         return id; 
    }

    public List<ItemCarrinho> getItens() {
         return itens; 
    }
    public void setItens(List<ItemCarrinho> itens) {
         this.itens = itens; 
    }

    // Adicionar item
    public void adicionarItem(ItemCarrinho item) {
        this.itens.add(item);
    }
}
