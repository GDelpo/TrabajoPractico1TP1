package Ejercicio1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Grupo n1 = new Grupo("grupo1");
		
		n1.integrantes.add("agusto");
		
		
		
		n1.integrantes.add("guido");
		
		System.out.println(n1.toString());
		
        n1.agregarIntegrante("guido");
        
        System.out.println(n1.toString());
        
        System.out.println(n1.obtenerIntegrante(1));
        
        n1.agregarIntegrante("carlitos");
        
        System.out.println(n1.toString());
        
//        Scanner input = new Scanner(System.in); 
//        
//        System.out.println("Ingrese un nombre:" );
//        
//        String buscado = input.nextLine();
//                         
//        System.out.println(n1.buscarIntegrante(buscado));
//        
//       System.out.println(n1.toString());
       
        n1.mostrar();
       
	}

}
