/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01t7;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejercicio01T7 {
    
    public static void rellenarVector(int vNum[]){
        Scanner teclado = new Scanner(System.in);
        int i;
        for (i = 0;i < vNum.length;i++){
            System.out.print("Posición "+i+": ");
            vNum[i] = teclado.nextInt();
        }
    }
    
    public static void mostrarPares(int vNum[]){
        int i;
        for (i = 0;i < vNum.length;i++){
            if  ((vNum[i] % 2) == 0){
                System.out.println("["+vNum[i]+"]");
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vNum = new int[10];
        rellenarVector(vNum);
        mostrarPares(vNum);
    }
    
}
