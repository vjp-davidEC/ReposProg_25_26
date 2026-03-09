/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testparking;

import java.util.Scanner;

/**
 *
 * @author DAVID
 */
public class TestParking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int longitud = 0;
        int opcion;
        
        do {
            System.out.print("Introduce el tamanio del parking: ");
            try {
                longitud = entrada.nextInt();
            } catch (Exception e) {
                System.out.println("Error: Debes introducir un numero entero");
            }
        } while (longitud <= 0);
        
        Parking park = new Parking(longitud);
        
        do {
            mostrarMenu();
            opcion = entrada.nextInt();
            switch(opcion) {
                case 1 -> aparcarCochePlaza(park);
                case 2 -> mostrarCoches(park);
                case 3 -> mostrarParking(park);
                case 4 -> retirarCochePlaza(park);
                case 5 -> buscarMatriculaCoche(park);
                case 6 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion no valida. Intentalo de nuevo");
            }
        } while (opcion != 6);
    }
    
    public static void mostrarMenu() {
        System.out.println("\n--MENU--");
        System.out.println("1. Aparcar coches en la plaza correspondiente");
        System.out.println("2. Mostrar los coches introducidos");
        System.out.println("3. Mostrar las plazas del parking");
        System.out.println("4. Retirar coches");
        System.out.println("5. Buscar coche por su matricula");
        System.out.println("6. Salir del programa");
        System.out.print("Introduce una opcion: ");
    }
    
    public static void aparcarCochePlaza(Parking p) {
        System.out.println();
        p.introducirCoches();
    }
    
    public static void mostrarCoches(Parking p) {
        System.out.println();
        p.mostrarCoches();
    }
    
    public static void mostrarParking(Parking p) {
        System.out.println();
        System.out.println("--ESTADO DEL PARKING--");
        
        Coche[] plazas = p.getPlazas();
        
        for(int i = 0; i < plazas.length; i++) {
            if(plazas[i] == null) {
                System.out.println("Plaza " + i + ": libre");
            } else {
                System.out.println("Plaza " + i + ": " + plazas[i]);
            }
        }
    }
    
    public static void retirarCochePlaza(Parking p) {
        Scanner entrada = new Scanner(System.in);
        System.out.println();
        
        System.out.print("Plaza a retirar: ");
        int plazaRetirar = entrada.nextInt();
        p.retirarCoches(plazaRetirar);
    }
    
    public static void buscarMatriculaCoche(Parking p) {
        System.out.println();
        p.buscarPorMatricula();
    }
}