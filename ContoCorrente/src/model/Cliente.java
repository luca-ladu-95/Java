package model;

public class Cliente {
	
	private final String nome;
	private final String cognome;
	private ContoCorrente conto;
	
	
	public Cliente(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
		
	}


	public ContoCorrente getConto() {
		return conto;
	}


	public void setConto(ContoCorrente conto) {
		this.conto = conto;
	}


	public String getNome() {
		return nome;
	}


	public String getCognome() {
		return cognome;
	}
	
	
	
	
	
	
	

}
