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
	public Integer idItem;
	
	public Integer numeroItem;
	@OneToOne
	public Produto produtosItem;
	public	BigDecimal quantidadeItem;
	public BigDecimal valorItem;
	
	
	public Integer getIdItem() {
		return idItem;
	}

	public void setIdItem(Integer idItem) {
		this.idItem = idItem;
	}

	public Integer getNumeroItem() {
		return numeroItem;
	}
	public void setNumeroItem(Integer numeroItem) {
		this.numeroItem = numeroItem;
	}
	public Produto getProdutosItem() {
		return produtosItem;
	}
	public void setProdutosItem(Produto produtosItem) {
		this.produtosItem = produtosItem;
	}
	public BigDecimal getQuantidadeItem() {
		return quantidadeItem;
	}
	public void setQuantidadeItem(BigDecimal quantidadeItem) {
		this.quantidadeItem = quantidadeItem;
	}
	public BigDecimal getValorItem() {
		return valorItem;
	}
	public void setValorItem(BigDecimal valorItem) {
		this.valorItem = valorItem;
	}
	
}
