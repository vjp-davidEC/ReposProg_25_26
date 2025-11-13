/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio05t3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio05T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.print("Introduzca un número: ");
        num = teclado.nextInt();
        if  ((num % 2) == 0){
            System.out.println("EL número "+num+" es par");
        }
        else{
            System.out.println("EL número "+num+" es impar");
        }
    }
    
}
