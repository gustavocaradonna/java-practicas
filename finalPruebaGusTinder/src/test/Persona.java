package test;

public class Persona {
	
	private String nombre;
	private String mail;
	private Genero genero;
	private int edad;
	private Genero generoDeseado;
	private int edadMinDeseada;
	private int edadMaxDeseada;
	
	
	public Persona(String nombre, String mail, Genero genero, int edad, Genero generoDeseado, int edadMinDeseada,
			int edadMaxDeseada) {
		this.nombre = nombre;
		this.mail = mail;
		this.genero = genero;
		this.edad = edad;
		this.generoDeseado = generoDeseado;
		this.edadMinDeseada = edadMinDeseada;
		this.edadMaxDeseada = edadMaxDeseada;
	}


	public String getNombre() {
		return nombre;
	}


	private void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getMail() {
		return mail;
	}


	private void setMail(String mail) {
		this.mail = mail;
	}


	public Genero getGenero() {
		return genero;
	}


	private void setGenero(Genero genero) {
		this.genero = genero;
	}


	public int getEdad() {
		return edad;
	}


	private void setEdad(int edad) {
		this.edad = edad;
	}


	public Genero getGeneroDeseado() {
		return generoDeseado;
	}


	private void setGeneroDeseado(Genero generoDeseado) {
		this.generoDeseado = generoDeseado;
	}


	public int getEdadMinDeseada() {
		return edadMinDeseada;
	}


	private void setEdadMinDeseada(int edadMinDeseada) {
		this.edadMinDeseada = edadMinDeseada;
	}


	public int getEdadMaxDeseada() {
		return edadMaxDeseada;
	}


	private void setEdadMaxDeseada(int edadMaxDeseada) {
		this.edadMaxDeseada = edadMaxDeseada;
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", mail=" + mail + ", genero=" + genero + ", edad=" + edad
				+ ", generoDeseado=" + generoDeseado + ", edadMinDeseada=" + edadMinDeseada + ", edadMaxDeseada="
				+ edadMaxDeseada + "]";
	}


	

}
