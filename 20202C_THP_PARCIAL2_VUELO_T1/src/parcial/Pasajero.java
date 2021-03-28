package parcial;

public class Pasajero {
	private int dni;
	private String telefono;

	public Pasajero(int dni, String telefono) {
		setDni(dni);
		setTelefono(telefono);
	}
	
	public boolean mismoDni(int dni) {
		return this.dni == dni;
	}

	public int getDni() {
		return dni;
	}
	
	public String getTelefono() {
		return telefono;
	}

	private void setDni(int dni) {
		this.dni = dni;
	}

	private void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Pasajero [dni=" + dni + ", telefono=" + telefono + "]";
	}

}