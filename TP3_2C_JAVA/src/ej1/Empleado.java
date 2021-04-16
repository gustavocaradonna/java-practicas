package ej1;

public abstract class Empleado {
	private String nombre;
	private int edad;

	public Empleado() {
	}

	public Empleado(String nombre, int edad) {
		super();
		setNombre(nombre);
		setEdad(edad);
	}
	
	public String getNombre() {
		return nombre;
	}


	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString(){return "[Nombre=" + nombre + ", edad=" + edad + "]";}


	public abstract float calcularPago();

}
