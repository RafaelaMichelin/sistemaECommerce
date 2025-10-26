package br.edu.unicesumar.sistemaECommerce.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table; 
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;


@Entity
@Table(name="itemcarrinho_tbl")

public class ItemCarrinho {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO )

	@ManyToOne
    @JoinColumn(name = "id_produto")
    private Produto produto;

    @Column(name="quantiade_carrinho")
     private int quantidade;


     //CONSTRUCTOR 

     public ItemCarrinho(){}

     public ItemCarrinho(Produto protudo, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
     }

       public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

     public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


}
