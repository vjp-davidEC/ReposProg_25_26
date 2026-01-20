/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17tema7;

/**
 *
 * @author alumno
 */
public class Ejercicio17Tema7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int[10];
        
        numerosAleatorios(vector);
        mostrarNumeros(vector, "Vector generado: ");
        ordenarMayorMenor(vector);
        mostrarNumeros(vector, "Vector ordenador de mayor a menor: ");
    }
    
    //
    public static void numerosAleatorios(int[] vector){
        for(int i = 0; i < vector.length; i++){
            vector[i] = (int)(Math.random() * 10);
        }
    }
    
    //
    public static void mostrarNumeros(int [] vector, String mensaje){
        System.out.print(mensaje);
        for(int i = 0; i < vector.length; i++){
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }
    
    //
    public static void ordenarMayorMenor(int [] vector){
        for(int i = 0; i < vector.length - 1; i++){
            for (int j = 0; j < vector.length - 1; j++) {
                if(vector[j] < vector[j + 1]){
                int aux = vector[j];
                vector[j] = vector[j + 1];
                vector[j + 1] = aux;
                }
            }
        }
    }
}