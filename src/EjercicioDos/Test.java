package EjercicioDos;

import Ejercico2.Atleta;
import Ejercico2.Carrera;

public class Test {

	public static void main(String[] args) {
		Atleta a1 = new Atleta("a1", 11.1);
		Atleta a2 = new Atleta("a2", 10.1);
		Atleta a3 = new Atleta("a3", 09.1);
		
		Carrera c1 = new Carrera(100);
		c1.agregarIntegrante(a1);
		c1.agregarIntegrante(a2);
		c1.agregarIntegrante(a3);
		
		//a1.toString();
		System.out.println(a1.toString());
	}

}
