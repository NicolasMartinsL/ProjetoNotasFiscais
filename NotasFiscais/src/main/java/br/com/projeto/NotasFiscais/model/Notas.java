package br.com.projeto.NotasFiscais.model;

public class Notas {

	public Integer idNotas;	
	public	Integer numeroNota;
	public String dataNota;
	public Double valorNota;
	public	Cliente clienteNota;
	public Item itensNota;
	
	public Notas(Nota notas) {
		this.idNotas = notas.getIdNotas();
		this.numeroNota = notas.getNumeroNota();
		this.dataNota = notas.getDataNota();
		this.valorNota = notas.getValorNota();
		this.clienteNota = notas.getClienteNota();
		this.itensNota = notas.getItensNota();
	}
	
	public Integer getIdNotas() {
		return idNotas;
	}
	public void setIdNotas(Integer idNotas) {
		this.idNotas = idNotas;
	}
	public Integer getNumeroNota() {
		return numeroNota;
	}
	public void setNumeroNota(Integer numeroNota) {
		this.numeroNota = numeroNota;
	}
	public String getDataNota() {
		return dataNota;
	}

	public void setDataNota(String dataNota) {
		this.dataNota = dataNota;
	}

	public Double getValorNota() {
		return valorNota;
	}
	public void setValorNota(Double valorNota) {
		this.valorNota = valorNota;
	}
	public Cliente getClienteNota() {
		return clienteNota;
	}
	public void setClienteNota(Cliente clienteNota) {
		this.clienteNota = clienteNota;
	}
	public Item getItensNota() {
		return itensNota;
	}
	public void setItensNota(Item itensNota) {
		this.itensNota = itensNota;
	}
	
}
