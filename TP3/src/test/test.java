package test;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mother mother1 = new Mother("asus");
		
		Computadora pc1 = new Computadora("otraCosa", 2, mother1  );
		System.out.println(pc1);

		pc1.peso = 24;
		
		pc1.setMarca("patito");
		
		System.out.println(pc1);
		
		Computadora pc2 = new Computadora ();

		
		System.out.println(pc2);
	
	
		pc1.pedirNombre(mother1);
		pc2.pedirNombre(mother1);

		
	System.out.println(pc1.pedirNombre(mother1));
	
	
	//System.out.println(mother1.getNombre());
	
	
	}

}
