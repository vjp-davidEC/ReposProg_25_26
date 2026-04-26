package ejercicio04;

public class Estudiante {
    private String nombre;
    private double nota;
    
    public Estudiante() {
        nombre = "";
        nota = 0;
    }

    public Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "El estudiante con nombre " + nombre + " tiene una nota de " + nota;
    }
}