package parcial_tablero_t3;

public class Lampara {

	private int id;
	private boolean estado;
	private Sector sector;
	private ColorInicial color;

	public Lampara(int id, Sector sector, ColorInicial color) {

		this.id = id;
		this.estado = false;
		this.sector = sector;
		this.color = color;
	}

	public int dameId() {
		return id;
	}

	public boolean dameEstado() {
		return estado;
	}

	public Sector dameSector() {
		return sector;
	}

	public ColorInicial dameColor() {
		return color;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public void setColor(ColorInicial color) {

		this.color = color;
	}

}
