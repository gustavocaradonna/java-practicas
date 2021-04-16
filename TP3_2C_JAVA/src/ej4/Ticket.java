package ej4;
import java.util.ArrayList;
import ej3.*;

public class Ticket implements Imprimible {
	
	private ArrayList<Electrodomestico>carritoCompras;
	private int codigo;
	private static final String TICKET_DE_VENTA = "Ticket de venta \nArticulos:";
	
	public Ticket(ArrayList<Electrodomestico>listaCompraCliente) {
		super();
		this.carritoCompras = listaCompraCliente;
	
	}


	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		
		System.out.println(TICKET_DE_VENTA);
		float total;
		total = 0;
		for (Electrodomestico electrodomestico : carritoCompras) {
			System.out.println(electrodomestico);
			total += electrodomestico.getPrecio();

		}
		System.out.println("Total: " + total);
		
		
	}

	
	
	
}
