package parcial5_ortMusic;

import java.util.ArrayList;

public class Cuenta {

	private int idUsuario;
	private String nombreUsuario;
	private ArrayList<Tema>temas;
	
	
	//constructor
	public Cuenta(int idUsuario, String nombreUsuario) {
		super();
		this.idUsuario = idUsuario;
		this.nombreUsuario = nombreUsuario;
		this.temas = new ArrayList<Tema>();
	}
	
	//agregar un tema
	public void agregarTema(String nombreTema, String autor, int anio, String genero ) {
		
		Tema tema = buscarTema(nombreTema);
		if(tema == null) {
			temas.add(new Tema(nombreTema,autor,anio,genero));
			System.out.println("Tema agregado");
		}
		else {
			System.out.println("tema ya existe");
			
		}
		
		
	}
	
	//buscar un tema( es privado porque lo van a usar solo metodos de la misma clase)
	private Tema buscarTema(String nombreTema) {
		Tema temaEncontrado = null;
		int i = 0;

		while(i < temas.size() && temaEncontrado == null) {
			if(temas.get(i).getTituloCancion().equals(nombreTema)) {
				temaEncontrado = temas.get(i);
			}
			i++;
		}
		
		
		return temaEncontrado;
	}
	
	//reproducir tema
	public void reproducirTema(String nombreTema) {
		
		Tema temaEncontrado = null;
		
		temaEncontrado = buscarTema(nombreTema);
		if(temaEncontrado != null) {
			temaEncontrado.setCantReprod(1);
			System.out.println("Reproduciendo cancion: "+nombreTema );
			System.out.println("La cantidad de reproducciones es "+ temaEncontrado.getCantReprod());
		}
		else {
			System.out.println("Cancion no existe");
		}
	}
	
	//listar temas
	public void listarTemas(String genero) {
		ArrayList<Tema>coinciden = buscarTemaPorGenero(genero);
		
		System.out.println(coinciden);
		
		
	}
	
	
	//buscar temas por genero
	private ArrayList<Tema> buscarTemaPorGenero(String genero) {
		Tema coincideGenero = null;
		ArrayList<Tema>lista = new ArrayList();
		int i = 0;
		
		for (Tema tema : temas) {
			if(tema.getGenero().equals(genero)) {
				coincideGenero = tema;
				lista.add(coincideGenero);
			}	
		}
		return lista;
	}
	
	//tema mas reproducido
	
	
	public void temaMasReproducido(String genero) {
		
	Tema masReproducido = buscarMasReproducido(genero);
		
		System.out.println(masReproducido);
	}
	
	
	private Tema buscarMasReproducido(String genero) {
		Tema temaMasRep = null;
		int cantRepMax = 0;
		
		for (Tema tema : temas) {
			if(tema.getGenero().equals(genero)) {
				
				if(tema.getCantReprod() > cantRepMax) {
					temaMasRep = tema;
					cantRepMax = tema.getCantReprod();
				}
				
			}
			
		}
		
		
		return temaMasRep;
	}
	
	
}
