package parcial2;

public class Departamento {
	

	private int numeroUnidad;
	private int dni;
	private String Propietario;
	private boolean voto;
	private boolean yaVoto = false;

	
	
	//constructor
	public Departamento(int unidad, int dni, String propietario) {
		// TODO Auto-generated constructor stub

		setNumeroUnidad(unidad);
		setDni(dni);
		setPropietario(propietario);
		this.voto = false;

	}


	private void setNumeroUnidad(int numeroUnidad) {
		
		this.numeroUnidad = numeroUnidad;
		
		
	}


	private void setDni(int dni) {
		this.dni = dni;
	}


	private void setPropietario(String Propietario) {
		this.Propietario = Propietario;
	}


	public void setVoto(boolean voto) {
		
		if(!yaVoto) {
		this.voto = voto;
		this.yaVoto = true;
		}
	
	}
	
	
	
	//setter
	
	
	
	
	
	//getter
	
	public int getNumeroUnidad() {
		return this.numeroUnidad;
	}

	
	public boolean getVoto() {
		
		return this.voto;
	}

	
	
	@Override
	public String toString() {
		return "Departamento [numeroUnidad=" + numeroUnidad + ", dni=" + dni + ", Propietario=" + Propietario
				+ ", voto=" + voto + "]";
	}
	
	
	
	
	
	

}
