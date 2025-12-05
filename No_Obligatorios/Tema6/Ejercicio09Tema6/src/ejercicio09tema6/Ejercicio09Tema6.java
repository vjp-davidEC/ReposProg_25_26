/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio09tema6;

/**
 *
 * @author alumno
 */
public class Ejercicio09Tema6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Objetos que se crean de la clase {Persona, Vehiculo} con sus atributos
        Persona p1 = new Persona("39467649D", 18500.75);
        Vehiculo v1 = new Vehiculo(1600, "2511HTF", "22663665F");

        //Mostrar los datos de los dos objetos
        p1.mostrarDatos();
        System.out.println("");
        v1.mostrarDatos();
    }
}