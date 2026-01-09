/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio09tema7;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio09Tema7 {

    /**
     * @param args the command line arguments
     */
    
    public static int pedirNumeros(){
        Scanner entrada = new Scanner(System.in);
        
        int numero = 0;
        
        do{
            System.out.print("Escribe un numero: ");
            try{
                numero = entrada.nextInt();
            }catch(InputMismatchException e){
                System.out.println("Error: Debe introducir un numero entero");
                entrada.next();
            }
        }while(numero<1);
        return numero;
    }
    
    public static int calcularCifras(int numero){
        int contador = 0;
        while(numero>0){
            numero /= 10;
            contador++;
        }
        System.out.println("El numero tiene " + contador + " cifras");
        return contador;
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
        int[] vector = new int[calcularCifras(numero)];
        
        dividirNumeros(numero, vector);
        mostrarNumeros(vector);
    }
}