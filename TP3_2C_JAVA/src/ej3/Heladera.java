package ej3;

public class Heladera extends Electrodomestico {

	private int capacidad;
	private boolean esNoFrost;

	public Heladera(String marca, String modelo, String numero, String voltaje, boolean estado, double precio,
			int capacidad, boolean esNoFrost) {
		super(marca, modelo, numero, voltaje, estado, precio);
		// TODO Auto-generated constructor stub
		setCapacidad(capacidad);
		setEsNoFrost(esNoFrost);
	}

	private void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	private void setEsNoFrost(boolean esNoFrost) {
		this.esNoFrost = esNoFrost;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() +" [capacidad=" + capacidad + ", esNoFrost=" + esNoFrost + super.toString() ;
	}

	@Override
	public String toStringBasico() {
		return this.getClass().getSimpleName() + super.toStringBasico();
	}

}
