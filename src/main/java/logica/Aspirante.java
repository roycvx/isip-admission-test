package logica;

public class Aspirante {

    private String nombre;
    private String apellido;
    private String cedula;
    private double puntosObtenidos;
    private String estatus; // "Aceptado" o "Rechazado"

    public Aspirante() {
    }

    public Aspirante(String nombre, String apellido, String cedula, double puntosObtenidos, String estatus) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.puntosObtenidos = puntosObtenidos;
        this.estatus = estatus;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public double getPuntosObtenidos() {
        return puntosObtenidos;
    }

    public void setPuntosObtenidos(double puntosObtenidos) {
        this.puntosObtenidos = puntosObtenidos;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
}
