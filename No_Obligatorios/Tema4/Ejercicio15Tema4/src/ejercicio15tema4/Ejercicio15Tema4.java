/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15tema4;
import java.util.Scanner;

/**
 *
 * @author DAVID
 */
public class Ejercicio15Tema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numero1;
        int numero2;
        int opcion;
        
        System.out.print("Introduce el primer numero: ");//Lo que tiene que poner el usuario
        numero1 = entrada.nextInt();
        System.out.print("Introduce el primer numero: ");
        numero2 = entrada.nextInt();
        
        numero1 = pedirNumero(entrada);
        numero2 = pedirNumero(entrada);
        
        do {
            mostrarMenu();
            opcion = pedirOpcion(entrada);
            
            switch (opcion) {
                case 1:
                    System.out.println("Resultado de la suma: " + sumar(numero1, numero2));//SUMA
                    break;
                case 2:
                    System.out.println("La resta es: " + (numero1 - numero2));//RESTA
                    break;
                case 3:
                    System.out.println("La multiplicacion es: " + (numero1 * numero2));//MULTIPLICACION
                    break;
                case 4:
                    try {
                        System.out.println("La division es: " + (numero1 / numero2));//DIVISION
                    } catch (ArithmeticException e) {
                        System.out.println("No se puede dividir entre 0");//ERROR
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");//SALIR
                    break;
                default:
                    System.out.println("Opcion no valida, intentalo de nuevo...");//REPETIR
            }
        } while (opcion !=5);//Que solo es hasta el 5
    }
}