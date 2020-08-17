package Ej2;

public class Atleta {
private String nombre;
private int tiempo;

public Atleta() {
	this.nombre = getNombre();
	this.tiempo = getTiempo();
}
public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getTiempo() {
	return tiempo;
}
public void setTiempo(int tiempo) {
	this.tiempo = tiempo;
}
@Override
public String toString() {
	return "Atleta [nombre=" + nombre + ", tiempo=" + tiempo + "]";
}

}
