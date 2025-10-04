/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18tema2;

/**
 *
 * @author DAVID
 */
public class Ejercicio18Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        int resultadoA = -a + 5 % b -a * a;
        int resultadoB = 5 + 3 % 7 * b * a -b % a;
        int resultadoC = (a + 1) * (b + 1) -b / a;
        
        System.out.println("El resultado de a) es: " + resultadoA);
        System.out.println("El resultado de b) es: " + resultadoB);
        System.out.println("El resultado de c) es: " + resultadoC);
    }
    
}
