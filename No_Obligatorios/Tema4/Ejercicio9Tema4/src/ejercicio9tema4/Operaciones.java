/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9tema4;

/**
 *
 * @author alumno
 */
public class Operaciones {
    public static int pedirNumeros (int numero1, int numero2, int numero3) {//Metodo de tres numero e imprimir el menor
        int menor;
        
        menor = numero1;
        if (numero2 < menor) {
            menor = numero2;
        } if (numero3 < menor) {
            menor = numero3;
        }
        return menor;//Que lo muestra en el main
    }
}
