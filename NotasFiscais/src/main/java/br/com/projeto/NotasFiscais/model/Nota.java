package br.com.projeto.NotasFiscais.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_nota")
public class Nota {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer id;
	public	Integer numero;
	public String data;
	public Double valor;
	@ManyToOne
	public	Cliente cliente;
	//@Embedded
	@OneToOne
	public Item itens;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Item getItens() {
		return itens;
	}
	public void setItens(Item itens) {
		this.itens = itens;
	}

}
