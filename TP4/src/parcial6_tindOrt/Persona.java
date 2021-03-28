package parcial6_tindOrt;

public class Persona {

	
		//atributos de la persona
		private String nombre;
		private String mail;
		private Genero genero;
		private int edad;
		
		//atributos que desea la persona
	
		private Genero generoDeseado;
		private int edadMinDeseada ;
		private int edadMaxDeseada ;
		
		
		
		
		//getters
		
		public String getNombre() {
			return nombre;
		}

		public String getMail() {
			return mail;
		}

		public Genero getGenero() {
			return genero;
		}

		public int getEdad() {
			return edad;
		}

		public Genero getGeneroDeseado() {
			return generoDeseado;
		}

		public int getEdadMinDeseada() {
			return edadMinDeseada;
		}

		public int getEdadMaxDeseada() {
			return edadMaxDeseada;
		}

		//constructor
		public Persona(String nombre, String mail, Genero genero, int edad, Genero generoDeseado,
				int edadMinDeseada, int edadMaxDeseada) {
			this.nombre = nombre;
			this.mail = mail;
			this.genero = genero;
			this.edad = edad;
			this.generoDeseado = generoDeseado;
			this.edadMinDeseada = edadMinDeseada;
			this.edadMaxDeseada = edadMaxDeseada;
		}







		@Override
		public String toString() {
			return "Persona [nombre=" + nombre + ", mail=" + mail + ", genero=" + genero + ", edad=" + edad
					+ ", generoDeseado=" + generoDeseado + ", edadMinDeseada=" + edadMinDeseada + ", edadMaxDeseada="
					+ edadMaxDeseada + "]";
		}

		

		
		
}
