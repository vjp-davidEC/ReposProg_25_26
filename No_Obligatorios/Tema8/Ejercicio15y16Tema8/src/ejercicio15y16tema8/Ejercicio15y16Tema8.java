/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15y16tema8;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio15y16Tema8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        
        do {            
            mostrarMenu();
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1 -> rellenarPeliculas();
                case 2 -> mostrarPeliculasYSocios();
                case 3 -> mostrarPeliculaMasRentable();
                case 4 -> mostrarPeliculaMenosRentable();
                case 5 -> pedirNombrePelicula();
                case 6 -> contarNumeroSocios();
                case 7 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion no valida, intentalo de nuevo");
            }
        } while (opcion != 7);
    }
    
    //
    public static void mostrarMenu(){
        System.out.println("--MENU--");
        System.out.println("1. Rellenar las peliculas junto con los socios que han acudido a verla");
        System.out.println("2. Mostrar las peliculas y los socios que la han visto");
        System.out.println("3. Mostrar la pelicula mas rentable");
        System.out.println("4. Mostrar la pelicula menos rentable");
        System.out.println("5. Introducir el nombre de una pelicula, mostrar el beneficio neto y toda la informacion de los socios que han acudido a verla");
        System.out.println("6. Contar el numero de socios que han abonado la cantidad mayor");
        System.out.println("7. Salir del programa");
        System.out.print("Introduce una opcion: ");
    }
    
    //
    public static void rellenarPeliculas(){
        
    }
    
    //
    public static void mostrarPeliculasYSocios(){
        
    }
    
    //
    public static void mostrarPeliculaMasRentable(){
        
    }
    
    //
    public static void mostrarPeliculaMenosRentable(){
        
    }
    
    //
    public static void pedirNombrePelicula(){
        
    }
    
    //
    public static void contarNumeroSocios(){
        
    }
}