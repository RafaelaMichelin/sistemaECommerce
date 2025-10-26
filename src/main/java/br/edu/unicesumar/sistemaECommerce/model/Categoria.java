package br.edu.unicesumar.sistemaECommerce.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="categoria_tbl")

public class Categoria {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO )
	@Column(name="id_categoria")
    private int id;

    @Column(name="nome_categoria")
    private String nome;
    
    //constructor 

    public Categoria(){}

     public Categoria(int id, String nome){
        this.id = id;
        this.nome = nome;
     }
//getters e setters
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
}
