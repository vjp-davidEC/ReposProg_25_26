/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio16t3;

/**
 *
 * @author admin
 */
public class Ejercicio16T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont = 0;
        int i;
        System.out.println("Los impares existentes son: ");
        for(i=20;i<=160;i++){
            if  ((i%2) == 1){
                System.out.print(i+" - ");
                cont++;
            }
        }
        System.out.println("\nLa cantidad de numeros impares impresos han sido: "+cont);
    }
    
}
