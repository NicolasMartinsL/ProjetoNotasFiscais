package br.com.projeto.NotasFiscais.model;

public class Clientes {	
	
	
	public Integer idCliente;
	public Integer codigoCliente ;
	public String nomeCliente ;
		
	public Clientes(Cliente clientes) {
		this.idCliente = clientes.getIdCliente();
		this.codigoCliente = clientes.getCodigoCliente();
		this.nomeCliente = clientes.getNomeCliente();
	}
	
	
	public Integer getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	public Integer getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(Integer codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	
}	
		