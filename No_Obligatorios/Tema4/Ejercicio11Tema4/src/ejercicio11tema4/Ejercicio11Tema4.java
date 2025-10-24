/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11tema4;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio11Tema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = pedirNumero();
        double raiz = calcularRaiz(numero);
        mostrarResultado(numero, raiz);
    }
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Por favor, introduce un numero para calcular la raiz cuadrada: ");
            numero = entrada.nextInt();
            
            if (numero < 0) {
                System.out.println("Error: No se puede calcular la raiz cuadrada de un numero negativo");
            } 
        } while (numero < 0);
        return numero;
        }
    public static double calcularRaiz (double numero) {
        return Math.sqrt(numero);
    }
    public static void mostrarResultado (int numero, double raiz) {
        System.out.println("La raiz cuadrada de " + numero + " es: " + raiz);
    }
}
