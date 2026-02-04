/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio17t7;

/**
 *
 * @author Usuario
 */
public class Ejercicio17T7 {

    public static int generarAleatorio(){
        int aleatorio;
        aleatorio = (int) (Math.random()*10);
        return aleatorio; 
    }
    
    public static void rellenarVector(int[] vector){
        for(int i = 0;i < vector.length;i++){
            vector[i] = generarAleatorio();
        }
    }
    
    public static void mostrarVector(int[] vector){
        for(int i = 0;i < vector.length;i++){
            System.out.print("["+vector[i]+"]");
        }
        System.out.println("");  //Línea en blanco
    }
    
    public static void ordenarVector(int[] vector){
        int aux;
        for(int cont = 0;cont < vector.length;cont++){
            for(int i = 0;i < vector.length-1;i++){
                if  (vector[i] < vector[i+1]){
                    aux = vector[i];
                    vector[i] = vector[i+1];
                    vector[i+1] = aux;
                }
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int[10];
        rellenarVector(vector);
        mostrarVector(vector);
        ordenarVector(vector);
        mostrarVector(vector);
    }
    
}
