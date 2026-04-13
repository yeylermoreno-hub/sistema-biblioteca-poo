public class Main {
public static void main(String[] args) {
Biblioteca biblio = new Biblioteca();

Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", 1605, "978-123456");
Revista revista1 = new Revista("National Geographic", "Varios", 2025, 350);

biblio.agregarPublicacion(libro1);
biblio.agregarPublicacion(revista1);

Usuario user1 = new Usuario("U001", "Juan Pérez", "Estudiante");
biblio.registrarUsuario(user1);

biblio.listarDisponibles();

System.out.println("\n--- Préstamo ---");
biblio.prestar("El Quijote");

biblio.listarDisponibles();

System.out.println("\n--- Devolución ---");
biblio.devolver("El Quijote");

biblio.listarDisponibles();
}
}
