/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02tema9;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio02Tema9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Pido al usuario que introduzca una cadena de texto
        System.out.print("Introduzca una cadena: ");
        String texto = entrada.nextLine();
        
        //Se muestra el mensaje y con el for recorre toda la cadena y muestra el mensaje final
        System.out.println("Caracteres uno por uno");
        for(int i = 0; i < texto.length(); i++){
            System.out.println("Posicion " + i + ": " + texto.charAt(i));
        }
    }
}