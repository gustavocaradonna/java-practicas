package parcial;

public class Recuperatorio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TableroDeControl tablero1 = new TableroDeControl(35);

		//	System.out.println(	tablero1.cantidadMaximaLuces);


		// agrego lamparas rojas
		tablero1.agregarLampara(1, SectorLuz.ADELANTE, ColorLuz.ROJA);
		tablero1.agregarLampara(2, SectorLuz.MEDIO, ColorLuz.ROJA);
		tablero1.agregarLampara(3, SectorLuz.ATRAS, ColorLuz.ROJA);

		// lamparas amarillas
		tablero1.agregarLampara(4, SectorLuz.ADELANTE, ColorLuz.AMARILLA);
		tablero1.agregarLampara(5, SectorLuz.MEDIO, ColorLuz.AMARILLA);
		tablero1.agregarLampara(6, SectorLuz.ATRAS, ColorLuz.AMARILLA);

		// lamparas azul
		tablero1.agregarLampara(7, SectorLuz.ADELANTE, ColorLuz.AZUL);
		tablero1.agregarLampara(8, SectorLuz.MEDIO, ColorLuz.AZUL);
		tablero1.agregarLampara(9, SectorLuz.ATRAS, ColorLuz.AZUL);

		// lamparas blanca
		tablero1.agregarLampara(10, SectorLuz.ADELANTE, ColorLuz.BLANCA);
		tablero1.agregarLampara(11, SectorLuz.MEDIO, ColorLuz.BLANCA);
		tablero1.agregarLampara(12, SectorLuz.ATRAS, ColorLuz.BLANCA);


		// prendo luz con id: 3 dos veces y luego la luz con id: 0 una vez
		tablero1.prenderLuz(3);
		tablero1.prenderLuz(3);
		tablero1.prenderLuz(0);
		
		// subo telonQ
		tablero1.subirTelon();

		
		// prendo Luces por sector
		System.out.println(
				"Se prendieron " + tablero1.prenderLuces(SectorLuz.ADELANTE) + " luces. En el sector ADELANTE");

		
		// total Luces operativas

		tablero1.mostrarEstadoLuces();

		// cambio de color luces (blanco a azul)
		System.out.println(
				"Se cambiaron " + tablero1.cambiarColor(ColorLuz.BLANCA, ColorLuz.AZUL) + " luces. De blanco a azul");

		// volver a subir el telon (aun ya subido)
		tablero1.subirTelon();

		tablero1.apagarYCerrarTodo();

		// mostrar Historico
		tablero1.listarHistorico();
		
		tablero1.mostrarEncendidas();

		
	}

}
