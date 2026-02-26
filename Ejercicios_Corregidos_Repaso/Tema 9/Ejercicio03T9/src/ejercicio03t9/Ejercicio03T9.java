/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio03t9;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejercicio03T9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadena1;
        char[] cadena2;
        int i;
        System.out.print("Introduzca cadena: ");
        cadena1 = teclado.nextLine();
        cadena2 = cadena1.toCharArray();
        for(i = 0;i < cadena2.length;i++){
            System.out.println("Caracter: "+cadena2[i]);
        }
    }
    
}
