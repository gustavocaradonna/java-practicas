package parcial_recuInmobiliaria;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Inmobiliaria inmo = new Inmobiliaria(20,10);
		
		
		inmo.agregarPropiedad("Yatay 240 1B", 3, 150000, 100, "Venta",  "Almagro");
		inmo.agregarPropiedad( "Yatay 240 1B", 1, 20000, 50, "Alquiler",  "Almagro");
		inmo.agregarPropiedad( "Av. del Libertador 6796", 5, 400000, 250, "Venta", "Belgrano");
		inmo.agregarPropiedad( "Río de Janeiro 471", 4, 50000, 150, "Alquiler",  "Almagro");
		inmo.agregarPropiedad( "Montañeses 2845 8A", 2, 200000, 90, "Venta",  "Belgrano");
		
		//propiedades listadas en alquiler
		System.out.println("Propiedades en alquiler");
		inmo.listarPropiedadesPorTipo("Alquiler");
		
		//modificar precio satisfactoriamente
		inmo.actualizarPrecio("Yatay 240 1B", 200000);
		
		//modificar precio, debe dar error
		inmo.actualizarPrecio("Av. Rivadavia 100", 3000);
		
		//realizar venta
		inmo.realizarOperacion("Venta", "Yatay 240 1B");
		
		//realizar venta,debe dar error
		inmo.realizarOperacion("Venta", "Montañeses 3000");

		//promedio precios en belgrano
		System.out.println("Valor promedio en belgrano es " +inmo.obtenerPromedioPorBarrio("Belgrano"));

		//recaudacion total
		System.out.println("Recaudacion total por comisiones " + inmo.obtenerRecaudacion());
	
		
	}

}
