package ej1;

public class Asalariado extends Empleado {

	
	private float sueldoMensual;

	public Asalariado() {
	}
	
	public Asalariado(String nombre, int edad, float sueldo) {
		super(nombre, edad);
		setSueldo(sueldo);
	}

	public float getSueldo() {
		return sueldoMensual;
	}

	private void setSueldo(float sueldo) {
		this.sueldoMensual = sueldo;
	}

	@Override
	public String toString() {
		return "Asalariado " + super.getNombre() + " gana " + sueldoMensual;
	}

	@Override
	public float calcularPago() {
		return sueldoMensual;
	}
	
	
	

}
