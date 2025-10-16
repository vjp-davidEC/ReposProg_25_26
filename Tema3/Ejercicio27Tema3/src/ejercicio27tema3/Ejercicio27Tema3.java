/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio27tema3;
import java.util.Scanner;

/**
 *
 * @author DAVID
 */
public class Ejercicio27Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double numero1;
        double numero2;
        int opcion;
        
        System.out.print("Introduce el primer numero: ");//Lo que tiene que poner el usuario
        numero1 = entrada.nextDouble();
        System.out.print("Introduce el primer numero: ");
        numero2 = entrada.nextDouble();
        
        do {
            System.out.println("\n1. Sumar los numeros");//El menu de lo que quiere hacer
            System.out.println("2. Restar los numeros");
            System.out.println("3. Multiplicar los numeros");
            System.out.println("4. Dividir los numeros");
            System.out.println("5. Salir del programa");
            System.out.print("\nElige una opcion: ");
            
            opcion = entrada.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("La suma es: " + (numero1 + numero2));//SUMA
                    break;
                case 2:
                    System.out.println("La resta es: " + (numero1 - numero2));//RESTA
                    break;
                case 3:
                    System.out.println("La multiplicacion es: " + (numero1 * numero2));//MULTIPLICACION
                    break;
                case 4:
                    try {
                        if (numero2 == 0) {
                            System.out.println("No se puede dividir entre 0");
                        }
                        System.out.println("La division es: " + (numero1 / numero2));//DIVISION
                    } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage());//ERROR
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");//SALIR
                    break;
                default:
                    System.out.println("Opcion no valida. Intenta de nuevo");//REPETIR
            }
        } while (opcion !=5);//Que solo es hasta el 5
    }
}
