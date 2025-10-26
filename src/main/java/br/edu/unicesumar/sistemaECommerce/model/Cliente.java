package br.edu.unicesumar.sistemaECommerce.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Embedded;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//INFORMAR PARA O JPA QUE ESTE OBJETO É UMA TABELA NO BD
@Entity
@Table(name="cliente_tbl")

public class Cliente {

    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO )
	@Column(name="id_cliente")
    private int id;

    @Column(name="nome_cliente")
    private String nome;
     
    @Column(name="cpf_cliente", nullable = false)
    private String cpf;

    @Column(name="email_cliente")
    private String email;


    //Referenciar a classe Endereco
    @Embedded
    private Endereco endereco;


    //CONSTRUCTOR 
    public Cliente(){}

    public Cliente(int id, String nome, String cpf, String email, Endereco endereco){
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
    }

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

    public String getCpf(){
        return this.cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }
    
    
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
}
