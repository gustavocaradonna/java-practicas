package parcial3_gestionDePedidos;

import java.util.ArrayList;

public class Empresa {

	private ArrayList<Pedido> pedidos;

	public Empresa() {
		this.pedidos = new ArrayList<Pedido>();
	}

	public void cargarPedido(int numeroPedido, int codigoArt, int cantidadPedida, double importe,
			int cantidadPendiente) {

		Pedido miPedido = buscarPedido(numeroPedido);

		if (miPedido == null) {

			miPedido = new Pedido(numeroPedido, codigoArt, cantidadPedida, importe, cantidadPendiente);
			this.pedidos.add(miPedido);
		}
	}

	private Pedido buscarPedido(int numeroPedido) {
		Pedido miPedido = null;
		int i = 0;
		while (i < pedidos.size() && miPedido == null) {

			if (pedidos.get(i).dameNumeroPedido() == numeroPedido) {

				miPedido = pedidos.get(i);
			} else {
				i++;
			}
		}
		return miPedido;
	}

	public void pedidoMasAlto() {

		double max = 0;
		Pedido pedidoMax = null;
		double cuenta = 0;

		for (Pedido pedido : pedidos) {

			cuenta = pedido.dameImporte() * pedido.dameCantidadPedida();

			if (cuenta > max) {
				pedidoMax = pedido;
				max = cuenta;
			}

		}

		System.out.println("El maximo es " + pedidoMax + " con " + max);
	}

	public void entregar(int numeroPedido, int cantidadEntregada) {

		Pedido miPedido = buscarPedido(numeroPedido);

		if (miPedido != null) {

			if (miPedido.dameCantidadPendiente() > 0) {

				miPedido.restarCantidadPendiente(cantidadEntregada);
				if (miPedido.dameCantidadPendiente() == 0) {
					miPedido.cambiarEstado("E");
				}

			}

		}

	}

	public void listarPedidos() {
		for (Pedido pedido : pedidos) {
			System.out.println(pedido);
		}
	}

}
