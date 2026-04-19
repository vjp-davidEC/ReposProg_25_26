package ejercicio03;

public class Alumno {
    private String nombre;
    private double nota;
    
    public Alumno() {
        nombre = "";
        nota = 0;
    }

    public Alumno(String nombre, double nota) {
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
        return "El alumno " + nombre + " tine una nota de un " + nota;
    }
}