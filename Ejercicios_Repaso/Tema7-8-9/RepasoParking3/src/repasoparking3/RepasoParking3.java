/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repasoparking3;

import java.util.Scanner;

/**
 *
 * @author DAVID
 */
public class RepasoParking3 {

    /**
     * @param args the command line arguments
     */
    public static final int FIL = 3;
    public static final int COL = 3;
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Coche[][] parking = new Coche[FIL][COL];
        
        int opcion;
        
        do {
            mostrarMenu();
            opcion = entrada.nextInt();
            switch(opcion) {
                case 1 -> aparcarCoches(parking);
                case 2 -> mostrarCochesRojos(parking);
                case 3 -> mostrarUltimoCoche(parking);
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
    
    public static void aparcarCoches(Coche[][] parking) {
        System.out.println();
        Scanner entrada = new Scanner(System.in);

        for(int i = 0; i < FIL; i++) {
            for(int j = 0; j < COL; j++) {
                if (parking[i][j] == null) {
                    System.out.println("Aparcando en la plaza " + i + j);

                    System.out.print("Matricula: ");
                    String matri = entrada.nextLine();
                    System.out.print("Marca: ");
                    String marca = entrada.nextLine();
                    System.out.print("Color: ");
                    String color = entrada.nextLine();

                    parking[i][j] = new Coche(matri, marca, color);
                }
            }
            
        }
        System.out.println("El parking esta lleno");
    }
    
    public static void mostrarCochesRojos(Coche[][] parking) {
        System.out.println();
        boolean encontrado = false;

        System.out.println("Coches rojos:");

        for(int i = 0; i < FIL; i++) {
            for(int j = 0; j < COL; j++) {
                if (parking[i][j] != null && parking[i][j].getColor().equalsIgnoreCase("rojo")) {
                    System.out.println(parking[i][j].toString() + " (Plaza " + i + j + ")");
                    encontrado = true;
                }
            } 
        }
        if(!encontrado) {
            System.out.println("No hay coches rojos");
        }
    }
    
    public static void mostrarUltimoCoche(Coche[][] parking) {
        System.out.println();
        boolean encontrado = false;

        for(int i = FIL - 1; i >= 0 && !encontrado; i--) {
            for(int j = COL - 1; j >= 0 && !encontrado; j--) {
                if (parking[i][j] != null) {
                    System.out.println("Ultimo coche aparcado:");
                    System.out.println(parking[i][j].toString() + " (Plaza " + i + j + ")");
                    encontrado = true;
                }
            }
        }
        if(!encontrado) {
            System.out.println("No hay coches aparcados");
        }
    }
}