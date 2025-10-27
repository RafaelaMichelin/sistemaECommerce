package br.edu.unicesumar.sistemaECommerce.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn; 
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="carrinho_tbl")

public class Carrinho {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long id;

	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="id_carrinho")


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
