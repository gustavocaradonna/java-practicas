package parcial;

public class HistoricoLuz {

//	private Lampara lampara;
	private Accion accion;
	private int id;
	private boolean estaPrendida ;
	private SectorLuz sectorLuz; 
	private ColorLuz colorInicial;

	public HistoricoLuz(Lampara lampara, Accion accion) {

	//	this.lampara = lampara;
		
		this.id = lampara.getId();
		this.estaPrendida = lampara.isEstaPrendida();
		this.sectorLuz = lampara.getSectorLuz();
		this.colorInicial = lampara.getColorInicial();
		this.accion = accion;
	}

	@Override
	public String toString() {
		return "HistoricoLuz [accion=" + accion + ", id=" + id + ", estaPrendida=" + estaPrendida + ", sectorLuz="
				+ sectorLuz + ", colorInicial=" + colorInicial + "]";
	}



}