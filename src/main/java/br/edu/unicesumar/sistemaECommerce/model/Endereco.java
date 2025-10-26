package br.edu.unicesumar.sistemaECommerce.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable; 

//utilizando um objeto embutido
@Embeddable
public class Endereco {
    
    @Column(name="logradouro")
    private String logradouro;

    @Column(name="numero")
    private String numero;

    @Column(name="bairro")
    private String bairro;

    @Column(name="cidade")
    private String cidade;

    @Column(name="estado")
    private String estado;

    @Column(name="CEP")
    private String cep;
 
//CONSTRUCTOR
    public Endereco(){}

    public Endereco(String logradouro, String numero, String bairro, String cidade, String estado, String cep){
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }


    //GETTERS E SETTERS
    public String getLogradouro(){
        return this.logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero(){
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro(){
        return this.bairro;
    }

    public void setBairro(String bairro) {
        this.bairro= bairro;
    }

    public String getCidade(){
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade= cidade;
    }

    public String getEstado(){
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado= estado;
    }

    public String getCep(){
        return this.cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

}
