package br.com.projeto.NotasFiscais.model;

import java.math.BigDecimal;


public class Itens {

	public Integer idItem;	
	public Integer numeroItem;
	public Produto produtosItem;
	public	BigDecimal quantidadeItem;
	public BigDecimal valorItem;
	
	public Itens(Item itens) {
		this.idItem = itens.getIdItem();
		this.numeroItem = itens.getNumeroItem();
		this.produtosItem = itens.getProdutosItem();
		this.quantidadeItem = itens.getQuantidadeItem();
		this.valorItem = itens.getValorItem();
	}
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
