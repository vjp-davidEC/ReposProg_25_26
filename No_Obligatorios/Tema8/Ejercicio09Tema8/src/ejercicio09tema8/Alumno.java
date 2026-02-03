/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio09tema8;

import java.util.Scanner;

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

    //Metodos
    //Método que permite introducir las notas del alumno
    public void rellenarNotas(String[] asignaturas) {
        Scanner entrada = new Scanner(System.in);
        //Se recorre todas las asignaturas del alumno
        for (int i = 0; i < asignaturas.length; i++) {
            //Se pide la nota correspondiente a esa asignatura
            System.out.print("Nota de " + asignaturas[i] + ": ");
            float nota = entrada.nextFloat();
            //Se crea el objeto Asignatura con su nombre y nota
            notas[i] = new Asignatura(asignaturas[i], nota);
        }
    }
    
    //Método que muestra por pantalla todas las notas del alumno
    public void mostrarNotas() {
        System.out.println("Alumno: " + nombreAlumno);
        for (int i = 0; i < notas.length; i++) {
            System.out.println(" - " + notas[i].getNombreAsignatura() + ": " + notas[i].getNota());
        }
    }
    
    //Método que calcula la media del alumno
    public float calcularMedia() {
        float suma = 0f;
        //Se suma todas las notas
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i].getNota();
        }
        //Se devuelve la media
        return suma / notas.length;
    }
    
    //Método que cuenta cuántas asignaturas tiene suspensas el alumno
    public int contarSuspensos() {
        int contador = 0;
        for (int i = 0; i < notas.length; i++) {
            //Si la nota es menor que 5, sumamos un suspenso
            if (notas[i].getNota() < 5) {
                contador++;
            }
        }
        return contador;
    }
    
    //Método que devuelve la nota de una asignatura según su posición en el array
    public float getNotaPorPosicion(int pos) {
        return notas[pos].getNota();
    }
    
    //Mostrar
    @Override
    public String toString() {
        return "Alumno{" + "nombreAlumno=" + nombreAlumno + ", notas=" + notas + '}';
    }
}