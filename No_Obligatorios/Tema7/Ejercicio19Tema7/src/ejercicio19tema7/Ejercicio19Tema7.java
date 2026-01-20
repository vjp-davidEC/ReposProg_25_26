/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19tema7;

/**
 *
 * @author alumno
 */
public class Ejercicio19Tema7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int[100];
        
        rellenarVector(vector);
        mayorValor(vector);
        menorValor(vector);
        masRepetidos(vector);
        media(vector);
    }
    
    //
    public static void rellenarVector(int [] vector){
        for(int i = 0; i < vector.length; i++){
            vector[i] = (int)(Math.random() * 71) + 10;
        }
    }
    
    //
    public static void mayorValor(int [] vector){
        int mayor = vector[0];
        for(int i = 0; i < vector.length; i++){
            if(vector[i] > mayor){
                mayor = vector[i];
            }
        }
        System.out.println("El mayor de todos es: " + mayor);
    }
    
    //
    public static void menorValor(int [] vector){
        int menor = vector[0];
        for(int i = 0; i < vector.length; i++){
            if(vector[i] < menor){
                menor = vector[i];
            }
        }
        System.out.println("El menor de todos es: " + menor);
    }
    
    //
    public static void masRepetidos(int [] vector){
        int rep = vector[0];
        int maxRep = 0;
        
        for(int i = 0; i < vector.length; i++){
            int contador = 0;
            
            for(int j = 0; j < vector.length; j++){
                if(vector[i] == vector[j]){
                    contador++;
                }
            }
            
            if(contador > maxRep){
                maxRep = contador;
                rep = vector[i];
            }
        }
        System.out.println("Valor mas repetido: " + rep);
    }
    
    //
    public static void media(int [] vector){
        int suma = 0;
        for(int i = 0; i < vector.length; i++){
            suma += vector[i];
        }
        double media = (double)suma / vector.length;
        System.out.println("La media total es: " + media);
    }
}