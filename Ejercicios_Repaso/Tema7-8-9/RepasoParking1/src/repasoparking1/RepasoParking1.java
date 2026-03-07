/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repasoparking1;

import java.util.Scanner;

/**
 *
 * @author DAVID
 */
public class RepasoParking1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Parking parking = new Parking();
        
        int opcion;
        
        do {
            mostrarMenu();
            opcion = entrada.nextInt();
            switch(opcion) {
                case 1 -> aparcarCoches(parking);
                case 2 -> mostrarCochePorColor(parking);
                case 3 -> mostrarPrimerCoche(parking);
                case 4 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion no valida, intentalo de nuevo");
            }
        } while (opcion != 4);
    }
    
    public static void mostrarMenu() {
        System.out.println("\n--MENU--");
        System.out.println("1. Aparcar coche");
        System.out.println("2. Mostrar coches por color");
        System.out.println("3. Mostrar el primer coche aparcado");
        System.out.println("4. Salir del programa");
        System.out.print("Introduce una opcion: ");
    }
    
    public static void aparcarCoches(Parking parking) {
        System.out.println();
        parking.aparcarCoche();
    }
    
    public static void mostrarCochePorColor(Parking parking) {
        System.out.println();
        parking.mostrarCochesColor();
    }
    
    public static void mostrarPrimerCoche(Parking parking) {
        System.out.println();
        parking.mostrarPrimerCoche();
    }
}
