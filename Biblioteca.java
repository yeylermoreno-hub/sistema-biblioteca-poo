import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
// Atributos privados - Encapsulamiento
private List<Publicacion> publicaciones;
private List<Usuario> usuarios;

public Biblioteca() {
publicaciones = new ArrayList<>(); // variable local en constructor
usuarios = new ArrayList<>();
}

public void agregarPublicacion(Publicacion p) { // método public
publicaciones.add(p);
System.out.println("✅ Agregada: " + p.getTitulo());
}

public void registrarUsuario(Usuario u) {
usuarios.add(u);
System.out.println("✅ Usuario registrado: " + u.getNombre());
}

public void prestar(String titulo) {
for (Publicacion p : publicaciones) { // variable local 'p'
if (p.getTitulo().equalsIgnoreCase(titulo) && p.isDisponible()) {
p.setDisponible(false);
System.out.println("📖 Préstamo realizado: " + titulo);
return;
}
}
System.out.println("❌ No disponible o no encontrado");
}

public void devolver(String titulo) {
for (Publicacion p : publicaciones) {
if (p.getTitulo().equalsIgnoreCase(titulo)) {
p.setDisponible(true);
System.out.println("✅ Devolución realizada: " + titulo);
return;
}
}
}

public void listarDisponibles() {
System.out.println("\n=== PUBLICACIONES DISPONIBLES ===");
for (Publicacion p : publicaciones) { // variable local 'p'
if (p.isDisponible()) {
p.mostrarInfo(); // polimorfismo
}
}
}
}