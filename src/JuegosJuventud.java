package Ej2;
import java.util.ArrayList;
import java.util.Scanner;

public class JuegosJuventud {
	private static ArrayList<Atleta> atletas = new ArrayList<Atleta>(0);
	public static Scanner input = new Scanner(System.in); // cerrar el scanner al final
	
	public Atleta encontrarGanador(ArrayList<Atleta> atletas) {
		int tiempoMasRapido = Integer.MAX_VALUE;
		Atleta masRapido = null;
		for(int i= 0; i < atletas.size(); i++) {
			if(tiempoMasRapido>atletas.get(i).getTiempo()) {
				tiempoMasRapido=atletas.get(i).getTiempo();
				masRapido = atletas.get(i);
			}
			
		}
		return masRapido;
	}
	public static void main(String[] args) {
	
	

	}

}
/*
 * Para los Juegos Olímpicos de la Juventud nos pidieron un programa con el cual
 * podamos calcular quién fue el ganador de una carrera. Para eso ingresaremos
 * un atleta y los segundos que ha empleado (con decimales) para recorrer la
 * distancia de una especialidad determinada. debe tener en cuenta que puede
 * haber más de un ganador (sus tiempos empleados fueron los mismos)
 */