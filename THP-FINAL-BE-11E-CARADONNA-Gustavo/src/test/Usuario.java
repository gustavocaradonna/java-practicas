package test;

import java.util.ArrayList;



public class Usuario {

	private String nombre;
	private ArrayList<Usuario> amigos;
	
	
	
	public Usuario(String nombre) {
		this.nombre = nombre;
		this.amigos = new ArrayList<Usuario>();
	}

	public void agregarAmigo(Usuario amigo) {
		amigos.add(amigo);
	}
	
	public Usuario buscarAmigo(Usuario amigoRecibido) {
	
		int i = 0;
		Usuario miAmigo = null;

		while (i < amigos.size() && miAmigo == null) {

			if (this.amigos.get(i) == amigoRecibido) {
				miAmigo = amigos.get(i);
			} else {

				i++;
			}
		}
		return miAmigo;
		
	}
	
	
	public boolean existeEnAmigos(Usuario usuario) {
	
		int i = 0;
		boolean resultado = false;

		while (i < amigos.size() && resultado == false) {

			if (this.amigos.get(i).buscarAmigo(usuario) == usuario) {
				resultado = true;
			} else {

				i++;
			}
		}
		return resultado;
		
	}
	
	


	public String getNombre() {
		return nombre;
	}
	
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", amigos=" + amigos + "]";
	}
	
	
	
	
}
