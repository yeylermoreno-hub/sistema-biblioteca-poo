public class Libro extends Publicacion { // Herencia - subclase
private String isbn; // atributo propio

public Libro(String titulo, String autor, int año, String isbn) {
super(titulo, autor, año); // llamada a superclase
this.isbn = isbn;
}

public String getIsbn() { return isbn; }

// Polimorfismo: sobrescritura del método
@Override
public void mostrarInfo() {
System.out.println("📖 LIBRO: " + getTitulo() + " | Autor: " + getAutor()
+ " | ISBN: " + isbn + " | Disponible: " + (isDisponible() ? "Sí" : "No"));
}
}