package br.edu.unicesumar.sistemaECommerce.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn; 
import jakarta.persistence.ManyToOne;



@Entity
@Table(name="produto_tbl")

public class Produto {

    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO )
	@Column(name="id_produto")
    private int id;

    @Column(name="nome_produto")
    private String nome;

    @Column(name="descricao_produto")
    private String descricao;

    @Column (name="preco_produto")
    private double preco;
 
    //Relação: Muitos para um entre produto e categoria
 	@ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;

  //CONSTRUCTOR 
    public Produto(){}

    public Produto(int id, String nome, String descricao, double preco, Categoria categoria){
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
    }

    //GETTERS E SETTERS
     public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public double getPreco(){
        return this.preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }

    public Categoria getCategoria(){
        return this.categoria;
    }
    public void setCategoria(Categoria categoria){
        this.categoria = categoria;
    }
}
