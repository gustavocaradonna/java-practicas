package ej3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Scanner;
import ej1.*;
import ej2.*;
import ej3.*;
import ej4.*;

import ej4.Ticket;

public class CasaElectrodomestico {
	
	private ArrayList<Electrodomestico>electrodomesticos;
	private int numeroTicket;
	private static final int MINIMO_VENTA = 0;
	private static final int SALIR = 0;
	private static final int NEGATIVA = 2;
	private static final int AFIRMATIVA = 1;
	private static final int RESET = -1;
	private static final String CONFIRMAONO = "Confirma? SI: 1 , NO: 2";
	private static final String FIN_DEL_PROGRAMA = "Fin del programa";
//	private static final String TICKET_DE_VENTA = "Ticket de venta \nArticulos:";
	private static final String DESEA_COMPRARLO_SI_1_NO_2_FIN_0 = "Desea comprarlo? SI: 1 , NO: 2 , FIN: 0";
	private static final String EL_PRODUCTO_ES = "Producto: ";
	private static final String DETALLEPRODUCTO = "Detalle del producto: ";
	private static final String LISTADEPRODUCTOS = "///Lista de productos///";

	public static Scanner input = new Scanner(System.in);
	
	
	public CasaElectrodomestico() {
		super();
		this.numeroTicket = 0;
		this.electrodomesticos = new ArrayList<Electrodomestico>();
	}
	
	
	public void agregarProducto(Electrodomestico electrodomestico){
		
		electrodomesticos.add(electrodomestico);
		
	}
	
	private int generarNumeroTk() {
		return this.numeroTicket++;
	}
	
	
	public void comprar(Cliente cliente){
	
		int respuesta;

		int i;
		i = 0;
		int tamanioLista = electrodomesticos.size();

		// instancio lista de seleccion de cliente
		ArrayList<Electrodomestico> listaCompraCliente = new ArrayList<>();

		do {
			respuesta = RESET;
			Electrodomestico electrodomestico1 = electrodomesticos.get(i);

			System.out.println(LISTADEPRODUCTOS);

			System.out.println(EL_PRODUCTO_ES + electrodomestico1.toStringBasico());

			System.out.println(DESEA_COMPRARLO_SI_1_NO_2_FIN_0);

			respuesta = input.nextInt();
			input.nextLine();
			
			if (respuesta == AFIRMATIVA) {
				System.out.println(DETALLEPRODUCTO);
				electrodomestico1.imprimir();
				System.out.println(CONFIRMAONO);
				respuesta = input.nextInt();
				if (respuesta == AFIRMATIVA) {
					listaCompraCliente.add(electrodomestico1);
					
				} else {
					respuesta = NEGATIVA;
				}
			}
			i++;

		} while (respuesta != SALIR && i < tamanioLista);
		System.out.println(FIN_DEL_PROGRAMA);

		if (listaCompraCliente.size() > MINIMO_VENTA) {
			Ticket tk1 = new Ticket(listaCompraCliente);
			tk1.imprimir();
			System.out.println(cliente);
		}
	
		
		
	}

	
}
