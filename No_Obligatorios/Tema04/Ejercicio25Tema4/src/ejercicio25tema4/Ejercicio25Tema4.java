/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25tema4;
import java.util.Scanner;

/**
 *
 * @author DAVID
 */
public class Ejercicio25Tema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int base, exponente;//Variables
        
        System.out.print("Por favor, introduzca la base: ");//Pedir al usuario que introduzca la base
        base = entrada.nextInt();
        System.out.print("Por favor, introduzca el exponente: ");//Pedir al usuario que introduza el exponente
        exponente = entrada.nextInt();
        
        calcularPotencia(base, exponente);//Llamo al metodo calcularPotencia pasando la base y el exponente como parametro
    }
    public static void calcularPotencia(int base, int exponente) {//Metodo que calcula la potencia de un numero
        if (base == 0 && exponente < 0) {//Comprobar si la base es 0 y el exponente es negativo dar un error
            System.out.println("Error: No se puede elevar 0 a un numero negativo");
        } else {//Sino es base 0 y elevado a un numero negativo, se calcular con Math.pow y mostrar el mensaje
            int resultado = (int) Math.pow(base, exponente);
            System.out.println("El resultado de " + base + " elevado a " + exponente + " es: " + resultado);
        }
    }
}