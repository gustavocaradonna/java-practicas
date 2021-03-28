package parcial;

import java.util.ArrayList;

public class TableroDeControl {

	private static final int LUCES_MINIMO = 3;
	private static final int LUCES_MAXIMO = 32;
	private int cantidadMaximaLuces;
	private double encendidas;
	private ArrayList<HistoricoLuz> historicoLuces;
	private ArrayList<Lampara> luces;
	private Telon telon;

	public TableroDeControl(int cantidadMaximaLuces) {

		setCantidadMaximaLuces(cantidadMaximaLuces);
		this.encendidas = 0;
		historicoLuces = new ArrayList<HistoricoLuz>();
		luces = new ArrayList<Lampara>();
		telon = new Telon();

	}

	public boolean agregarLampara(int id, SectorLuz sector, ColorLuz color) {
		boolean resultado = false;

		if (luces.size() <= this.cantidadMaximaLuces) {

			Lampara miLampara = this.buscarLampara(id);

			if (miLampara == null) {
				Lampara lampara = new Lampara(id, sector, color);
				luces.add(lampara);

				HistoricoLuz historico = new  HistoricoLuz(lampara, Accion.AGREGAR);
				
				historicoLuces.add(historico);

				resultado = true;
			}
		}
		return resultado;
	}

	public boolean removerLampara(int id, SectorLuz sector, ColorLuz color) {
		boolean resultado = false;

		Lampara miLampara = this.buscarLampara(id);

		if (miLampara != null && miLampara.isEstaPrendida() == false && telon.isAbierto() == false) {
			luces.remove(miLampara);

			// HistoricoLuz historico = new HistoricoLuz(lampara, Accion.AGREGAR);
			// historicoLuces.add(historico);
			resultado = true;
		}

		return resultado;
	}

	private Lampara buscarLampara(int id) {
		int i = 0;
		Lampara miLampara = null;

		while (i < luces.size() && miLampara == null) {

			if (luces.get(i).getId() == id) {
				miLampara = luces.get(i);
			}
			i++;
		}
		return miLampara;
	}

	public boolean prenderLuz(int id) {
		boolean resultado = false;
		Lampara miLampara = buscarLampara(id);

		if (miLampara != null && miLampara.isEstaPrendida() == false) {
			this.setEncendidas(1);
			resultado = true;
			miLampara.setEstaPrendida(true);
			System.out.println("Se prendió la luz con id " + id);
			historicoLuces.add(new HistoricoLuz(miLampara, Accion.PRENDER));
		} else {
			System.out.println("No se pudo prender la luz con id " + id);
		}

		return resultado;
	}

	public int prenderLuces(SectorLuz sectorRecibido) {
		int cont = 0;
		for (Lampara luz : luces) {
			if (luz.isEstaPrendida() == false && luz.getSectorLuz() == sectorRecibido) {

				cont++;
				this.prenderLuz(luz.getId());
			}

		}

		return cont;
	}

	public void apagarLuces() {
		int cont = 0;
		for (Lampara luz : luces) {
			if (luz.isEstaPrendida() == true) {
				
				luz.setEstaPrendida(false);
				historicoLuces.add(new HistoricoLuz(luz, Accion.APAGAR));
				cont++;
			}
		}
		System.out.println("Se apagaron todas las luces, habia encendidas: " + cont);
		this.setApagar(cont);

	}

	public boolean subirTelon() {
		boolean resultado = false;

		if (luces.size() > 3) {

			if (!telon.isAbierto()) {
				this.telon.setAbierto(true);
				resultado = true;
				System.out.println("Telon subido");
			} else {
				System.out.println("El telon ya estaba subido!");
			}

		} else {
			System.out.println("no se puede subir pq no hay 3 luces creadas");
		}

		return resultado;
	}

	public boolean bajarTelon() {
		boolean resultado = false;
		if (telon.isAbierto()) {
			this.telon.setAbierto(false);
			resultado = true;
			System.out.println("El telon se ha bajado!");

		} else {
			System.out.println("El telon ya estaba bajado!");

		}
		return resultado;
	}

	// historico
	public void listarHistorico() {
		for (HistoricoLuz luz : historicoLuces) {
			System.out.println(luz);
		}
	}

	public void mostrarEstadoLuces() {

		System.out.println("Total luces operativas " + luces.size());
		System.out.println(
				"Porcentaje de encendido " + this.encendidas + " (" + (this.encendidas / luces.size() * 100) + "%)");
	}

	public void estadoGeneralLuces() {
		System.out.println("Total");

	}

	public int cambiarColor(ColorLuz color1, ColorLuz color2) {
		int resultado = 0;

		for (Lampara luz : luces) {
			if (luz.getColorInicial() == color1 && luz.isEstaPrendida() == true) {
				luz.setColorInicial(color2);
				resultado++;

				HistoricoLuz nuevo = new HistoricoLuz(luz, Accion.CAMBIAR);
				historicoLuces.add(nuevo);
			}
		}

		return resultado;
	}

	private void setEncendidas(int cant) {
		this.encendidas += cant;
	}

	private void setApagar(int cant) {
		this.encendidas -= cant;
	}

	// setter validado
	private void setCantidadMaximaLuces(int cantidadMaximaLuces) {

		if (cantidadMaximaLuces < LUCES_MINIMO) {
			this.cantidadMaximaLuces = LUCES_MINIMO;
		} else if (cantidadMaximaLuces > LUCES_MAXIMO) {
			this.cantidadMaximaLuces = LUCES_MAXIMO;
		} else {
			this.cantidadMaximaLuces = cantidadMaximaLuces;
		}

	}

	public void apagarYCerrarTodo() {

		this.bajarTelon();
		this.apagarLuces();

	}
	
	public void mostrarEncendidas() {
		System.out.println("ENCENDIDAS: " + this.encendidas);
	}

}
