package ej_3;

import java.util.ArrayList;

public class Usuario {
	
	private String mail;
	private String apellido;
	private int edad;
	private Categoria categoria;
	ArrayList<Cancion>cancionesEscuchadas = new ArrayList<Cancion>();
	
	
	
	
	
	
	
	
	public Usuario(String mail, String apellido, int edad, Categoria categoria) {
		this.mail = mail;
		this.apellido = apellido;
		this.edad = edad;
		this.categoria = categoria;
	}


	public String getMail() {
		return mail;
	}


	public Categoria getCategoria() {
		return categoria;
	}


	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}


	@Override
	public String toString() {
		return "Usuario [mail=" + mail + ", apellido=" + apellido + ", edad=" + edad + ", categoria=" + categoria
				+ ", cancionesEscuchadas=" + cancionesEscuchadas.size();
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
