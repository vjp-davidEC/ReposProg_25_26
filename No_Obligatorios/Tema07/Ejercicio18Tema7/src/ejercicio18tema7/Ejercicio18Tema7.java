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
        int[] vector1 = {3, 5, 6, 8, 1};//Primer vector con 5 elementos
        int[] vector2 = {2, 4, 7, 9, 0};//Segundo vector con 5 elementos

        //Unir ambos vectores y ordenarlos de menor a mayor
        int[] resultado = unirOrdenar(vector1, vector2);
        mostrar(resultado, "Los elementos ordenados de menor a mayor son: ");
    }
    
    //Metodo que une dos vectores de 5 elementos cada uno y los ordena de menor a mayor
    public static int[] unirOrdenar(int[] vector1, int [] vector2){
        int[] result = new int[10];
        
        //Copiar los elementos del vector
        for(int i = 0; i < 5; i++) {
            result[i] = vector1[i];
        }
        
        //Copiar los otros elementos del segundo vector
        for (int i = 0; i < 5; i++) {
            result[i + 5] = vector2[i];
        }
        
        //Ordenar el vector resultante usando el método burbuja
        for (int i = 0; i < result.length - 1; i++) {
            for (int j = 0; j < result.length - 1; j++) {
                if(result[j] > result[j + 1]){
                    int aux = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = aux;
                }
            }
        }
        return result;//Devolver el vector ya ordenado
    }
    
    //Metodo que muestra los elementos de un vector precedidos de un mensaje
    public static void mostrar(int[] vector, String mensaje){
        System.out.print(mensaje);
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }
}