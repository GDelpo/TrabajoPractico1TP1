package Ejercicio1;

import java.util.ArrayList;

public class Grupo {

	private String nombre;
	public ArrayList<String> integrantes;

	public Grupo(String nombre) {

		this.nombre = nombre;
		this.integrantes = new ArrayList<String>();

	}

	private void mostrarIntegrantes() {

		System.out.println("Cantidad de Integrantes " + integrantes.size() + "\nIntegrantes=" + integrantes);
	}

	public void mostrar() {
		System.out.println("Nombre del grupo: " + this.nombre);
		mostrarIntegrantes();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<String> getIntegrantes() {
		return integrantes;
	}

	public void setIntegrantes(ArrayList<String> integrantes) {
		this.integrantes = integrantes;
	}

	public int getCantidadIntegrantes() {
		return integrantes.size();
	}

	public void agregarIntegrante(String nombreIntegrante) {

		if (obtenerPosicionIntegrante(nombreIntegrante) == -1) {

			integrantes.add(nombreIntegrante);

		} else {
			System.out.println("Este integrante ya existe en la lista");
		}

	}

	private int obtenerPosicionIntegrante(String nombreIntegrante) {

		int i = 0;
		while (i < integrantes.size() && !integrantes.get(i).equalsIgnoreCase(nombreIntegrante)) {
			i++;
		}

		if (i >= integrantes.size()) {
			i = -1;
		}

		return i;

	}

	public String obtenerIntegrante(int posicion) {

		String nombre = null;

		posicion -= 1;

		if (posicion >= 0 && posicion <= integrantes.size()) {

			nombre = integrantes.get(posicion);

		}

		return nombre;
	}

	public String buscarIntegrante(String nombreIngreganteBuscado) {

		String nombre = null;

		int pos = obtenerPosicionIntegrante(nombreIngreganteBuscado) + 1;

		if (pos != -1) {

			nombre = obtenerIntegrante(pos);

		}
		return nombre;
	}

	

	public String removerIntegrante(String nombreIntegrante) {

		String nombre = buscarIntegrante(nombreIntegrante);

		if (nombre != null) {

			integrantes.remove(nombre);

		}
		return nombre;

	}
	


	public void vaciar() {
		integrantes.removeAll(integrantes);
	}

}
