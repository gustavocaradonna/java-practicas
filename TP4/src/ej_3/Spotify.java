package ej_3;

import java.util.ArrayList;
//import java.util.Date;
import java.util.*;

import ej_2.Depto;

public class Spotify {

	private ArrayList<Usuario> usuarios;
	private ArrayList<Cancion> canciones; 
	
	
	
	
	
	

	public Spotify() {
		super();
		this.usuarios = new ArrayList();
		this.canciones = new ArrayList();
	}

	// buscar cancion
	private Cancion buscarCancion(String nombre, String autor) {

		int i = 0;
		Cancion cancion = null;

		while (i < canciones.size() && cancion == null) {

			if (this.canciones.get(i).getNombre() == nombre && this.canciones.get(i).getAutor() == autor) {
				cancion = canciones.get(i);
			} else {
				i++;
			}
		}

		return cancion;
	}

	// buscar usuario
	private Usuario buscarUsuario(String mail) {
		int i = 0;
		Usuario usuario = null;

		while (i < usuarios.size() && usuario == null) {

			if (this.usuarios.get(i).getMail() == mail) {
				usuario = usuarios.get(i);
			} else {
				i++;
			}
		}
		return usuario;
	}

	// dar de alta una cancion
	public boolean altaCancion(String nombre, String autor, String genero, String fecha, int contReproduc) {
		boolean resultado = false;
		Cancion cancion;
		cancion = buscarCancion(nombre, autor);

		if (cancion == null) {

			canciones.add(new Cancion(nombre, autor, genero, fecha, contReproduc));
			resultado = true;
		}
		return resultado;
	}

	// dar de alta un usuario

	public boolean altaUsuario(String mail, String apellido, int edad, Categoria categoria) {
		boolean resultado = false;
		Usuario usuario;
		usuario = buscarUsuario(mail);
		
		if (usuario == null) {

			usuarios.add(new Usuario(mail, apellido, edad, categoria));
			resultado = true;
		}
		return resultado;
	}
	
	public void escucharCancion(String mail, String nombreCancion , String autor){
		
		Cancion cancion = buscarCancion( nombreCancion,  autor);
		Usuario usuario = buscarUsuario( mail);
		Resultado resultado;
		

		if(cancion != null && usuario == null) {
			resultado = Resultado.USUARIO_INEXISTENTE;
		}
		else if(cancion == null && usuario != null) {
			resultado = Resultado.CANCION_INEXISTENTE;
		}
		else if(usuario.getCategoria() == Categoria.GRATUITO && usuario.cancionesEscuchadas.size() > 50 && cancion.getCategoriaCancion() != Categoria.PREMIUM ) {
			
			resultado = Resultado.LIMITE_ALCANZADO;
		}
		else if (usuario.getCategoria() != Categoria.PREMIUM && /*cancion.getContFecha() < 7 &&*/ cancion.getContReproduc() <1000) {
			
			resultado = Resultado.CANCION_NO_DISPONIBLE;
		}
		
		else if(cancion != null && usuario != null) {
			
			usuario.cancionesEscuchadas.add(cancion);
			resultado = Resultado.CANCION_ESCUCHADA;
			cancion.setContReproduc(1);
			System.out.println("+cant escuchadas" + canciones.size());

		}
	
	}
	
	public void listarUsuarios() {
		
		System.out.println(usuarios);
		
	}

	
	public void listarCancionesPorUsuario(String mail) {
		
		Usuario usuario = buscarUsuario(mail);
		if(usuario  != null ){
			
			System.out.println("Operación existosa, sus canciones escuchadas son: ");
			System.out.println(usuario.cancionesEscuchadas);
		}else {
			
			System.out.println("Usuario inexistente");
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
