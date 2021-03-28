package parcial3_gestionDePedidos;

public class Pedido {

	private int numeroPedido;
	private int codigoArticulo;
	private int cantidadPedida;
	private double importe;
	private int cantidadPendiente;
	private String estado;

	public Pedido(int numeroPedido, int codigoArticulo, int cantidadPedida, double importe, int cantidadPendiente) {
		this.numeroPedido = numeroPedido;
		this.codigoArticulo = codigoArticulo;
		this.cantidadPedida = cantidadPedida;
		this.importe = importe;
		this.cantidadPendiente = cantidadPendiente;
		this.estado = "P";
	}

	public int dameNumeroPedido() {

		return this.numeroPedido;
	}
	
	public int dameCantidadPedida() {

		return this.cantidadPedida;
	}
	
	public int dameCantidadPendiente() {

		return this.cantidadPendiente;
	}
	
	public void restarCantidadPendiente(int entregada) {
		
		this.cantidadPendiente -= entregada;
	}
	
	
	
	public double dameImporte() {

		return this.importe;
	}

	public void cambiarEstado(String nuevoEstado) {

		this.estado = nuevoEstado;

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	@Override
	public String toString() {
		return "Pedido [numeroPedido=" + numeroPedido + ", codigoArticulo=" + codigoArticulo + ", cantidadPedida="
				+ cantidadPedida + ", importe=" + importe + ", cantidadPendiente=" + cantidadPendiente + ", estado="
				+ estado + "]";
	}

}
