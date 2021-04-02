package ej5;

public class Mueble {
	
	private String nombre;
	private String material;
	private String color;
	public Mueble(String nombre, String material, String color) {
		super();
		this.nombre = nombre;
		this.material = material;
		this.color = color;
	}
	@Override
	public String toString() {
		return "Mueble [nombre=" + nombre + ", material=" + material + ", color=" + color + "]";
	}
	
	
	
}
