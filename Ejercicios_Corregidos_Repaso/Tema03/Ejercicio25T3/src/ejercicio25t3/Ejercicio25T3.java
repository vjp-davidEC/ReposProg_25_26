/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio25t3;

/**
 *
 * @author Usuario
 */
public class Ejercicio25T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, suma = 0;
        for (i = 17; i < 139; i++) {
            if  (i % 2 == 0){  //Si es par
                suma = suma + i;
            }
        }
        System.out.println("Suma de pares entre 17 y 139: "+suma);
    }
    
}
