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
    public static void comprobarParImpar(int numero) {//Metodo que recibe un numero y muestra si es par o impar
        if (numero % 2 == 0) {//Division de resto es par
            System.out.println("El numero introducido es par");
        } else {//Division de resto es impar
            System.out.println("El numero introducido es impar");
        }
    }
}
