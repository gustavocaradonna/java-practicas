package parcial_tablero_t3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creo 40 tablero con 40 luces
		Tablero tablero1 = new Tablero(40);

		// enciendo 12 luces (3 de cada color y sector)
		tablero1.agregarLampara(1, Sector.DERECHA, ColorInicial.ROJA);
		tablero1.agregarLampara(2, Sector.IZQUIERDA, ColorInicial.ROJA);
		tablero1.agregarLampara(3, Sector.CENTRO, ColorInicial.ROJA);

		tablero1.agregarLampara(4, Sector.DERECHA, ColorInicial.AMARILLA);
		tablero1.agregarLampara(5, Sector.IZQUIERDA, ColorInicial.AMARILLA);
		tablero1.agregarLampara(6, Sector.CENTRO, ColorInicial.AMARILLA);

		tablero1.agregarLampara(7, Sector.DERECHA, ColorInicial.AZUL);
		tablero1.agregarLampara(8, Sector.IZQUIERDA, ColorInicial.AZUL);
		tablero1.agregarLampara(9, Sector.CENTRO, ColorInicial.AZUL);

		tablero1.agregarLampara(10, Sector.DERECHA, ColorInicial.BLANCA);
		tablero1.agregarLampara(11, Sector.IZQUIERDA, ColorInicial.BLANCA);
		tablero1.agregarLampara(12, Sector.CENTRO, ColorInicial.BLANCA);

		// prende la 1
		tablero1.encenderLuz(1);

		// falla al volver a prender la 1
		tablero1.encenderLuz(1);

		// falla al querer encender una luz inexistente
		tablero1.encenderLuz(100);

		// subo el telon
		tablero1.subirTelon();

		// prende 1,10,11,12

		tablero1.encenderLuz(10);
		tablero1.encenderLuz(11);
		tablero1.encenderLuz(12);

		// estado general
		tablero1.estadoGeneral();

		// cambiar luz
		tablero1.cambiar(1, ColorInicial.AZUL);

		// subo el telon
		tablero1.subirTelon();

		// apagar luces
		tablero1.apagarLuz(1);
		tablero1.apagarLuz(10);
		tablero1.apagarLuz(11);
		tablero1.apagarLuz(12);

		// listar historico de luces
		tablero1.listarHistorico();

		// apagar todo
		tablero1.apagarTodo();

		tablero1.estadoGeneral();

	}

}
