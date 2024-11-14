import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Creación de objetos de prueba
        Libro libro1 = new Libro(1, "El Quijote", "Miguel de Cervantes", "123456789", true);
        Usuario usuario1 = new Usuario(1, "Juan Perez", "Estudiante", "S12345");

        // Creación de préstamo
        Prestamo prestamo1 = new Prestamo(1, libro1, usuario1, new Date(), new Date(System.currentTimeMillis() + 864000000L));
        
        // Simulación de impresiones
        System.out.println(libro1);
        System.out.println(usuario1);
        System.out.println(prestamo1);
    }
}

