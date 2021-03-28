package ejercico3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean resultado ;
		
		TarjetaDeCredito tarjeta1 = new TarjetaDeCredito("123", "juan perez" , 10000 );
		resultado = tarjeta1.realizarCompra(4000);
		System.out.println("Resultado de la compra "+ resultado);
		//System.out.println(tarjeta1.toString());
		System.out.println(tarjeta1);
		//tarjeta1.actualizarLimite(3000);
		tarjeta1.actualizarLimite(2000);
		
		resultado = tarjeta1.realizarCompra(4000);
		System.out.println("Resultado de la compra "+ resultado);
		System.out.println(tarjeta1+"\n");

		//System.out.println(tarjeta1.toString());

		TarjetaDeCredito tarjeta2 = new TarjetaDeCredito("999", "gus" , 5000 );

		System.out.println(tarjeta2);
		tarjeta2.realizarCompra(1000);
		tarjeta2.actualizarLimite(20000);
		tarjeta2.realizarCompra(15000);
		System.out.println(tarjeta2);

		
	}

	
}
