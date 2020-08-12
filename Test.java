package Ejercicio1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Grupo n1 = new Grupo("grupo1");
		
		n1.integrantes.add("agusto");
		
		
		
		n1.integrantes.add("guido");
		
		System.out.println(n1.toString());
		
        n1.agregarIntegrante("carlitos");
        
        System.out.println(n1.toString());
        
        System.out.println(n1.obtenerIntegrante(2));
	}

}
