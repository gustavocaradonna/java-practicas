package ej3;

import java.util.ArrayList;

import ej4.Imprimible;
import ej4.Ticket;

public abstract class Electrodomestico implements Imprimible {
	
	private String marca;
	private String modelo;
	private String numero;
	private String voltaje;
	private boolean estado;
	private double precio;
	
	
	public Electrodomestico(String marca, String modelo, String numero, String voltaje, boolean estado, double precio) {
		super();
		setMarca(marca);
		setModelo(modelo);
		setNumero(numero);
		setVoltaje(voltaje);
		setEstado(estado);
		setPrecio(precio);
	}


	private void setMarca(String marca) {
		this.marca = marca;
	}


	private void setModelo(String modelo) {
		this.modelo = modelo;
	}


	private void setNumero(String numero) {
		this.numero = numero;
	}


	private void setVoltaje(String voltaje) {
		this.voltaje = voltaje;
	}


	private void setEstado(boolean estado) {
		this.estado = estado;
	}


	private void setPrecio(double precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return " marca=" + marca + ", modelo=" + modelo + ", numero=" + numero + ", voltaje=" + voltaje
				+ ", estado=" + estado + ", precio=" + precio + "]";
	}

	
	public String toStringBasico() {
		return ", marca:" + marca + ", modelo:" + modelo;
	}


	public double getPrecio() {
		return precio;
	}
	
	
	public void imprimir() {
		System.out.println(toString());
	}

	

	
	
	

}
