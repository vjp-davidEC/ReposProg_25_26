/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso06tema5;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author DAVID
 */
public class Repaso06Tema5 {

    /**
     */
    public static int numeroGeneral = 1;
    public static int numeroPreferente = 1;
    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = pedirOpcion();
            switch(opcion){
                case 1:
                    generarNumeroGeneral();
                    break;
                case 2:
                    generarNumeroPreferente();
                    break;
                case 3:
                    System.out.println("Gracias por usar el sistema del banco");
                    break;
                default:
                    System.out.println("Opcion invalida, intentalo de nuevoo...");
                    System.out.println("");
            }
        } while(opcion != 3);
    }

    public static void mostrarMenu(){
        System.out.println("--- BANCO ---");
        System.out.println("1. Atencion general");
        System.out.println("2. Atencion preferente");
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

    public static void generarNumeroGeneral(){
        System.out.println("Tu numero general es: G-" + numeroGeneral);
        System.out.println("");
        numeroGeneral++;
    }

    public static void generarNumeroPreferente(){
        System.out.println("Tu numero preferente es: P-" + numeroPreferente);
        System.out.println("");
        numeroPreferente++;
    }
}