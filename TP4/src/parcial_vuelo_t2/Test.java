package parcial_vuelo_t2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Vuelo vuelo1 = new Vuelo("AA3313", 180);
		
		
		System.out.println(vuelo1.reservarAsiento(11111, 1234567890, Clase.PRIMERA, 1, "a"));
		System.out.println(vuelo1.reservarAsiento(22222, 1234567891, Clase.TURISTA, 6, "f"));
		System.out.println(vuelo1.reservarAsiento(33333, 1234567892, Clase.PRIMERA, 2, "a"));
		System.out.println(vuelo1.reservarAsiento(44444, 1234567894, Clase.TURISTA, 5, "f"));
		System.out.println(vuelo1.reservarAsiento(55555, 1234567895, Clase.PRIMERA, 1, "a"));

		
		//mostrar monto recaudado por clase
		vuelo1.mostrarMontoRecaudadoDeClase(Clase.PRIMERA);
		vuelo1.mostrarMontoRecaudadoDeClase(Clase.BUSINESS);
		vuelo1.mostrarMontoRecaudadoDeClase(Clase.TURISTA);
		
		
		
	}

}
