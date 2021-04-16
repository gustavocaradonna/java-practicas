package ej3;

public class Licuadora extends Electrodomestico {

	private int potencia;
	private int velocidades;

	public Licuadora(String marca, String modelo, String numero, String voltaje, boolean estado, double precio,
			int potencia, int velocidades) {
		super(marca, modelo, numero, voltaje, estado, precio);
		setPotencia(potencia);
		setVelocidades(velocidades);
	}

	private void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	private void setVelocidades(int velocidades) {
		this.velocidades = velocidades;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName()+ " [potencia=" + potencia + ", velocidades=" + velocidades + super.toString() ;
	}

	@Override
	public String toStringBasico() {
		return this.getClass().getSimpleName() +  super.toStringBasico();
	}
	
	
}
