package parcial2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vuelo vuelo1 = new Vuelo("AA3313", 180);

		System.out.println(vuelo1.reservarAsiento(11111111, 1234567890, Clase.PRIMERA));
		System.out.println(vuelo1.reservarAsiento(22222222, 1234567891, Clase.PRIMERA));
		System.out.println(vuelo1.reservarAsiento(33333333, 1234567892, Clase.TURISTA));
		System.out.println(vuelo1.reservarAsiento(44444444, 1234567894, Clase.TURISTA));
		System.out.println(vuelo1.reservarAsiento(55555555, 1234567895, Clase.BUSINESS));
		System.out.println(vuelo1.reservarAsiento(11111111, 1234567890, Clase.PRIMERA));
		
		vuelo1.mostrarX() ;

		
		vuelo1.mostrarMontoRecaudadoDeClase(Clase.PRIMERA);
		vuelo1.mostrarMontoRecaudadoDeClase(Clase.BUSINESS);
		vuelo1.mostrarMontoRecaudadoDeClase(Clase.TURISTA);

		vuelo1.listarAsientosReservados();

		vuelo1.anularReserva(55555555);
		vuelo1.anularReserva(99999999);

		vuelo1.mostrarMontoRecaudadoDeClase(Clase.BUSINESS);
		vuelo1.listarAsientosReservados();

	}

}
