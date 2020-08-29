package Ejercicio2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Atleta a1 = new Atleta("Guido", 10.2);
		Atleta a2 = new Atleta("Agusto", 10.2);
		Atleta a3 = new Atleta("Carlos", 9);
		Atleta a4 = new Atleta("Fernando", 11);

		Carrera c1 = new Carrera();

		c1.agregarAtleta(a1);
		c1.agregarAtleta(a2);
		c1.agregarAtleta(a3);
		c1.agregarAtleta(a4);
		
		
		c1.mostrarGanadores();

	}

}
