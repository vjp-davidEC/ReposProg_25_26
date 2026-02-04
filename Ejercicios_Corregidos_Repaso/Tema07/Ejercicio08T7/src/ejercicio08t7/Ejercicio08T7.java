/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio08t7;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejercicio08T7 {

    public static int pedirNumero(){
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.println("Introduce número de 5 cifras");
        num = teclado.nextInt();
        return num;
    }
    
    public static void rellenarVector(int vNum[], int num){
        int i, resto;
        for(i = 0;i < vNum.length;i++){
            resto = num % 10;
            vNum[i] = resto; 
            num = num / 10;
        }
    }
    
    public static void mostrarVector(int vNum[]){
        int i;
        for(i = 0;i < vNum.length;i++){
            System.out.print(vNum[i]);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = pedirNumero();
        int[] vNum = new int [5];
        rellenarVector(vNum, num);
        mostrarVector(vNum);
    }
    
}
