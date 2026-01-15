/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06tema7;

/**
 *
 * @author alumno
 */
public class Ejercicio06Tema7 {

    /**
     * @param args the command line arguments
     */
    
    //Método que determina si un número es primo
    public static boolean esPrimo(int numero){
        //Los números menores que 2 no son primos
        if(numero < 2) return false;
        boolean esPrimo = true; //Suponemos que es primo 
        int i = 2;
        
        //Mientras siga siendo primo y no hayamos llegado a la raíz cuadrada
        while(esPrimo && i <= Math.sqrt(numero)){
            if(numero % i == 0){
                esPrimo = false; 
            }
            i++;//Pasamos al siguiente divisor
        }
        return esPrimo;//Si no tiene divisores, es primo
    }
    
    //Método que rellena el vector con los primeros números primos
    public static void rellenarPrimos(int [] vector){
        int contador = 0;
        int numero = 2;
        
        //Mientras no hayamos llenado el vector
        while(contador < vector.length){
            if(esPrimo(numero)){//Si el número es primo
                vector[contador] = numero;//Lo guardamos en el vector
                contador++;//Avanzamos a la siguiente posición
            }
            numero++;//Probamos el siguiente número
        }
    }
    
    //Método que muestra el contenido del vector con sus posiciones
    public static void mostrarVector(int [] vector){
        System.out.println("Contenido de un array unidimensional de " + vector.length + " posiciones con numeros primos:");
        for(int i = 0; i < vector.length; i++){
            System.out.println("Posicion " + i + " = " + vector[i]);//Mostramos índice y valor
        }
    }
    
    public static void main(String[] args) {
        int[] vector = new int[80];//Creamos un vector de 80 posiciones
        
        rellenarPrimos(vector);//Lo rellenamos con los primeros 80 números primos
        mostrarVector(vector);//Lo mostramos por pantalla
    }
}