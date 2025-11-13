/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12t3;

/**
 *
 * @author admin
 */
public class Ejercicio12T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont = 11;
        do{
            if  ((cont%2) == 0){
                System.out.print("\nPar: "+cont);
            }
            cont++;
        }while(cont <= 133);
    }
    
}
