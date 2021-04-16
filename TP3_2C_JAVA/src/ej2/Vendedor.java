package ej2;

import ej1.SubContratado;

public class Vendedor extends SubContratado {

	private float porcentaje;

	public Vendedor(String nombre, int edad, float cantHoras, float precioHora, float porcentaje) {
		super(nombre, edad, cantHoras, precioHora);
		// TODO Auto-generated constructor stub
		setPorcentaje(porcentaje);
	}

	public Vendedor() {
		super();
		// TODO Auto-generated constructor stub
	}

	private void setPorcentaje(float porcentaje) {
		this.porcentaje = porcentaje;
	}

	@Override
	public String toString() {
		return "Vendedor " + super.getNombre() + " gana " + calcularPago();
	}

	@Override
	public float calcularPago() {

		return (((super.getPrecioHora() * super.getCantHoras())) * (1.0f + (porcentaje / 100.0f)));

	}

}
