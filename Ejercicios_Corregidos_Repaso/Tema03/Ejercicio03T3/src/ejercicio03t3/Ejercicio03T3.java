/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio03t3;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejercicio03T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1, n2, n3, mayor;
        System.out.print("Por favor, introduzca el primer número: ");
        n1 = teclado.nextInt();
        System.out.print("Ahora, introduzca un segundo número: ");
        n2 = teclado.nextInt();
        System.out.print("Por último, introduzca un tercer número: ");
        n3 = teclado.nextInt();
        if  ((n1 > n2)&&(n1 > n3)){
            mayor = n1;
        }
        else{
            if  ((n2 > n1)&&(n2 > n3)){
                mayor = n2;
            }
            else{
                mayor = n3;
            }
        }
        System.out.print("El número mayor de los introducidos es: "+mayor);
    }
    
}
