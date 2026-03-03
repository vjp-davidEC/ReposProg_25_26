/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4tema4;

/**
 *
 * @author DAVID
 */
public class Operaciones {
    public static void imprimirMenor(int numero1, int numero2, int numero3) {//Metodo de tres numero e imprimir el menor
        int menor;
        
        menor = numero1;
        if (numero2 < menor) {
            menor = numero2;
        } if (numero3 < menor) {
            menor = numero3;
        }
        System.out.println("El numero menor de los introducidos es el " + menor);
    }
}