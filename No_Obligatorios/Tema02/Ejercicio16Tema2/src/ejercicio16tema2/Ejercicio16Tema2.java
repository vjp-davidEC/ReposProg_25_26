/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16tema2;

/**
 *
 * @author DAVID
 */
public class Ejercicio16Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int total = 130;
        int billeteCicuenta = 50;
        int billeteDiez = 10;
        int numeroCincuenta;
        int loQueMeQueda;
        int numeroDiez;
        
        numeroCincuenta = total / billeteCicuenta;
        loQueMeQueda = total % billeteCicuenta;//Resto de la division
        numeroDiez = loQueMeQueda / billeteDiez;
        
        System.out.println(total + " euros hacen un total de: " + numeroCincuenta + " billetes de " + billeteCicuenta + " euros y " + numeroDiez + " billetes de " + billeteDiez + " euros");
    }
    
}
