/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio03t7;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Quique Pineda
 */
public class Ejercicio03T7 {

    /* Retorna la longitud introducida por el usuario. La longitud estará entre 1 y 10 y controlaremos, 
     * mediante excepciones, que no nos introduzca una letra.*/
    public static int pedirLongitud(){
        Scanner teclado = new Scanner(System.in);
        int longitud;
        do{
            try{
                System.out.print("Introduzca longitud: ");
                longitud = teclado.nextInt();
            }
            catch(InputMismatchException e){
                System.out.println("Debe introducir números enteros.");
                longitud = -1;
            }
        }while((longitud <= 0)||(longitud > 10));
        return longitud;
    }
    
    //Genera y retorna un aleatorio entre 1 y 6
    public static int generarAleatorio(){
        int aleatorio;
        aleatorio = (int)((Math.random()*6) + 1);
        return aleatorio;
    }
    
    //Rellena un vector con números aleatorios
    public static void rellenarVector(int vNum[]){
        int i;
        for (i = 0;i < vNum.length;i++){
            vNum[i] = generarAleatorio();
        }
    }
    
    public static void mostrarVector(int vNum[]){
        int i;
        for (i = 0;i < vNum.length;i++){
            System.out.print("["+vNum[i]+"] ");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int longitud = pedirLongitud();
        //creamos el vector con el tamaño que nos indique la variable longitud
        int[] vNum = new int[longitud];
        rellenarVector(vNum);
        mostrarVector(vNum);
    }
    
}
