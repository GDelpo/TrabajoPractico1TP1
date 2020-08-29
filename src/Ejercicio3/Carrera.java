package Ejercicio3;

import java.util.ArrayList;

import Ejercicio2.Atleta;

public class Carrera {

	private ArrayList<Atleta> atletas;

	public Carrera() {

		this.atletas = new ArrayList<>();

	}

	public void agregarAtleta(Atleta atleta) {

		atletas.add(atleta);
		System.out.println("Se agrego a la carrera: " + atleta.toString());
	}

	private ArrayList<Atleta> buscarGanador() {

		ArrayList<Atleta> ganadores = new ArrayList<Atleta>();

		double mejorTiempo = Double.MAX_VALUE;

		for (Atleta atleta : atletas) {

			if (atleta.getTiempo() < mejorTiempo) {

				mejorTiempo = atleta.getTiempo();
				ganadores.clear();
				ganadores.add(atleta);
			} else if (atleta.getTiempo() == mejorTiempo) {
				ganadores.add(atleta);
			}

		}

		return ganadores;

	}

}
