package test;

import java.util.ArrayList;

public class Aplicacion {

	private ArrayList<Usuario> usuarios;

	public Aplicacion() {
		this.usuarios = new ArrayList<>();
	}

	public boolean agregarUsuario(String nombre) {

		boolean resultado = false;
		Usuario miUsuario = buscarUsuario(nombre);

		if (miUsuario == null) {
			usuarios.add(new Usuario(nombre));
			resultado = true;
		}

		return resultado;
	}

	private Usuario buscarUsuario(String nombre) {

		int i = 0;
		Usuario miUsuario = null;

		while (i < usuarios.size() && miUsuario == null) {

			if (this.usuarios.get(i).getNombre() == nombre) {
				miUsuario = usuarios.get(i);
			} else {

				i++;
			}
		}
		return miUsuario;
	}

	public ResultadoAgregarAmigo agregarAmigo(String nombreUsuario, String nombreAmigo) {
		ResultadoAgregarAmigo resultado = ResultadoAgregarAmigo.AGREGAR_OK;

		Usuario miUsuario = this.buscarUsuario(nombreUsuario);
		Usuario miAmigo = this.buscarUsuario(nombreAmigo);

		if (miUsuario == null) {
			resultado = ResultadoAgregarAmigo.ERROR_USUARIO_INEXISTENTE;
		} else if (miAmigo == null) {
			resultado = ResultadoAgregarAmigo.ERROR_AMIGO_INEXISTENTE;
		} else if (nombreUsuario.equals(nombreAmigo)) {
			resultado = ResultadoAgregarAmigo.ERROR_MISMO_USUARIO;
		} else {
			miUsuario.agregarAmigo(miAmigo);
			miAmigo.agregarAmigo(miUsuario);
		}

		return resultado;
	}

	public ResultadoGradoAmistad obtenerGradoAmistad(String nombreUsuario, String nombreAmigo) {
		ResultadoGradoAmistad resultado = ResultadoGradoAmistad.ERROR_USUARIO_INEXISTENTE;
		Usuario miUsuario = this.buscarUsuario(nombreUsuario);
		Usuario miAmigo = this.buscarUsuario(nombreAmigo);

		if (miUsuario != null && miAmigo != null) {

			if (miUsuario.buscarAmigo(miAmigo) != null) {
				resultado = ResultadoGradoAmistad.GRADO_UNO;
			} else if (miAmigo.existeEnAmigos(miUsuario)) {
				resultado = ResultadoGradoAmistad.GRADO_DOS;
			} else {
				resultado = ResultadoGradoAmistad.GRADO_TRES;
			}

		

		}

		return resultado;
	}

	
	public void listarEnums() {
		System.out.println("\nAsi se lista un enumerador : ");
		for (ResultadoAgregarAmigo resultado : ResultadoAgregarAmigo.values()) {
			
			System.out.println(resultado);
		}
		
	}
	
	
	
}
