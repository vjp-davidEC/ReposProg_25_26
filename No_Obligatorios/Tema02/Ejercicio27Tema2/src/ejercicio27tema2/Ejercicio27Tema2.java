/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio27tema2;
import java.util.Scanner;
/**
 *
 * @author DAVID
 */
public class Ejercicio27Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int cuadrado;
        int cubo;
                
        System.out.println("Por favor, introduzca un numero: ");
        numero = entrada.nextInt();
        
        cuadrado = numero * numero;
        cubo = numero * numero * numero;
                      
        System.out.println("El cuadrado de " + numero + " es: " + cuadrado);
        System.out.println("El cubo de " + numero + " es: " + cubo);
        
        
    }
    
}
