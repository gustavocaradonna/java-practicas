package parcial5_ortMusic;

public class Tema {

	private String tituloCancion;
	private String autor;
	private int anio;
	private String genero;
	private int cantReprod;
	
	
	//constructor
	public Tema(String tituloCancion, String autor, int anio, String genero) {
		super();
		this.tituloCancion = tituloCancion;
		this.autor = autor;
		this.anio = anio;
		this.genero = genero;
		this.cantReprod = 0;
	}

	//lo necesito publico para usar en el metodo buscar de la clase cuenta.
	public String getTituloCancion() {
		return tituloCancion;
	}

	//lo necesito publico para aumentarle en 1 la cantidad cada vez que se reproduce la canción
	public void setCantReprod(int cantReprod) {
		this.cantReprod += cantReprod;
	}

	@Override
	public String toString() {
		return "Tema [tituloCancion=" + tituloCancion + ", autor=" + autor + ", anio=" + anio + ", genero=" + genero
				+ ", cantReprod=" + cantReprod + "]";
	}

	public int getCantReprod() {
		return cantReprod;
	}

	public String getGenero() {
		return genero;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
