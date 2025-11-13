/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio25t2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio25T2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1, n2, n3, producto, suma;
        
        System.out.print("Por favor, introduzca el primer número: ");
        n1 = teclado.nextInt();
        System.out.print("Por favor, introduzca el segundo número: ");
        n2 = teclado.nextInt();
        System.out.print("Por favor, introduzca el tercer número: ");
        n3 = teclado.nextInt();
        
        suma = n1 + n2 + n3;
        producto = n1 * n2 * n3;
        
        System.out.println("La suma de los números introducidos es: "+suma);
        System.out.println("El producto de los números introducidos es: "+producto);
    }
    
}
