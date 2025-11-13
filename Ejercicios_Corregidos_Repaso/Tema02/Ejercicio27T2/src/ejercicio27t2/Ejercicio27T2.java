/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio27t2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio27T2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, cuadrado, cubo;
        System.out.print("Por favor, introduzca un número: ");
        num = teclado.nextInt();
        
        cuadrado = num * num;
        cubo = num * num * num;
        
        System.out.println("El doble de "+num+" es: "+cuadrado);
        System.out.println("El triple de "+num+" es: "+cubo);
    }
    
}
