/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio23t3;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejercicio23T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, i;
        //Pedimos un número mayor que 1
        do{
            System.out.print("Introduce numero mayor que 1: ");
            num = teclado.nextInt();
            if  (num < 1){
                System.out.print("Error. El número debe ser ayor que 1. ");
            }
        }while(num <= 1);
        //Mostramos todos los números comprendidos entre 1 y num
        for(i=1;i<=num;i++){
            System.out.println(i);
        }
    }
    
}
