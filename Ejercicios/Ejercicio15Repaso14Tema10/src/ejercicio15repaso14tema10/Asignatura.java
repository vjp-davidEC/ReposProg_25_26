package ejercicio15repaso14tema10;

public class Asignatura {
    //Atributos
    private String nombreAsignatura;
    private float nota;
    
    //Constructores
    public Asignatura() {
        nombreAsignatura = "";
        nota = 0f;
    }

    public Asignatura(String nombreAsignatura, float nota) {
        this.nombreAsignatura = nombreAsignatura;
        this.nota = nota;
    }

    //Getters/Setters
    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    //Mostrar
    @Override
    public String toString() {
        return "La asignatura es " + nombreAsignatura + " y la nota es de " + nota;
    }
}