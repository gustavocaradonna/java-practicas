package parcial;

public class Lampara {

	private int id;
	private boolean estaPrendida;
	private SectorLuz sectorLuz;
	private ColorLuz colorInicial;

	public Lampara(int id, SectorLuz sectorLuz, ColorLuz colorInicial) {

		this.id = id;
		this.estaPrendida = false;
		this.sectorLuz = sectorLuz;
		this.colorInicial = colorInicial;
	}

	public int getId() {
		return id;
	}

	public boolean isEstaPrendida() {
		return estaPrendida;
	}

	public void setEstaPrendida(boolean estaPrendida) {
		this.estaPrendida = estaPrendida;
	}

	@Override
	public String toString() {
		return " numero=" + id + ", estaPrendida=" + estaPrendida + ", sectorLuz=" + sectorLuz + ", colorInicial="
				+ colorInicial;
	}

	public SectorLuz getSectorLuz() {
		return sectorLuz;
	}

	public void setSectorLuz(SectorLuz sectorLuz) {
		this.sectorLuz = sectorLuz;
	}

	public ColorLuz getColorInicial() {
		return colorInicial;
	}

	public void setColorInicial(ColorLuz colorInicial) {
		this.colorInicial = colorInicial;
	}

}
