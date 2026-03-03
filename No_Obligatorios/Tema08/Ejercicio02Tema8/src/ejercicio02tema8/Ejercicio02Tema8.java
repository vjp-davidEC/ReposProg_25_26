/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02tema8;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio02Tema8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int longitud = pedirLongitud();//Longitud que se lo pedimos al usuario
        int[] vector = new int[longitud];//Array que se crea con lo que diga el usuario
        
        //Rellenar el array con su metodo y mostrar el array
        rellenarArray(vector);
        mostrarArray(vector);
    }
    
    //Metodo que rellena el array con numeros aleatorios
    public static void rellenarArray(int [] vector){
        for(int i = 0; i < vector.length; i++){
            vector[i] = (int)(Math.random() * 6) + 1;
        }
    }
    
    //Metodo que muestra el contenido del array con un for-each
    public static void mostrarArray(int [] vector){
        System.out.print("Contenido del array: ");
        for(int num : vector){
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    //Metodo que pide al usuario la longitud del array y valida la entrada
    public static int pedirLongitud(){
        Scanner entrada = new Scanner(System.in);
        int longitud = 0;
        boolean valido = false;
        
        //Repetir hasta que el usuario introduzca un valor entero
        while(!valido){
            try {
                System.out.print("Introduce la longitud del array: ");
                longitud = entrada.nextInt();
                
                //Comprobar si esta dentro del rango permitido
                if(longitud >= 1 && longitud <= 10){
                    valido = true;
                }else {
                    System.out.println("Error: La longitud debe ser entre 1 y 10");
                }
            }catch (InputMismatchException e) {
                //Si el usuario introduce una letra
                System.out.println("Error: Debes introducir un numero entero");
                entrada.nextLine();//Limpiar buffer
            }
        }
        return longitud;//Devolver la longitud valida
    }
}
