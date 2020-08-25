package EjercicioDos;

public class Atleta {
private String nombre;
private double tiempo;

public Atleta(String nombre, double tiempo) {
	this.nombre = getNombre();
	this.tiempo = getTiempo();
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
	return "Atleta [nombre=" + nombre + ", tiempo=" + tiempo + "]";
}

}
