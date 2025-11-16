/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso05tema5;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author DAVID
 */
public class Repaso05Tema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double metros;
        int opcion;
        
        do {
            System.out.print("Introduce una distancia en metros: ");
            metros = entrada.nextDouble();
            mostrarMenu();
            opcion = pedirOpcion();
            switch (opcion) {
                case 1:
                    System.out.println("En kilometros: " + aKilometros(metros));
                    break;
                case 2:
                    System.out.println("En centimetros: " + aCentimetros(metros));
                    break;
                case 3:
                    System.out.println("En milimetros: " + aMilimetros(metros));
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion invalida. Intentalo de nuevoo...");
            }
            System.out.println(); // salto de línea
        } while (opcion != 4);
    }
    
    public static void mostrarMenu(){
        System.out.println("\n--- Conversor de Medidas ---");
        System.out.println("1. Convertir a kilometros");
        System.out.println("2. Convertir a centimetros");
        System.out.println("3. Convertir a milimetros");
        System.out.println("4. Salir");
        System.out.print("Elige una opcion: ");
    }
    
    public static int pedirOpcion(){//Metodo para pedir el numero al usuario y si se equivoca dar un error y devolverselo
        Scanner entrada = new Scanner(System.in);
        int numero = -1;
        try {
            numero = entrada.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error: Debe de ser un numero");
        }
        return numero;
    }
    
    public static double aKilometros(double metros) {
        return metros / 1000;
    }
    
    public static double aCentimetros(double metros) {
        return metros * 100;
    }
    
    public static double aMilimetros(double metros) {
        return metros * 1000;
    }
}