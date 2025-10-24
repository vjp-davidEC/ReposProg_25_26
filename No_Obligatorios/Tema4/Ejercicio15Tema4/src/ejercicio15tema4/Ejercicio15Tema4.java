/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15tema4;
import java.util.InputMismatchException;
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
        
        do {
            mostrarMenu();
            opcion = pedirOpcion(entrada);
            
            switch (opcion) {
                case 1:
                    System.out.println("Resultado de la suma: " + sumar(numero1, numero2));//SUMA
                    break;
                case 2:
                    System.out.println("Resultado de la resta: " + restar(numero1, numero2));//RESTA
                    break;
                case 3:
                    System.out.println("Resultado de la multiplicacion: " + multiplicar(numero1, numero2));//MULTIPLICACION
                    break;
                case 4:
                    dividir(numero1, numero2);//DIVISION
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");//SALIR
                    break;
                default:
                    System.out.println("Opcion no valida, intentalo de nuevo...");//REPETIR
            }
        } while (opcion !=5);//Que solo es hasta el 5
    }
    public static int pedirNumero(Scanner entrada, int numero) {
        System.out.println(numero);
        return entrada.nextInt();
    }
    public static void mostrarMenu() {
        System.out.println("1.- Sumar los numeros");
        System.out.println("2.- Restar los numeros");
        System.out.println("3.- Multiplicar los numeros");
        System.out.println("4.- Dividir los numeros");
        System.out.println("5.- Salir del programa");
        System.out.print("Elige una opcion: ");
    }
    public static int pedirOpcion(Scanner entrada) {
        try {
            return entrada.nextInt();
        } catch (InputMismatchException e) {
            entrada.next();
            return -1;
        }
    }
    public static int sumar(int numero1, int numero2) {
        return numero1 + numero2;
    }
    public static int restar(int numero1, int numero2) {
        return numero1 - numero2;
    }
    public static int multiplicar(int numero1, int numero2) {
        return numero1 * numero2;
    }
    public static int dividir(int numero1, int numero2) {
        try {
            int resultado = numero1 / numero2;
            System.out.println("La division es: " + resultado);//DIVISION
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir entre 0");//ERROR
        }
        return 0;
    }
}