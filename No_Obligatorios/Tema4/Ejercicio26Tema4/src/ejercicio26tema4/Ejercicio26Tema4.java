/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26tema4;
import java.util.Scanner;

/**
 *
 * @author DAVID
 */
public class Ejercicio26Tema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;//Variable
        
        System.out.print("Por favor, introduce un numero entero: ");//Pedir al usuario que introduzca un numero
        numero = entrada.nextInt();
        
        if (esPrimo(numero)) {//Llamo al metodo esPrimo para comprobar si el numero es primo
            System.out.println("El numero " + numero + " es primo");//Mensaje de si es primo
        } else {
            System.out.println("El numero " + numero + " no es primo");//Mensaje de no es primo
        }
    }
    public static boolean esPrimo(int numero) {//Metodo que determina si en numero es primo
        if (numero <= 1) {//Si el numero es menor o igual a 1 no es primo
            return false;//Devolver flase al metodo
        }
        for (int i = 2; i < numero; i++) {//Comprobar si el numero tiene algun divisor entre 2 y el numero
            if (numero % i == 0) {
                return false;//Si tiene divisor, no es primo
            }
        }
        return true;//Si no tiene divisores, es primo
    }
}