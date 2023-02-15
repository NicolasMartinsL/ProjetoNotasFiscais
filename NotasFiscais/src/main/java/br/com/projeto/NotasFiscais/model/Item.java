package br.com.projeto.NotasFiscais.model;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_item")
public class Item {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer id;
	public Integer numero;
	@OneToOne
	public Produto produtos;
	public	BigDecimal quantidade;
	public BigDecimal valor;
	
	
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
	public Produto getProdutos() {
		return produtos;
	}
	public void setProdutos(Produto produtos) {
		this.produtos = produtos;
	}
	public BigDecimal getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(BigDecimal quantidade) {
		this.quantidade = quantidade;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
}
