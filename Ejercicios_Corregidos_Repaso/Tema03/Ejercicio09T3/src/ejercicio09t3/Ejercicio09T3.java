/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio09t3;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejercicio09T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2, num3, num4, aux, i;
        System.out.println("Primer número: ");
        num1 = teclado.nextInt();
        System.out.println("Segundo número: ");
        num2 = teclado.nextInt();
        System.out.println("Tercer número: ");
        num3 = teclado.nextInt();
        System.out.println("Cuarto número: ");
        num4 = teclado.nextInt();
        
        for(i = 0;i < 3;i++){
            if (num1 > num2){
                aux = num1;
                num1 = num2;
                num2 = aux;
            }
            if (num2 > num3){
                aux = num2;
                num2 = num3;
                num3 = aux;
            }
            if (num3 > num4){
                aux = num3;
                num3 = num4;
                num4 = aux;
            }    
        }
        
        
        System.out.print("El orden de los números introducidos es: "+num1+" - "+num2+" - "+num3+" - "+num4);
    }
    
}
