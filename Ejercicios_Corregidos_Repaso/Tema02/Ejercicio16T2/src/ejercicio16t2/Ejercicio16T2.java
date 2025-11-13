/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio16t2;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejercicio16T2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int cartera = 130, carteraAux, billetes50, billetes10;
        
        carteraAux = cartera;
        
        //Calculamos los billetes de 50
        billetes50 = cartera / 50;
        
        //Obtenemos el dinero sobrante
        cartera = cartera % 50;
        
        //Calculamos los billetes de 10
        billetes10 = cartera / 10;
        
        System.out.print(carteraAux+" euros hacen un total de: "+billetes50+
                         " billetes de 50 euros y "+billetes10+" billetes de 10 euros");
    }
    
}
