public class Revista extends Publicacion { // Herencia - subclase
private int numeroEdicion;

public Revista(String titulo, String autor, int año, int numeroEdicion) {
super(titulo, autor, año);
this.numeroEdicion = numeroEdicion;
}

public int getNumeroEdicion() { return numeroEdicion; }

// Polimorfismo: sobrescritura
@Override
public void mostrarInfo() {
System.out.println("📚 REVISTA: " + getTitulo() + " | Autor: " + getAutor()
+ " | Edición: " + numeroEdicion + " | Disponible: " + (isDisponible() ? "Sí" : "No"));
}
}