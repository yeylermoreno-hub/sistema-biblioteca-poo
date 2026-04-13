public class Usuario {
private String id;
private String nombre;
private String tipo; // Estudiante o Profesor

public Usuario(String id, String nombre, String tipo) {
this.id = id;
this.nombre = nombre;
this.tipo = tipo;
}

public String getId() { return id; }
public String getNombre() { return nombre; }
public String getTipo() { return tipo; }
}