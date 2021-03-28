package parcial_tablero_t3;

public class HistoricoLuz {

	private int id;
	private boolean estado;
	private Sector sector;
	private ColorInicial color;
	private Accion accion;

	public HistoricoLuz(Accion accion, Lampara lampara) {

		this.accion = accion;
		this.id = lampara.dameId();
		this.estado = lampara.dameEstado();
		this.sector = lampara.dameSector();
		this.color = lampara.dameColor();

	}

	@Override
	public String toString() {
		return "HistoricoLuz [accion=" + accion + ", id=" + id + ", estado=" + estado + ", sector=" + sector
				+ ", color=" + color + "]";
	}

}
