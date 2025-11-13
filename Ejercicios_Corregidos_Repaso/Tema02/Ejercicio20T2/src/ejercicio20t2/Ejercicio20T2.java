/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio20t2;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio20T2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double numero1;
        double numero2;
        int suma;
        
        System.out.println("nmero1: ");
        numero1 = teclado.nextInt();
        
        System.out.println("nmero2: ");
        numero2 = teclado.nextInt();

        suma = (int) (numero1 + numero2);
        System.out.println("Suma: "+suma);
    }
    
}
