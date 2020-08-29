package Ejercicio2;

import java.util.ArrayList;

public class Carrera {

	private ArrayList<Atleta> atletas;

	public Carrera() {

		this.atletas = new ArrayList<>();
	}

	public void agregarAtleta(Atleta atleta) {

		atletas.add(atleta);
		System.out.println("Se agrego a la carrera: " + atleta.toString());
	}

	@Override
	public String toString() {
		return "Carrera [atletas=" + atletas + "]";
	}

	private ArrayList<Atleta> buscarGanador() {

		ArrayList<Atleta> ganadores = new ArrayList<Atleta>();
		
		double mejorTiempo = Double.MAX_VALUE;
		
		for (Atleta atleta : atletas) {
			
			if (atleta.getTiempo() < mejorTiempo) {
				
				mejorTiempo = atleta.getTiempo();
				ganadores.clear();				
				ganadores.add(atleta);
			}else if (atleta.getTiempo() == mejorTiempo) {
				ganadores.add(atleta);
			}
			
			
		}

		return ganadores;

	}
	
	public void mostrarGanadores() {
		if (buscarGanador().size() > 1) {
			System.out.println("Los ganadores son: " + buscarGanador());
		}else {
			System.out.println("El ganador es: " + buscarGanador());
		}
		
		
	}

}
