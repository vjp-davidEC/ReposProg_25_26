/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12tema6;

/**
 *
 * @author DAVID
 */
public class Ejercicio12Tema6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Objetos que se crean de las clases {Serie-Estudio-Videojuego} con sus atributos
        Serie s1 = new Serie("Dark", "Drama", 3, "Baran bo Odar");
        Estudio est1 = new Estudio("Naughty Dog", "The Last of Us Part II");
        Videojuego v1 = new Videojuego("Uncharted", "Aventura", 15, est1);
        
        //Mostrar los procesos de los obejtos de la Serie y Videojuego
        System.out.println("--SERIE--");
        s1.entregar();
        s1.valorar();
        System.out.println("\nEntregada?: " + s1.esEntregado());
        s1.devolver();
        System.out.println("Entregada?: " + s1.esEntregado());

        System.out.println("\n--VIDEOJUEGO--");
        v1.entregar();
        v1.valorar();
        System.out.println("\nEntregado?: " + v1.esEntregado());
        v1.devolver();
        System.out.println("Entregado?: " + v1.esEntregado());
        
        //Se usa la interfaz Contenido para trabajar con {Serie-Videojuego} con polimorfismo
        System.out.println("\n--POLIMORFISMO {SERIE/VIDEOJUEGO}--");
        Contenido c1 = new Serie("Dark", "Drama", 3, "Baran bo Odar");
        c1.entregar();
        c1.valorar();
        System.out.println("\nEntregado?: " + c1.esEntregado());
        c1.devolver();
        System.out.println("Entregado?: " + c1.esEntregado() + "\n");

        Contenido c2 = new Videojuego("Uncharted", "Aventura", 15, est1);
        c2.entregar();
        c2.valorar();
        System.out.println("\nEntregado?: " + c2.esEntregado());
        c2.devolver();
        System.out.println("Entregado?: " + c2.esEntregado());
    }
}