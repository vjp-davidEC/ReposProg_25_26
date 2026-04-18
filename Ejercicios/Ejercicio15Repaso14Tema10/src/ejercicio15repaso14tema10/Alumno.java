package ejercicio15repaso14tema10;

import java.util.Scanner;

public class Alumno {
    //Atributos
    private String nombreAlumno;
    private Asignatura[] asignaturas;
    
    //Constructores
    public Alumno() {
        nombreAlumno = "";
        asignaturas = new Asignatura[3];
    }

    public Alumno(String nombreAlumno, Asignatura[] asignaturas) {
        this.nombreAlumno = nombreAlumno;
        this.asignaturas = asignaturas;
    }
    
    public Alumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
        this.asignaturas = new Asignatura[3];
    }

    //Getters/Setters
    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public Asignatura[] getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(Asignatura[] asignaturas) {
        this.asignaturas = asignaturas;
    }

    //Metodos
    //Método que permite introducir las notas del alumno
    public void rellenarNotas(String[] asig) {
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < asig.length; i++) {
            System.out.print("Nota de " + asig[i] + ": ");
            float nota = entrada.nextFloat();
            asignaturas[i] = new Asignatura(asig[i], nota);
        }
    }
    
    //Método que muestra por pantalla todas las notas del alumno
    public void mostrarNotas() {
        System.out.println("Alumno: " + nombreAlumno);
        for (Asignatura a : asignaturas) {
            System.out.println(" - " + a.getNombreAsignatura()+ ": " + a.getNota());
        }
    }
    
    //Método que calcula la media del alumno
    public float calcularMedia() {
        float suma = 0;
        for (Asignatura a : asignaturas) {
            suma += a.getNota();
        }
        return suma / asignaturas.length;
    }
    
    //Método que devuelve la nota de una asignatura según su posición en el array
    public float getNotaPorPosicion(int pos) {
        return asignaturas[pos].getNota();
    }
    
    //Mostrar
    @Override
    public String toString() {
        return "El alumno es " + nombreAlumno + " y tiene la asignatura de " + asignaturas;
    }
}