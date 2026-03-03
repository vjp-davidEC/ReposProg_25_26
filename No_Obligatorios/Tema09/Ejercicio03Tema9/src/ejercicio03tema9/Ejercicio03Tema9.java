/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03tema9;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio03Tema9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Pido al usuario que introduzca una cadena de texto
        System.out.print("Introduce una cadena: ");
        String texto = entrada.nextLine();
        
        //Se convierte la cadena en un array de caracteres
        char[] letras = texto.toCharArray();
        
        //Se muestra cada caracter en la posicion i
        System.out.println("Caracteres uno por uno:");
        for(int i = 0; i < letras.length; i++){
            System.out.println("Posicion " + i + ": " + letras[i]);
        }
    }
}