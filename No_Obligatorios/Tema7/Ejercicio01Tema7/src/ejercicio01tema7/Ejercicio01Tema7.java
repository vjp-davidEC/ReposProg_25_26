/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01tema7;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio01Tema7 {

    /**
     * @param args the command line arguments
     */
    
    //Método para rellenar el array con 10 números enteros introducidos por el usuario
    public static void pedirNumero(int[] numero) {
        Scanner entrada = new Scanner(System.in);
        
        int i;
        for(i = 0; i < numero.length; i++){
            System.out.print("Introduce 10 valores enteros: ");
            numero[i] = entrada.nextInt();
        }
    }
    
    //Método para mostrar solo los números pares del array
    public static void mostrarNumerosPares(int[] pares){
        System.out.println("\n--NUMEROS PARES--");
        
        int i;
        for(i = 0; i < pares.length; i++){
            if(pares[i] % 2 == 0){
                System.out.print(pares[i] + "\n");
            }
        }
    }
    
    public static void main(String[] args) {
        int[] vector = new int[10];//Array unidimensional de tamaño 10
        pedirNumero(vector);//Pedimos los 10 números al usuario
        mostrarNumerosPares(vector);//Mostramos solo los números pares
    }
}