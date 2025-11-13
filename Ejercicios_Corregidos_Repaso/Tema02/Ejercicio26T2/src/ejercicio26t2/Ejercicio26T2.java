/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio26t2;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejercicio26T2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.print("Por favor, introduzca un número de 4 cifras: ");
        numero = teclado.nextInt();
        System.out.println("La primera cifra es: "+(numero / 1000));
        numero = numero % 1000;
        
        System.out.println("La segunda cifra es: "+(numero / 100));
        numero = numero % 100;
        
        System.out.println("La tercera cifra es: "+(numero / 10));
        numero = numero % 10;
        
        System.out.println("La cuarta cifra es: "+numero);
    }
    
}
