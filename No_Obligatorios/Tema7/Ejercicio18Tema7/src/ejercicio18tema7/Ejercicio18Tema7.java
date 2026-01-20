/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18tema7;

/**
 *
 * @author alumno
 */
public class Ejercicio18Tema7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector1 = {3, 5, 6, 8, 1};
        int[] vector2 = {2, 4, 7, 9, 0};

        int[] resultado = unirOrdenar(vector1, vector2);
        mostrar(resultado, "Los elementos ordenados de menor a mayor son: ");
    }
    
    //
    public static int[] unirOrdenar(int[] vector1, int [] vector2){
        int[] result = new int[10];
        
        for(int i = 0; i < 5; i++) {
            result[i] = vector1[i];
        }
        
        for (int i = 0; i < 5; i++) {
            result[i + 5] = vector2[i];
        }
        
        for (int i = 0; i < result.length - 1; i++) {
            for (int j = 0; j < result.length - 1; j++) {
                if(result[j] > result[j + 1]){
                    int aux = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = aux;
                }
            }
        }
        return result;
    }
    
    //
    public static void mostrar(int[] vector, String mensaje){
        System.out.print(mensaje);
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }
}