/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio28t3;

/**
 *
 * @author admin
 */
public class Ejercicio28T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double aleatorio = Math.floor((Math.random()*100)+1);
        int aleatorioEntero = (int)aleatorio;
        if  ((aleatorioEntero % 2) == 0){
            System.out.print("El número "+aleatorioEntero+" es par");
        }
        else{
            System.out.print("El número "+aleatorioEntero+" es impar");
        }
        
    }
    
}
