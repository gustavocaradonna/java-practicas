package parcial_tablero_t3;

public class Telon {

	private boolean abierto;

	public Telon() {
		this.abierto = false;
	}

	public void bajarTelon() {

		if (this.abierto = false) {
			System.out.println("Ya estaba bajo");
		} else {
			this.abierto = false;
			System.out.println("Se bajo el telon");
		}
	}

	public void subirTelon() {
		if (this.abierto == true) {
			System.out.println("Ya estaba subido");
		}

		else {
			this.abierto = true;
			System.out.println("Se subió el telon");
		}
	}

}
