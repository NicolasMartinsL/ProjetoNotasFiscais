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
	public Integer idNotas;
	
	public	Integer numeroNota;
	public String dataNota;
	public Double valorNota;
	@ManyToOne
	public	Cliente clienteNota;
	//@Embedded
	@OneToOne
	public Item itensNota;

	
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
