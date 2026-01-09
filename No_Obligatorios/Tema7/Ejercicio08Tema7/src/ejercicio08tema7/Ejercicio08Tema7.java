/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio08tema7;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio08Tema7 {

    /**
     * @param args the command line arguments
     */
    
    public static int pedirNumeros(){
        Scanner entrada = new Scanner(System.in);
        
        int numero = 0;
        boolean valido = false;
        
        do{
            System.out.print("Escribe un numero de 5 cifras: ");
            try{
                numero = entrada.nextInt();
                if(numero >= 10000 && numero <= 99999){
                    valido = true;
                }else{
                    System.out.println("Error: Debe de ser un numero de 5 cifras");
                }
            }catch(InputMismatchException e){
                System.out.println("Error: Debe introducir un numero entero");
                entrada.next();
            }
        }while(!valido);
        return numero;
    }
    
    public static void dividirNumeros(int numero, int [] vector){
        for(int i = 0; i < vector.length; i++){
            vector[i] = numero % 10;
            numero /= 10;
        }
    }
    
    public static void mostrarNumeros(int[] vector){
        System.out.print("El numero introducido escrito al reves es el: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]);
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int numero = pedirNumeros();
        int[] vector = new int[5];
        
        dividirNumeros(numero, vector);
        mostrarNumeros(vector);
    }
}
