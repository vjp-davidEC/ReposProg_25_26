/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02t3;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejercicio02T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1, n2, res;
        System.out.print("Por favor, introduzca un número: ");
        n1 = teclado.nextInt();
        System.out.print("Ahora, introduzca un segundo número: ");
        n2 = teclado.nextInt();
        //Si el primer número es mayor que 10 se multiplican
        if  (n1 > 10){
            res = n1 * n2;
            System.out.print("La operación que se realizó es el producto y el resultado es "+res);
        }
        else{
            res = n1 + n2;
            System.out.print("La operación que se realizó es la suma y el resultado es "+res);
        }
    }
    
}
