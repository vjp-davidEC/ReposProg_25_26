/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14tema10;

/**
 *
 * @author alumno
 */
public class Alumno {
    private String nombreAlumno;
    private Asignatura[] notas;
    
    public Alumno() {
        nombreAlumno = "";
        notas = new Asignatura[0];
    }

    public Alumno(String nombreAlumno, Asignatura[] notas) {
        this.nombreAlumno = nombreAlumno;
        this.notas = notas;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public Asignatura[] getNotas() {
        return notas;
    }

    public void setNotas(Asignatura[] notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "El alumno es " + nombreAlumno + " y tiene una nota de " + notas;
    }
}