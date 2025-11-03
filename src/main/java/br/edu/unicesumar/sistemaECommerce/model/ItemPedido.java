package br.edu.unicesumar.sistemaECommerce.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn; 
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table; 

@Entity
@Table(name="itempedido_tbl")

public class ItemPedido {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long id;




    
	@ManyToOne
    @JoinColumn(name = "id_produto")
    private Produto produto;

    @Column(name="quantiade_pedido")
     private int quantidade;


     //CONSTRUCTOR 

     public ItemPedido(){}

     public ItemPedido(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
     }

     public Long getId(){
          return id;
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
