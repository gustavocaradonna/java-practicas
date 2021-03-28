package parcial_tablero_t3;

import java.util.ArrayList;

public class Tablero {

	private Telon telon;

	private static final int LUCES_MINIMO = 10;
	private static final int LUCES_MAXIMO = 100;

	private int cantidadMaximaLuces;
	private int encendidas;
	private ArrayList<Lampara> lamparas;
	private ArrayList<HistoricoLuz> historico;

	public Tablero(int cantidadMaximaLuces) {

		this.telon = new Telon();
		this.cantidadMaximaLuces = cantidadMaximaLuces;
		setCantidadLuces(cantidadMaximaLuces);
		this.encendidas = 0;
		this.lamparas = new ArrayList<Lampara>();
		this.historico = new ArrayList<HistoricoLuz>();
	}

	public void apagarTodo() {
		int cont = 0;
		for (Lampara lampara : lamparas) {

			if (lampara.dameEstado() == true) {
				lampara.setEstado(false);
				cont++;
			}

		}
		this.encendidas = 0;
		System.out.println("Se apagó todo, habia encendidas " + cont);
	}

	public void apagarYBajarTelon() {
		this.bajarTelon();
		this.apagarTodo();
	}

	public void bajarTelon() {
		telon.bajarTelon();
	}

	public void subirTelon() {
		telon.subirTelon();
	}

	public void encenderLuz(int id) {

		Lampara lampara = null;
		lampara = buscarLampara(id);

		if (lampara != null && lampara.dameEstado() == false) {

			System.out.println("Se prendió la luz con id " + id);
			this.encendidas += 1;
			lampara.setEstado(true);
			historico.add(new HistoricoLuz(Accion.PRENDER, lampara));

		} else {

			System.out.println("No se pudo encender la luz con id " + id);

		}

	}

	public void apagarLuz(int id) {

		Lampara lampara = null;
		lampara = buscarLampara(id);

		if (lampara != null && lampara.dameEstado() == true) {

			System.out.println("Se apagó la luz con id " + id);
			this.encendidas -= 1;
			lampara.setEstado(false);
			historico.add(new HistoricoLuz(Accion.APAGAR, lampara));

		} else {

			System.out.println("No se pudo apagar la luz con id " + id);

		}

	}

	private Lampara buscarLampara(int id) {

		int i = 0;
		Lampara lampara = null;
		while (i < lamparas.size() && lampara == null) {

			if (lamparas.get(i).dameId() == id) {
				lampara = lamparas.get(i);
			} else {
				i++;
			}
		}

		return lampara;
	}

	public void cambiar(int id, ColorInicial color) {
		Lampara lampara = null;
		lampara = buscarLampara(id);
		if (lampara != null && lampara.dameEstado() == true) {

			System.out.println("Se cambió lampara de color " + lampara.dameColor() + " a " + color);
			lampara.setColor(color);
			historico.add(new HistoricoLuz(Accion.CAMBIAR, lampara));
		} else {
			System.out.println("La luz no existe o esta prendida (por ende no se puede cambiar");
		}

	}

	public void estadoGeneral() {

		System.out.println("Total de luces " + this.cantidadMaximaLuces);

		if (this.encendidas != 0) {
			System.out.println(
					"Encendidas " + this.encendidas + " (" + (this.cantidadMaximaLuces / this.encendidas) + "%)");

		} else {
			System.out.println("Encendidas " + this.encendidas);
		}
	}

	public void agregarLampara(int id, Sector sector, ColorInicial color) {

		if (lamparas.size() < this.cantidadMaximaLuces) {
			Lampara lampara = new Lampara(id, sector, color);
			lamparas.add(lampara);

			HistoricoLuz registro1 = new HistoricoLuz(Accion.AGREGAR, lampara);

			historico.add(registro1);
		}

	}

	private void setCantidadLuces(int cantidadMaximaLuces) {
		if (cantidadMaximaLuces > this.LUCES_MINIMO && cantidadMaximaLuces < this.LUCES_MAXIMO) {
			this.cantidadMaximaLuces = cantidadMaximaLuces;
		} else if (cantidadMaximaLuces < this.LUCES_MINIMO) {

			this.cantidadMaximaLuces = this.LUCES_MINIMO;

		} else if (cantidadMaximaLuces > this.LUCES_MAXIMO) {
			this.cantidadMaximaLuces = this.LUCES_MAXIMO;

		}
	}

	public void listarHistorico() {
		for (HistoricoLuz historicoLuz : historico) {
			System.out.println(historicoLuz);
		}
	}

}
