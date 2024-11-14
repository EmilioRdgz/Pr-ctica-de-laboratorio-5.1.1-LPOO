import java.io.Serializable;
import java.util.Date;

public class Prestamo implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private int id;
    private Libro libro;
    private Usuario usuario;
    private Date fechaInicio;
    private Date fechaVencimiento;

    public Prestamo(int id, Libro libro, Usuario usuario, Date fechaInicio, Date fechaVencimiento) {
        this.id = id;
        this.libro = libro;
        this.usuario = usuario;
        this.fechaInicio = fechaInicio;
        this.fechaVencimiento = fechaVencimiento;
    }

    // Métodos getters y setters
    public int getId() {
        return id;
    }

    public Libro getLibro() {
        return libro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    @Override
    public String toString() {
        return "Prestamo [ID=" + id + ", Libro=" + libro.getTitulo() + ", Usuario=" + usuario.getNombre() +
                ", Fecha Inicio=" + fechaInicio + ", Fecha Vencimiento=" + fechaVencimiento + "]";
    }
}

