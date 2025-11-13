/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01t3;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejercicio01T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;
        System.out.print("Por favor, introduzca un número: ");
        n = teclado.nextInt();
        if  (n > 0){
            System.out.print("El número introducido es positivo");          
        }
        else{
            System.out.print("El número introducido es negativo");
        }

            
    }
    
}
