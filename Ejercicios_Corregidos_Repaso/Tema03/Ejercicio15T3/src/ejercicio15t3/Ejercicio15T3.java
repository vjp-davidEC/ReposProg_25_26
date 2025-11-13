/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15t3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejercicio15T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, i, res;
        System.out.print("Introduzca numero: ");
        num  = teclado.nextInt();
        //Mostramos la tabla de multiplicar de num
        for(i=1;i<=10;i++){
            res = num*i;
            System.out.println(num+" * "+i+" = "+(res));
        }
    }
    
}
