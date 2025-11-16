/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso08tema5;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author DAVID
 */
public class Repaso08Tema5 {

    /**
     */
    public static int numeroMedicamento = 1;
    public static int numeroReceta = 1;
    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = pedirOpcion();
            switch(opcion){
                case 1:
                    generarNumeroMedicamento();
                    break;
                case 2:
                    generarNumeroReceta();
                    break;
                case 3:
                    System.out.println("Gracias por visitar la farmacia!");
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        } while(opcion != 3);
    }

    public static void mostrarMenu(){
        System.out.println("---FARMACIA---");
        System.out.println("1. Comprar medicamento");
        System.out.println("2. Recoger receta");
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

    public static void generarNumeroMedicamento(){
        System.out.println("Tu numero de medicamento es: M-" + numeroMedicamento);
        System.out.println("");
        numeroMedicamento++;
    }

    public static void generarNumeroReceta(){
        System.out.println("Tu numero de receta es: R-" + numeroReceta);
        System.out.println("");
        numeroReceta++;
    }
}