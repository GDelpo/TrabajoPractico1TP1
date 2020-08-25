package EjercicioDos;

import java.util.ArrayList;

import Ejercico2.Atleta;

public class Carrera {

	private int distancia;
	public ArrayList<Atleta> participantes;

	public Carrera(int distancia) {
		this.distancia = setDistancia(distancia);
		this.participantes = new ArrayList<Atleta>();
	}

	@Override
	public String toString() {
		return "Carrera [distancia=" + distancia + ", participantes=" + participantes + "]";
	}

	public int getDistancia() {
		return distancia;
	}

	public int setDistancia(int distancia) {
		while (distancia > 0) {
			this.distancia = distancia;
		}
		return distancia;
	}

	public ArrayList<Atleta> getParticipantes() {
		return participantes;
	}

	public void setParticipantes(ArrayList<Atleta> participantes) {
		this.participantes = participantes;
	}

	public int getCantidadParticipantes() {
		return participantes.size();
	}

	public void agregarIntegrante(Atleta nombreIntegrante) {

		if (obtenerPosicionIntegrante(nombreIntegrante) == -1) {

			participantes.add(nombreIntegrante);

		} else {
			System.out.println("Este integrante ya existe en la lista");
		}

	}

	private int obtenerPosicionIntegrante(Atleta nombreIntegrante) {

		int i = 0;
		while (i < participantes.size() && !participantes.get(i).equals(nombreIntegrante)) {
			i++;
		}

		if (i >= participantes.size()) {
			i = -1;
		}

		return i;

	}

	public void encontrarGanador(ArrayList<Atleta> participantes) {

		ArrayList<Atleta> multiplesGanadores = new ArrayList<Atleta>();
		double tiempoMasRapido = Double.MAX_VALUE;
		Atleta masRapido = null;

		for (int i = 0; i < participantes.size(); i++) {
			if (tiempoMasRapido > participantes.get(i).getTiempo()) {
				tiempoMasRapido = participantes.get(i).getTiempo();
				masRapido = participantes.get(i);
			} else if (tiempoMasRapido == participantes.get(i).getTiempo()) {
				multiplesGanadores.add(participantes.get(i));
			}
		}
		multiplesGanadores.add(masRapido); // este add es para agregar al 1er atleta mas ripido encontrado
		System.out.println(multiplesGanadores);

	}

}
