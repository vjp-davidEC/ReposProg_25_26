/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02t7;

import java.util.Scanner;

/**
 *
 * @author Quique Pineda
 */
public class Ejercicio02T7 {
    
    public static void rellenarVector(int vNum[]){
        Scanner teclado = new Scanner(System.in);
        int i;
        for (i = 0;i < vNum.length;i++){
            System.out.print("Posición "+i+": ");
            vNum[i] = teclado.nextInt();
        }
    }
    
    public static void mostrarVector(int vNum[]){
        int i;
        for (i = 0;i < vNum.length;i++){
            System.out.print("["+vNum[i]+"] ");
        }
    }
    
    //Intercambia los valores de las celdas 1 y 3 (segunda y cuarta posición, puesto que la primera celda es la celda 0).
    public static void intercambiarDatos(int[] vNum){
        int aux = vNum[1];
        vNum[1] = vNum[3];
        vNum[3] = aux;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vNum = new int[7];
        rellenarVector(vNum);
        System.out.println("Vector inicial: ");
        mostrarVector(vNum);
        intercambiarDatos(vNum);
        System.out.println("\nValores intercambiados: ");
        mostrarVector(vNum);
    }
    
}
