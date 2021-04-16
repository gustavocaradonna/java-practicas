package ej3;

public class Televisor extends Electrodomestico {

	private double pulgadas;
	private boolean esSmart;

	public Televisor(String marca, String modelo, String numero, String voltaje, boolean estado, double precio,
			double pulgadas, boolean esSmart) {
		super(marca, modelo, numero, voltaje, estado, precio);
		// TODO Auto-generated constructor stub

		setPulgadas(pulgadas);
		setEsSmart(esSmart);
	}

	private void setPulgadas(double pulgadas) {
		this.pulgadas = pulgadas;
	}

	private void setEsSmart(boolean esSmart) {
		this.esSmart = esSmart;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [pulgadas=" + pulgadas + ", esSmart=" + esSmart 
				+ super.toString();
	}

	@Override
	public String toStringBasico() {
		return this.getClass().getSimpleName() + super.toStringBasico();
	}

}
