package Ejer4;

import java.util.Arrays;

public class Anio {

	String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
			"Octubre", "Noviembre", "Diciembre" };
	int[] diasXmes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public Anio() {
		this.meses = meses;
	}

	public String getNombreMes(int numeroMes) {
		return meses[numeroMes - 1];
	}

	public int diasTranscurridos(int numeroMes) {
		int diasTotales = 0;
		for (int i = 0; i < numeroMes - 1; i++) {
			diasTotales += diasXmes[i];
		}
		return diasTotales;
	}

	@Override
	public String toString() {
		return "Meses del año: " + Arrays.toString(meses);
	}

}
