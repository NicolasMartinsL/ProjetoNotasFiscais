package br.com.projeto.NotasFiscais.model;

import java.math.BigDecimal;

public class Produtos {
	
	public Integer idProduto;
	public Integer codigoProduto;
	public String descricaoProduto;
	public BigDecimal valorProduto;
	
	public Produtos(Produto produtos) {
		this.idProduto = produtos.getIdProduto();
		this.codigoProduto = produtos.getCodigoProduto();
		this.descricaoProduto = produtos.getDescricaoProduto();
		this.valorProduto = produtos.getValorProduto();
	}
	
	public Integer getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}
	public Integer getCodigoProduto() {
		return codigoProduto;
	}
	public void setCodigoProduto(Integer codigoProduto) {
		this.codigoProduto = codigoProduto;
	}
	public String getDescricaoProduto() {
		return descricaoProduto;
	}
	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}
	public BigDecimal getValorProduto() {
		return valorProduto;
	}
	public void setValorProduto(BigDecimal valorProduto) {
		this.valorProduto = valorProduto;
	}
	
}
