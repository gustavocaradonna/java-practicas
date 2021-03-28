package parcial_2;

public class Test {

	public static void testearReserva(Vuelo v, int dni, int telefono, Clase clase) {
		System.out.println(v.reservarAsiento(dni, telefono, clase));
	}

	public static void main(String[] args) {
		Vuelo v1 = new Vuelo("AA33", 180);
		testearReserva(v1, 11111111, 1234567890, Clase.PRIMERA);
		testearReserva(v1, 22222222, 1234567891, Clase.PRIMERA);
		testearReserva(v1, 33333333, 1234567892, Clase.TURISTA);
		testearReserva(v1, 44444444, 1234567894, Clase.TURISTA);
		testearReserva(v1, 55555555, 1234567895, Clase.BUSINESS);
		testearReserva(v1, 11111111, 1234567890, Clase.PRIMERA);
		
		
		v1.mostrarMontoRecaudadoDeClase(Clase.PRIMERA);
		v1.mostrarMontoRecaudadoDeClase(Clase.BUSINESS);
		v1.mostrarMontoRecaudadoDeClase(Clase.TURISTA);
		v1.listarAsientosReservados();
		
		v1.anularReserva(55555555);
		v1.anularReserva(99999999);
		
		v1.mostrarMontoRecaudadoDeClase(Clase.BUSINESS);
		
		v1.listarAsientosReservados();
	}

}
