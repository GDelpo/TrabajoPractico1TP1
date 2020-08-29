package Ejercicio2;

public class Atleta {
	
	private String nombre;
	private double tiempo;
	
	
	public Atleta(String nombre, double tiempo) {
		
		setNombre(nombre);
		setTiempo(tiempo);
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getTiempo() {
		return tiempo;
	}


	public void setTiempo(double tiempo) {
		this.tiempo = tiempo;
	}


	@Override
	public String toString() {
		return "\nNombre del atleta: " + nombre + ", Tiempo realizado: " + tiempo;
	}
	
	
	
	

}
