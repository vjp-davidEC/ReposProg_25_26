/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18tema5;
import java.util.Scanner;

/**
 *
 * @author DAVID
 */
public class Ejercicio18Tema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int opcion;//Variable
        
        //Pedir al usuario que introduzca dos nuemeros y se guarden en los objetos de la clase Numero
        System.out.print("Introduce el primer numero: ");
        Numero num1 = new Numero(entrada.nextInt());
        System.out.print("Introduzca el segundo numero: ");
        Numero num2 = new Numero(entrada.nextInt());
        System.out.println("");
        
        do {//Bucle que repite hasta que el usuario elige la opcion 5
            System.out.println("1.- Sumar los numeros");
            System.out.println("2.- Restar los numeros");
            System.out.println("3.- Multiplicar los numeros");
            System.out.println("4.- Dividir los numeros");
            System.out.println("5.- Salir del programa");
            System.out.print("Elige una opcion: ");
            opcion = entrada.nextInt();
            System.out.println("");
            
            switch (opcion) {
                case 1:
                    System.out.println("Resultado de la suma: " + (num1.getValor() + num2.getValor()));//Resultado suma
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Resultado de la resta: " + (num1.getValor() - num2.getValor()));//Resultado resta
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Resultado de la multiplicacion: " + (num1.getValor() * num2.getValor()));//Resultado multiplicacion
                    System.out.println("");
                    break;
                case 4:
                    try {
                        System.out.println("La division es: " + (num1.getValor() / num2.getValor()));//DIVISION
                    } catch (ArithmeticException e) {
                        System.out.println("No se puede dividir entre 0");//ERROR
                    }
                    System.out.println("");
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