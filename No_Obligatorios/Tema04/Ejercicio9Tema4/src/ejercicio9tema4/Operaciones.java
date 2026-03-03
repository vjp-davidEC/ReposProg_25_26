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
    public static int pedirNumeros (int numero1, int numero2, int numero3) {//Metodo que devuelve el menor de los tres
        int menor;
        
        menor = numero1;//Decir que "menor" es igual a "numero1"
        if (numero2 < menor) {//Comprobar si numero2 es menor que el actual
            menor = numero2;
        } if (numero3 < menor) {//Comprobar si numero3 es menor que el actual
            menor = numero3;
        }
        return menor;//Devolver el numero menor al metodo que esta en el main
    }
}