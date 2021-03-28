package parcial_2;

public class Pasajero {
	private int dni;
	private int telefono;

	public Pasajero(int dni, int telefono) {
		this.dni = dni;
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Pasajero [dni=" + dni + ", telefono=" + telefono + "]";
	}

	public int getDni() {
		return dni;
	}

	public int getTelefono() {
		return telefono;
	}

}
