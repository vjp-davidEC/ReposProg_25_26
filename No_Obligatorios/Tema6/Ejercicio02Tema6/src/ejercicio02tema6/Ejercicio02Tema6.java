/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02tema6;

/**
 *
 * @author alumno
 */
public class Ejercicio02Tema6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ///Objetos que se crean de la clase {Profesor, Alumno} con sus atributos
        Profesor profesor1 = new Profesor("David", "Matematicas");
        Alumno alumno1 = new Alumno("Pedro", "4A");
        
        //Se llama al método saludar() de cada objeto y se muestra por pantalla
        System.out.println(profesor1.saludar());
        System.out.println(alumno1.saludar());
        
        System.out.println("");
        
        //Objetos que se crean de tipo Profesor y Alumno pero referenciados desde la superclase Persona
        Persona profesor2 = new Profesor("Antonio", "Lengua");
        Persona alumno2 = new Alumno("Esteban", "2C");
        
        //Ejecutar el método saludar() de la Clase Persona con poliformismo
        System.out.println(profesor2.saludar());
        System.out.println(alumno2.saludar());
    }
}