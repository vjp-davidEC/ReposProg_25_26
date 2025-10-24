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
        int numero = pedirNumero();
        mostrarNumeros(numero);
    }
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Introduce un numero: ");
            numero = entrada.nextInt();
            if(!esValido(numero)) {
                System.out.println("Error: El numero debe ser mayor que 1");
            }
        } while (!esValido(numero));
        return numero;
    }
    public static boolean esValido(int numero) {
        return numero > 1;   
    }
    public static void mostrarNumeros(int numero) {
        System.out.println("Numeros entre 1 y " + numero + ":");
        for (int i = 1; i <= numero; i++) {
            System.out.println(i);
        }
    }
}