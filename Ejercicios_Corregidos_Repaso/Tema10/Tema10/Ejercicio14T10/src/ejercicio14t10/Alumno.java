/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14t10;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Alumno {
    // ATRIBUTOS
    private String nombre;
    private Asignatura[] vAsignaturas;
    
    // CONSTRUCTORES
    public Alumno(){
        this.nombre = "";
        this.vAsignaturas = new Asignatura[3];
    }
    
    public Alumno(String nombre){
        this.nombre = nombre;
        this.vAsignaturas = new Asignatura[3];
    }

    // GETTER Y SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Asignatura[] getvAsignaturas() {
        return vAsignaturas;
    }

    public void setvAsignaturas(Asignatura[] vAsignaturas) {
        this.vAsignaturas = vAsignaturas;
    }
    
    // MÉTODOS
    private float pedirNota(){
        Scanner entrada = new Scanner(System.in);                
        System.out.print("Nota: ");    
        return entrada.nextFloat();
    }
    
    public void rellenarAsignaturas(String[] vNombresAsignaturas){                
        System.out.println("Notas de " + this.nombre + ": ");
        for(int i = 0;i < this.vAsignaturas.length;i++){
            System.out.print("    " + vNombresAsignaturas[i] + ": ");            
            this.vAsignaturas[i] = new Asignatura(vNombresAsignaturas[i], pedirNota());
        }
    }
    
    public void mostrarAlumno(){
        System.out.println(this.nombre + ": ");
        for(int i = 0; i < this.vAsignaturas.length; i++){            
            System.out.println(vAsignaturas[i]);
        }
    }
    
    public float getTotalNotas(){
        float suma = 0;
        for(int i = 0;i < this.vAsignaturas.length;i++){
            suma = suma + this.vAsignaturas[i].getNota();
        }
        return suma;
    }
    
    public float getNotaPorPosicion(int pos){
        return this.vAsignaturas[pos].getNota();
    }
    
    // TO STRING
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", vAsignaturas=" + vAsignaturas + '}';
    }   
}
