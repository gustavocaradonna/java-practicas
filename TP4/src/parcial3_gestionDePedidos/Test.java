package parcial3_gestionDePedidos;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Empresa empresa1 = new Empresa();
		
		empresa1.cargarPedido(123, 3333, 4, 200, 5);
		empresa1.cargarPedido(234, 5555, 23, 1100, 10);
		
		
		
		empresa1.listarPedidos();
		
		
		//entrego
		empresa1.entregar(123, 2);
		
		empresa1.listarPedidos();

		empresa1.entregar(123, 3);

		empresa1.listarPedidos();
		
		
		empresa1.pedidoMasAlto();
	}

}
