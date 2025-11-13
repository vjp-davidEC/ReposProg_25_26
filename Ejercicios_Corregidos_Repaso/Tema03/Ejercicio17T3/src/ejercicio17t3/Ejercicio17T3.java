/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio17t3;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejercicio17T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        do{
            System.out.print("Número: ");
            num = teclado.nextInt();
            if (num < 0){
                System.out.print("Error. El número debe ser positivo. ");
            }
        }while(num < 0);
        System.out.print("Raiz cuadrada de "+num+": "+Math.sqrt(num));
    }
    
}
