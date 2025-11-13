/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio31t3;

/**
 *
 * @author admin
 */
public class Ejercicio31T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, contImp = 0, contTotal = 0;
        double aleatorio;
        while(contImp < 3){
            aleatorio = Math.floor((Math.random()*100) + 1);
            n = (int)aleatorio;
            if ((n % 2) != 0){  //Si es impar
                System.out.println("Impar: "+n);
                contImp++;
            }
            contTotal++;
        }
        System.out.println("Total intentos: "+contTotal);
    }
    
}
