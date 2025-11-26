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
        Profesor profesor1 = new Profesor("David", "Matematicas");
        Alumno alumno1 = new Alumno("Pedro", "4A");
        
        System.out.println(profesor1.saludar());
        System.out.println(alumno1.saludar());
        
        System.out.println("");
        
        Persona profesor2 = new Profesor("Antonio", "Lengua");
        Persona alumno2 = new Alumno("Esteban", "2C");
        
        System.out.println(profesor2.saludar());
        System.out.println(alumno2.saludar());
    }
}