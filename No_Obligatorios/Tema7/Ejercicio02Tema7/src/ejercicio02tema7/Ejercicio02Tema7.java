/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02tema7;

import java.util.Scanner;

/**
 *
 * @author DAVID
 */
public class Ejercicio02Tema7 {

    /**
     * @param args the command line arguments
     */
    
    //Método para introducir los datos en el array
    public static void pedirNumero(int[] numero) {
        Scanner entrada = new Scanner(System.in);
        
        int i;
        for(i = 0; i < numero.length; i++){
            System.out.print("Introduce 7 valores enteros: ");
            numero[i] = entrada.nextInt();
        }
    }
    
    //Método para mostrar los datos del array
    public static void mostrarNumeros(int[] numeros){
        System.out.println("\n--NUMEROS--");
        
        int i;
        for(i = 0; i < numeros.length; i++){
            System.out.print("La posicion de " + i + ": " + numeros[i] + "\n");
        }
    }
    
    //Método para intercambiar los valores en la 2ª y 4ª posición (índices 1 y 3)
    public static void intercambiar(int[] inter){
        int aux = inter[1];
        inter[1] = inter[3];
        inter[3] = aux;
    }
    
    public static void main(String[] args) {
        int[] vector = new int[7];//Array unidimensional de tamaño 7
        pedirNumero(vector);//Introducir los datos
        mostrarNumeros(vector);//Mostrar el array original
        
        intercambiar(vector);//Intercambiar posiciones 2ª y 4ª
        System.out.println("\nDespues del intercambio");
        mostrarNumeros(vector);//Mostrar el array modificado
    }
    
}
