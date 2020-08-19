package Ejercico2;

public class Test {

	public static void main(String[] args) {
		
		Atleta n1 = new Atleta("carlitos", 2.1);
		
	Carrera c1 = new Carrera(10);
	
	Atleta n2 = new Atleta("miguel", 3.1);
	
	c1.agregarIntegrante(n2);
	c1.agregarIntegrante(n1);
	
	c1.toString();
	
	
	

	}

}
