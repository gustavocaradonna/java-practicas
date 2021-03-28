package ej_2;

public class Depto {

	private int numeroUnidad;
	private int dni;
	private String nombrePropietario;
	private double deuda;

	public Depto(int numeroUnidad, int dni, String nombrePropietario) {

		this.numeroUnidad = numeroUnidad;
		this.dni = dni;
		this.nombrePropietario = nombrePropietario;
		this.deuda = 0;
	}

	public int getNumeroUnidad() {
		return numeroUnidad;
	}

	@Override
	public String toString() {
		return "Depto [numeroUnidad=" + numeroUnidad + ", dni=" + dni + ", nombrePropietario=" + nombrePropietario
				+ ", deuda=" + deuda + "]";
	}

	public void setDeuda(double deuda) {
		this.deuda = deuda;
	}

	public double getDeuda() {
		return deuda;
	}



	
	
	
	
	
	
	
	
	
	

}
