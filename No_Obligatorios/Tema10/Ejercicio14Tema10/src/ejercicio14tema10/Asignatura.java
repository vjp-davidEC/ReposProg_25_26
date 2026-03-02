/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14tema10;

/**
 *
 * @author alumno
 */
public class Asignatura {
    private String nombreAsignatura;
    private float nota;
    
    public Asignatura() {
        nombreAsignatura = "";
        nota = 0f;
    }

    public Asignatura(String nombreAsignatura, float nota) {
        this.nombreAsignatura = nombreAsignatura;
        this.nota = nota;
    }

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

    @Override
    public String toString() {
        return "La asignatura es " + nombreAsignatura + " y la nota es de " + nota;
    }
    
    
}
