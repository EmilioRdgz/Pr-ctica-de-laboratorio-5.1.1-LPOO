import java.io.Serializable;

public class Libro implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private int id;
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponibilidad;

    public Libro(int id, String titulo, String autor, String isbn, boolean disponibilidad) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponibilidad = disponibilidad;
    }

    // Métodos getters y setters
    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isDisponible() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    
    public String toString() {
        return "Libro [ID=" + id + ", Titulo=" + titulo + ", Autor=" + autor + ", ISBN=" + isbn +
                ", Disponibilidad=" + disponibilidad + "]";
    }
}

