/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01tema7;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio01Tema7 {

    /**
     * @param args the command line arguments
     */
    public static int pedirNumero(int[] numeros) {
        Scanner entrada = new Scanner(System.in);
        
        numeros = new int[10];
        System.out.print("Introduce 10 numeros enteros: ");
        
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Los numeros son: " + i + ": ");
            numeros[i] = entrada.nextInt();
        }
        
        return;
    }
    
    public static void mostrarNumerosPares(int[] pares){
        System.out.println("\nLos numeros pares: ");
        
        for(int i = 0; i < pares.length; i++){
            if(i % 2 == 0);
            System.out.println(pares[i]);
        }
    }
    public static void main(String[] args) {
        int[] numeros = pedirNumero();
        mostrarNumerosPares(numeros);
    }
}