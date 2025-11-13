/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13t2;

/**
 *
 * @author admin
 */
public class Ejercicio13T2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración de variables
        int n1, n2, aux;  
        
        //Asignamos unos valores
        n1 = 1927;
        n2 = 2200;
        
        System.out.println("La variable n1 contiene el valor "+n1+" y la variable n2 contiene el valor "+n2);
        
        //Intercambio de valores entre variables
        aux = n1;
        n1 = n2;
        n2 = aux;
        
        System.out.println("Ahora, la variable n1 contiene el valor "+n1+" y la variable n2 contiene el valor "+n2);
    }
    
}
