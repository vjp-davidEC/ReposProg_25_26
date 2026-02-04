/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio19t7;

/**
 *
 * @author Usuario
 */
public class Ejercicio19T7 {

    public static int generarAleatorio(){
        int aleatorio;
        aleatorio = (int) ((Math.random()*71)+10);
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
    
    public static void mostrarMayor(int[] vector){
        int mayor = vector[0];
        for(int i = 0;i < vector.length;i++){
            if  (mayor < vector[i]){
                mayor = vector[i];
            }
        }
        System.out.println("El número mayor es: "+mayor);
    }
    
    public static void mostrarMenor(int[] vector){
        int menor = vector[0];
        for(int i = 0;i < vector.length;i++){
            if  (menor > vector[i]){
                menor = vector[i];
            }
        }
        System.out.println("El número menor es: "+menor);
    }
    
    public static void mostrarMedia(int[] vector){
        int suma = 0;
        float media;
        for(int i = 0;i < vector.length;i++){
            suma = suma + vector[i];
        }
        media =  (float)suma / (float)vector.length;
        System.out.println("La media es: "+media);
    }
    
    public static void numeroMasRepetido(int[] vector){
        int[] vContadores = new int[71];
        int valor, mayor;
        //Actializamos contadores
        for(int i = 0;i < vector.length;i++){
            valor = vector[i];
            /* Restamos 10 porque almacenaremos el contador del...
                ...número 10 en la celda 0
                ...número 11 en la celda 1
                ...número 12 en la celda 2
                ...
            */
            vContadores[valor - 10]++;
        }
        //Mostramos el vector de contadores
        System.out.println("Mostrando contadores: ");
        for(int i = 0;i < vContadores.length;i++){
            System.out.print("["+vContadores[i]+"]");
        }
        //Calculamos el mayor de los contadores (el número más repetido)
        mayor = vContadores[0];
        for(int i = 0;i < vContadores.length;i++){
            if  (mayor < vContadores[i]){
                mayor = vContadores[i];
            }
        }
        System.out.println("");  //Línea en blanco
        //Mostramos los contadores más altos
        for(int i = 0;i < vContadores.length;i++){
            if  (mayor == vContadores[i]){
                System.out.println("El valor más repetido es: "+(i+10)+" con "+vContadores[i]+" veces.");
            }
        }        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int[100];
        rellenarVector(vector);
        mostrarVector(vector);
        mostrarMayor(vector);
        mostrarMenor(vector);
        mostrarMedia(vector);
        numeroMasRepetido(vector);
    }
    
}
