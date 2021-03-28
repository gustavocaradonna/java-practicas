package parcial2;

import java.util.ArrayList;

public class Edificio {
	
	
	private String direccion;
	private int cantidadDepartamentos;
	public ArrayList<Departamento> departamentos;
	
	
	//constructor
		public Edificio(String direccion, int cantidadDepartamentos) {
			// TODO Auto-generated constructor stub
			
			this.direccion = direccion;
			this.cantidadDepartamentos = cantidadDepartamentos;
			this.departamentos = new ArrayList<Departamento>();
		}
	
		
		//agregar unidad
		public void agregarUnidad(int unidad, int dni, String propietario) {
			
			if(buscarDepto(unidad)) {
			
				departamentos.add(new Departamento(unidad, dni , propietario));

			}
			
			
		}
		
		
		//actualizar voto
		
		public void actualizarVoto(int numeroUnidad, boolean voto) {
			
			int i = 0;
			Departamento depto = null;
			boolean noExiste = false;

			while (i < departamentos.size() && depto == null) {
				
				if (this.departamentos.get(i).getNumeroUnidad() == numeroUnidad) {
				depto = departamentos.get(i);
				departamentos.get(i).setVoto(voto);
				System.out.println("Voto actualizado, ahora es " + voto);
				
				} else {
				
					i++;
				}
				}
			
			if(depto == null) {
			System.out.println("La unidad no existe");
			}
		
		}
	
	
		
		//existe?
		private boolean buscarDepto(int numeroUnidad) {
			
			int i = 0;
			Departamento depto = null;
			boolean noExiste = false;

			while (i < departamentos.size() && depto == null) {
				
				if (this.departamentos.get(i).getNumeroUnidad() == numeroUnidad) {
				depto = departamentos.get(i);
				} else {
				
					i++;
				}
				}
			
			if(depto == null) {
				noExiste = true;
			}
			return noExiste;
		
		}
		

		public void listarVotosPositivos () {
			
			for (Departamento departamento: departamentos) {
				
				if(departamento.getVoto()) {
					System.out.println(departamento);
					
				}
			}
		}

		public void calcularPorcentaje() {
			
			double positivos = 0;
			double negativos = 0;
			double resultado;
			
			for (Departamento departamento: departamentos) {
				if(departamento.getVoto()) {
					positivos++;
				}else {
					negativos++;
				}
				
			}
			
			resultado = (positivos/(positivos+negativos))*100;
			
			System.out.println("El resultado de votos positivos es " + resultado + "%.");
			
		}
		
		
		
		
	
	

		
}
