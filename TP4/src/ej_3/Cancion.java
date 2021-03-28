package ej_3;

import java.util.Date;

public class Cancion {
	
	private String nombre;
	private String autor;
	private String genero;
	
	private String contFecha;
	private int contReproduc;
	private Categoria categoriaCancion;
	
	
	//constructor
	
	public Cancion(String nombre, String autor, String genero, String contFecha, int contReproduc) {
		super();
		this.nombre = nombre;
		this.autor = autor;
		this.genero = genero;
		this.contFecha = contFecha;
		this.contReproduc = contReproduc;
		
	}
	//getters
	public String getNombre() {
		return nombre;
	}
	public String getAutor() {
		return autor;
	}
	public void setContFecha(String contFecha) {
		this.contFecha = contFecha;
	}
	public void setContReproduc(int contReproduc) {
		this.contReproduc += contReproduc;
	}
	public String getContFecha() {
		return contFecha;
	}
	public int getContReproduc() {
		return contReproduc;
	}
	public Categoria getCategoriaCancion() {
		return categoriaCancion;
	}
	public void setCategoriaCancion(Categoria categoriaCancion) {
		this.categoriaCancion = categoriaCancion;
	}
	@Override
	public String toString() {
		return "Cancion [nombre=" + nombre + ", autor=" + autor + ", genero=" + genero + ", contFecha=" + contFecha
				+ ", contReproduc=" + contReproduc + ", categoriaCancion=" + categoriaCancion + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
