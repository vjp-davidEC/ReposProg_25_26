/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07tema9;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio07Tema9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Pide al usuario que introduzca una frase
        System.out.print("Introduce una frase: ");
        String frase = entrada.nextLine();
        
        //Se llama al metodo que mostrará la frase invertida
        mostrarFraseInvertida(frase);
    }
    public static void mostrarFraseInvertida(String frase){
        //Se divide la frase en palabras usando split con un espacio como separador
        String[] palabras = frase.split(" ");
        //Nueva cadena donde se construye la frase invertida
        String fraseInvertida = "";

        //Se recoore el array de izquierda a derecha, pero se va añadiendo cada palabra al principio de la nueva frase
        for(int i = 0; i < palabras.length; i++){
            fraseInvertida = palabras[i] + " " + fraseInvertida;
        }
        //Se muestra el resultado final
        System.out.println("Frase invertida palabra a palabra:");
        System.out.println("- " + fraseInvertida);
    }
}