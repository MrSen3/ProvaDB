package it.polito.tdp.provadb.model;

public class Parola { //deve essere lo specchio di cio  che è contenuto nel db. 
	
	//Consigliabile chiamarli come nel db
	private int id;
	private String nome;
	
	
	public Parola(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	
//Molto importante il fatto che l'identità di un oggetto in java e la chiave primaria del db siano la stessa cosa
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parola other = (Parola) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
	

}
