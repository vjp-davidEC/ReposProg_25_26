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
        
        //Variables 
        double metros;
        int opcion;
        
        do {//Bucle que se repite hasta que el usuario elija salir 
            System.out.print("Introduce una distancia en metros: ");
            metros = entrada.nextDouble();
            mostrarMenu();//Mostrar el menú de opciones 
            opcion = pedirOpcion();//Pedir la opción al usuario 
            switch (opcion) {//Evaluar la opción 
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
        } while (opcion != 4);//Condición de salida 
    }
    
    public static void mostrarMenu(){//Método para mostrar el menú 
        System.out.println("\n--- Conversor de Medidas ---");
        System.out.println("1. Convertir a kilometros");
        System.out.println("2. Convertir a centimetros");
        System.out.println("3. Convertir a milimetros");
        System.out.println("4. Salir");
        System.out.print("Elige una opcion: ");
    }
    
    public static int pedirOpcion(){//Método para pedir la opción al usuario con control de errores 
        Scanner entrada = new Scanner(System.in);
        int numero = -1;
        try {
            numero = entrada.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error: Debe de ser un numero");
        }
        return numero;
    }
    
    //Métodos de conversión
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
/*
    Scanner entrada: se usa para leer la distancia en metros.
    do...while: mantiene el programa en ejecución hasta que el usuario elija la opción 4 (salir).
    mostrarMenu(): imprime el menú con las opciones disponibles.
    pedirOpcion(): lee la opción del usuario y controla errores si no introduce un número.
    switch (opcion): ejecuta la acción correspondiente:
        case 1: convierte metros a kilómetros.
        case 2: convierte metros a centímetros.
        case 3: convierte metros a milímetros.
        case 4: termina el programa.
        default: muestra un mensaje de error si la opción no es válida.
    Métodos de conversión: cada uno hace la operación matemática correspondiente.
*/