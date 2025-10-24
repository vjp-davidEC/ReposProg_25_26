/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14tema4;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio14Tema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = pedirNumero();
        mostrarMultiplosDeTres(numero);
    }
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        int numero;
        
        do {
            System.out.print("Introduce un numero: ");
            numero = entrada.nextInt();
            if(!esValido(numero)) {
                System.out.println("Error: El numero debe de ser mayor que 0");
            }
        } while (!esValido(numero));
        return numero;
    }
    public static boolean esValido(int numero) {
        return numero > 0;   
    }
    public static void mostrarMultiplosDeTres(int numero) {
        int contador = 0;
        System.out.println("Multiplos de 3 entre 1 y " + numero + ":");
        for (int i = 1; i <= numero; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
                contador++;
            }
        }
        System.out.println("Total de multiplos de 3 mostrados: " + contador);
    }
}