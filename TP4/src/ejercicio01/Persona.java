package ejercicio01;

public class Persona {
	
	private String nombre;
	private String telefono;
	private String dni;
	private String direccion;
	

	
	public Persona(String nombre, String telefono, String dni, String direccion){
		
		this.nombre = nombre;
		this.telefono = telefono;
		this.dni = dni;
		this.direccion = direccion;
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", telefono=" + telefono + ", dni=" + dni + ", direccion=" + direccion +"]";
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getDireccion() {
		return dni;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
