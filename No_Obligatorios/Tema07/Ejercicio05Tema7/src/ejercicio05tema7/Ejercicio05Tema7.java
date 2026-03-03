/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05tema7;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio05Tema7 {

    /**
     * @param args the command line arguments
     */
    //Constantes que sirve para ponerlas en vez de poner "matriz.length"
    public final static int FIL = 4;
    public final static int COL = 2;
        
    public static void main(String[] args) {
        int[][] matriz = new int[FIL][COL];
        
        rellenarMatriz(matriz);
        mostrarMatrizAtractiva(matriz);
        mostrarNumeroMayor(matriz);
        mostrarNumeroMenor(matriz);
        mostrarSumaTodosElementos(matriz);
    }
    
    //Metodo que pide al usuario un valor
    public static void rellenarMatriz(int [][] matriz){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Vamos a rellenar un array de 4x2");
        for(int i = 0; i < FIL; i++){
            for(int j = 0; j < COL; j++){
                System.out.print("Por favor, introduce un valor para la posicion [" + i + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
    }
    
    //Metodo que muestra los valores con la matrices de forma atractiva
    public static void mostrarMatrizAtractiva(int [][] matriz){
        for(int i = 0; i < FIL; i++){
            for(int j = 0; j < COL; j++){
                System.out.print(" [" + i + j + "]-->" + matriz[i][j]);
            }
            System.out.print("\n");
        }
    }
    
    //Metodo que muestra el numero mayor de la matriz
    public static void mostrarNumeroMayor(int [][] matriz){
        int mayor = matriz[0][0];
        for(int i = 0; i < FIL; i++){
            for(int j = 0; j < COL; j++){
                if(matriz[i][j] > mayor){
                    mayor = matriz[i][j];
                }
            }
        }
        System.out.println("El numero mayor es: " + mayor);
    }
    
    //Metodo que muestra el numero menor de la matriz
    public static void mostrarNumeroMenor(int [][] matriz){
        int menor = matriz[0][0];
        for(int i = 0; i < FIL; i++){
            for(int j = 0; j < COL; j++){
                if(matriz[i][j] < menor){
                    menor = matriz[i][j];
                }
            }
        }
        System.out.println("El numero menor es: " + menor);
    }
    
    //Metodo que muestra la suma de todos los elementos de la matriz
    public static void mostrarSumaTodosElementos(int [][] matriz){
        int suma = 0;
        for(int i = 0; i < FIL; i++){
            for(int j = 0; j < COL; j++){
                suma += matriz[i][j];
            }
        }
        System.out.println("La suma de todos los elementos son: " + suma);
    }
}
