/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06tema6;

/**
 *
 * @author alumno
 */
public class Ejercicio06Tema6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Objetos que se crean de las clases {Libro y Persona}
        Libro libro = new Libro("Don Quijote", "Cervantes", "Novela");
        Persona persona = new Persona("David", "Garcia", "Deivid");

        //Operaciones sobre el objeto libro
        System.out.println("LIBRO:");
        System.out.println("Concatenado: " + libro.concatenarTodo());
        System.out.println("Iniciales: " + libro.obtenerIniciales());
        libro.contarVocales();
        System.out.println("Cadena mas larga: " + libro.obtenerCadenaMasLarga());
        System.out.println("Contiene 'Novela'? " + libro.buscarCadena("Novela"));
        
        //Operaciones sobre el objeto persona
        System.out.println("\nPERSONA:");
        System.out.println("Concatenado: " + persona.concatenarTodo());
        System.out.println("Iniciales: " + persona.obtenerIniciales());
        persona.contarVocales();
        System.out.println("Cadena mas larga: " + persona.obtenerCadenaMasLarga());
        System.out.println("Contiene 'Deivid'? " + persona.buscarCadena("Carlos"));
    }
}