/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13tema4;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio13Tema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = pedirNumero();//Metodo al que hemos llamado para obtener un numero valido del usuario
        mostrarNumeros(numero);//Metodo al que hemos llamado para imprimir los numeros del 1 hasta el numero introducido
    }
    public static int pedirNumero() {//Metodo que pide el usuario un numero
        Scanner entrada = new Scanner(System.in);
        int numero;
        do {//Bucle que se repite mientras el numero no sea mayor que 1
            System.out.print("Introduce un numero: ");//Lo que pedimos al usuario
            numero = entrada.nextInt();
            if(!esValido(numero)) {//Si el numero no es valido, mostrar el mensaje
                System.out.println("Error: El numero debe ser mayor que 1");
            }
        } while (!esValido(numero));//Repetir si el numero no es valido
        return numero;//Devolver el numero valido al metodo
    }
    public static boolean esValido(int numero) {//Metodo que comprueba si el numero es mayor que 1
        return numero > 1;//Devuelve true al metodo si es mayor que 1   
    }
    public static void mostrarNumeros(int numero) {//Metodo que imprime todos los numeros del 1 hasta el introducido
        System.out.println("Numeros entre 1 y " + numero + ":");//Mensaje
        for (int i = 1; i <= numero; i++) {//Bucle que imprime los numeros desde 1 hasta el introducido
            System.out.println(i);//Imprime cada numero
        }
    }
}