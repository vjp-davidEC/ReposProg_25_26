/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio09tema8;

/**
 *
 * @author alumno
 */
public class Alumno {
    //Atributos
    private String nombreAlumno;
    private Asignatura[] notas;
    
    //Constructores
    public Alumno(){
        nombreAlumno = "";
        notas = new Asignatura[4];//Array ya creado
    }

    public Alumno(String nombreAlumno, Asignatura[] notas) {
        this.nombreAlumno = nombreAlumno;
        this.notas = notas;
    }

    //Getters/Setters
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

    //Mostrar
    @Override
    public String toString() {
        return "Alumno{" + "nombreAlumno=" + nombreAlumno + ", notas=" + notas + '}';
    }
}