/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04tema6;

/**
 *
 * @author alumno
 */
public class Ejercicio04Tema6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro perro = new Perro("Wolfy", 13, 12.5);
        Lobo lobo = new Lobo("Lobo Iberico", 7, 40);
        Leon leon = new Leon("Simba", 6, 190.5);
        Gato gato = new Gato("Kira", 9, 5.2);
        
        System.out.println("Mostrar los datos");
        perro.mostrarDatos();
        System.out.println("");
        lobo.mostrarDatos();
        System.out.println("");
        leon.mostrarDatos();
        System.out.println("");
        gato.mostrarDatos();
        System.out.println("");
        
        System.out.println("");
        
        Animal aperro = new Perro("Estrella", 7, 13.6);
        Animal alobo = new Lobo("Grey", 8, 40.5);
        Animal aleon = new Leon("Nala", 5, 180.45);
        Animal agato = new Gato("Nula", 2, 3.5);
        
        System.out.println("Mostrar los datos");
        aperro.mostrarDatos();
        System.out.println("");
        alobo.mostrarDatos();
        System.out.println("");
        aleon.mostrarDatos();
        System.out.println("");
        agato.mostrarDatos();
        System.out.println("");
    }
    
}
