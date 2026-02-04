/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio05t7;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejercicio05T7 {

    //Declaración de constantes
    final static int FIL = 4;
    final static int COL = 2;
    
    //Genera un número aleatorio entre 0 y 99
    public static int pedirNumero(){
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.println("Introduca número: ");
        num = teclado.nextInt();
        return num;
    }
    
    //Rellena la Matriz M con valores aleatorios
    public static void rellenarMatriz(int M[][]){
        for(int i = 0;i < M.length;i++){
            for(int j = 0; j < M[0].length;j++){
                M[i][j] = pedirNumero();
            }
        }
    }
    
    //Muestra todos los elementos de la Matriz
    public static void mostrarMatriz(int M[][]){
        for(int i = 0;i < M.length;i++){
            for(int j = 0; j < M[0].length;j++){
                System.out.print("["+M[i][j]+"]");
            }
            System.out.print("\n");
        }
    }
    
    //Retorna el número mayor de la Matriz M
    public static int calcularMayor(int M[][]){
        int mayor = M[0][0];
        for(int i = 0;i < M.length;i++){
            for(int j = 0; j < M[0].length;j++){
                if  (M[i][j] > mayor){
                    mayor = M[i][j];
                }
            }
        }
        return mayor;
    }
    
    //Retorna el número menor de la Matriz M
    public static int calcularMenor(int M[][]){
        int menor = M[0][0];
        for(int i = 0;i < M.length;i++){
            for(int j = 0; j < M[0].length;j++){
                if  (M[i][j] < menor){
                    menor = M[i][j];
                }
            }
        }
        return menor;
    }
    
    //Retorna la suma de todos los elementos
    public static int calcularSuma(int M[][]){
        int suma = 0;
        for(int i = 0;i < M.length;i++){
            for(int j = 0; j < M[0].length;j++){
                suma += M[i][j];  //suma = suma + M[i][j];
            }
        }
        return suma;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] M = new int[FIL][COL];
        int mayor, menor, suma;
        rellenarMatriz(M);
        mostrarMatriz(M);
        mayor = calcularMayor(M);
        menor = calcularMenor(M);
        suma = calcularSuma(M);
        System.out.println("El número mayor es "+mayor+", el menor es "+menor+" y la suma de todos suss elementos es "+suma);
    }
    
}
