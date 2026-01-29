/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio09tema8;

/**
 *
 * @author alumno
 */
public class Asignatura {
    //Atributos
    private String nombreAsignatura;
    private float nota;
    
    //Constructores
    public Asignatura(){
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
        return "Asignatura{" + "nombreAsignatura=" + nombreAsignatura + ", nota=" + nota + '}';
    }
}