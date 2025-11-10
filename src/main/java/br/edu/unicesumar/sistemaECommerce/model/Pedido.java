package br.edu.unicesumar.sistemaECommerce.model;

import java.util.List;
import br.edu.unicesumar.sistemaECommerce.enumerate.StatusPedido;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;


@Entity
@Table(name="pedido_tbl")

public class Pedido {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long id;


    //Relação com Cliente 
	@ManyToOne 
    //Coluna que faz o vinculo entre pedido e cliente        //*FK
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    //Relação com ItemPedido, um pedido tem vários itens
   @OneToMany(cascade = CascadeType.ALL)
   @JoinColumn(name="id_pedido")

   //Vinculo LISTA, porque vai retornar muitas informações
    private List<ItemPedido> itens;

 @Column(name="valor_total")
 private double valorTotal;
    
//*STATUS DO PEDIDO */
 @Enumerated(EnumType.STRING)
    @Column(name="status_pedido")
    private StatusPedido statusPedido;

//Constructor
 public Pedido() {}

    public Pedido(Cliente cliente, List<ItemPedido> itens, double valorTotal, StatusPedido statusPedido) {
        this.cliente = cliente;
        this.itens = itens;
        this.valorTotal = valorTotal;
        this.statusPedido = statusPedido;
    }

//GETTERS E SETTERS
      public Long getId() {
        return id;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }


    public List<ItemPedido> getItens(){
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }


       public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }


    public StatusPedido getStatusPedido(){
        return statusPedido;
    }

    public void setStatusPedido(StatusPedido statusPedido){
        this.statusPedido = statusPedido;
    }
}