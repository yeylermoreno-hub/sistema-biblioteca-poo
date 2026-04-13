public abstract class Publicacion {
// Atributos privados - Encapsulamiento (Unidad II)
private String titulo;
private String autor;
private int añoPublicacion;
private boolean disponible;

// Constructor
public Publicacion(String titulo, String autor, int añoPublicacion) {
this.titulo = titulo; // variable local 'titulo'
this.autor = autor;
this.añoPublicacion = añoPublicacion;
this.disponible = true;
}

// Getters y Setters públicos (modificador public)
public String getTitulo() { return titulo; }
public String getAutor() { return autor; }
public int getAñoPublicacion() { return añoPublicacion; }
public boolean isDisponible() { return disponible; }
public void setDisponible(boolean disponible) { this.disponible = disponible; }

// Método abstracto polimórfico (Unidad III)
public abstract void mostrarInfo();
}