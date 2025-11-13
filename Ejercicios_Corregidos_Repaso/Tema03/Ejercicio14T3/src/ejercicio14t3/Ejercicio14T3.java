/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14t3;

/**
 *
 * @author Usuario
 */
public class Ejercicio14T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 1, cont = 0;
        while(cont < 100){
            if  (i % 2 == 0){  //Si es par
                System.out.println("Par: "+i);
                cont++;
            }
            i++;
        }
    }
    
}
