import java.io.Serializable;

public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private int id;
    private String nombre;
    private String tipoUsuario;  // "Estudiante" o "Profesor"
    private String matricula;

    public Usuario(int id, String nombre, String tipoUsuario, String matricula) {
        this.id = id;
        this.nombre = nombre;
        this.tipoUsuario = tipoUsuario;
        this.matricula = matricula;
    }

    // Métodos getters y setters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public String getMatricula() {
        return matricula;
    }

   
    public String toString() {
        return "Usuario [ID=" + id + ", Nombre=" + nombre + ", Tipo=" + tipoUsuario + ", Matricula=" + matricula + "]";
    }
}
