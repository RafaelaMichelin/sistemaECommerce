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

    
}
