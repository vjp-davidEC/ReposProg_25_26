/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilidades;

/**
 *
 * @author DAVID
 */
public class Operaciones {
    public static void imprimirMayor(int numero1, int numero2, int numero3) {//Metodo de tres numero e imprimir el mayor
        int mayor;
        
        mayor = numero1;
        if (numero2 > mayor) {
            mayor = numero2;
        } if (numero3 > mayor) {
            mayor = numero3;
        }
        System.out.println("El numero mayor de los introducidos es el " + mayor);
    }
}