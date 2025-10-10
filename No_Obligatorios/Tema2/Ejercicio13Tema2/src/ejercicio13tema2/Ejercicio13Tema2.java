/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13tema2;

/**
 *
 * @author alumno
 */
public class Ejercicio13Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;
        int cambio;
        
        System.out.println("La variable numero1 contiene el valor " + numero1 + " y la variable numero2 contiene el valor " + numero2);
        
        cambio = numero1;
        numero1 = numero2;
        numero2 = cambio;
        
        System.out.println("Ahora, la variable numero1 contiene el valor " + numero1 + " y la variable numero2 contiene el valor " + numero2);
    }
    
}
