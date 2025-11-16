/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso07tema5;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author DAVID
 */
public class Repaso07Tema5 {

    /**
     */
    public static int numeroHamburguesa = 1;
    public static int numeroPizza = 1;
    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = pedirOpcion();
            switch(opcion){
                case 1:
                    generarNumeroHamburguesa();
                    break;
                case 2:
                    generarNumeroPizza();
                    break;
                case 3:
                    System.out.println("Gracias por tu pedido!");
                    break;
                default:
                    System.out.println("Opción inválida. Intentelo de nuevoo...");
                    System.out.println("");
            }
        } while(opcion != 3);
    }

    public static void mostrarMenu(){
        System.out.println("---FAST FOOD---");
        System.out.println("1. Hamburguesa");
        System.out.println("2. Pizza");
        System.out.println("3. Salir");
        System.out.print("Elige opcion: ");
    }

    public static int pedirOpcion(){
        Scanner entrada = new Scanner(System.in);
        int numero = -1;
        try {
            numero = entrada.nextInt();
        } catch(InputMismatchException e){
            System.out.println("Error: Debe ser un numero");
        }
        return numero;
    }

    public static void generarNumeroHamburguesa(){
        System.out.println("Tu numero de hamburguesa es: H-" + numeroHamburguesa);
        System.out.println("");
        numeroHamburguesa++;
    }

    public static void generarNumeroPizza(){
        System.out.println("Tu numero de pizza es: P-" + numeroPizza);
        System.out.println("");
        numeroPizza++;
    }
}