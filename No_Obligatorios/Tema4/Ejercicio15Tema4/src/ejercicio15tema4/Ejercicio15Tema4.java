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
        
        do {//Bucle que repite hasta que el usuario elige la opcion 5
            mostrarMenu();//Mostrar el menu de opciones
            opcion = pedirOpcion(entrada);//Pedir la opcion seleccionada por el usuario
            
            switch (opcion) {
                case 1:
                    System.out.println("Resultado de la suma: " + sumar(numero1, numero2));//Resultado suma
                    break;
                case 2:
                    System.out.println("Resultado de la resta: " + restar(numero1, numero2));//Resultado resta
                    break;
                case 3:
                    System.out.println("Resultado de la multiplicacion: " + multiplicar(numero1, numero2));//Resultado multiplicacion
                    break;
                case 4:
                    dividir(numero1, numero2);//Metodo al que hemos llamado para que diga si hay un error
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");//SALIR
                    break;
                default:
                    System.out.println("Opcion no valida, intentalo de nuevo...");//REPETIR
            }
        } while (opcion !=5);//Que solo es hasta el 5
    }
    public static int pedirNumero(Scanner entrada, int numero) {//Metodo que muestra el mensaje y pide un numero
        System.out.println(numero);
        return entrada.nextInt();//Devolver el numero introducido al metodo
    }
    public static void mostrarMenu() {//Metodo que muestra el menu de opciones
        System.out.println("1.- Sumar los numeros");
        System.out.println("2.- Restar los numeros");
        System.out.println("3.- Multiplicar los numeros");
        System.out.println("4.- Dividir los numeros");
        System.out.println("5.- Salir del programa");
        System.out.print("Elige una opcion: ");
    }
    public static int pedirOpcion(Scanner entrada) {//Metodo que pide la opcion del menu y controla errores de entrada
        try {
            return entrada.nextInt();//Intenta leer la opcion como numero
        } catch (InputMismatchException e) {
            entrada.next();//Limpia la entrada incorrecta
            return -1;//Devuelve una opcion no valida
        }
    }
    public static int sumar(int numero1, int numero2) {//Metodo que suma dos numeros
        return numero1 + numero2;
    }
    public static int restar(int numero1, int numero2) {//Metodo que resta dos numeros
        return numero1 - numero2;
    }
    public static int multiplicar(int numero1, int numero2) {//Metodo que multiplica dos numeros
        return numero1 * numero2;
    }
    public static int dividir(int numero1, int numero2) {//Metodo que divide dos numeros con control de division
        try {
            int resultado = numero1 / numero2;
            System.out.println("La division es: " + resultado);//DIVISION
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir entre 0");//ERROR
        }
        return 0;//Devolver 0 como valor predeterminado
    }
}