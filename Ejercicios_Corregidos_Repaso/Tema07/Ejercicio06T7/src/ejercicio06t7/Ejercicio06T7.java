/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio06t7;

/**
 *
 * @author Quique Pineda
 */
public class Ejercicio06T7 {

    final static int MAX = 80;
    
    public static boolean esPrimo(int n){
        boolean primo = true;
        int i = 2;
        while((primo)&&(i <= (n/2))){
            if  ((n % i) == 0){
                primo = false;
            }
            i++;
        }
        return primo;
    }
    
    //Rellena el vector con los primeros 80 números primos
    public static void rellenarVector(int vPrimos[]){
        int cont = 0;  //Contador de números primos
        int i = 1;
        while(cont < MAX){
            if  (esPrimo(i)){
                vPrimos[cont] = i;
                cont++;  //Hemos encontrado un primo más
            }
            i++;  //Pasamos al siguiente número, para comprobar si es primo o no
        }
    }
    
    public static void mostrarVector(int vPrimos[]){
        for(int i = 0;i < vPrimos.length;i++){
            System.out.print("["+vPrimos[i]+"]");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vPrimos = new int[MAX];
        rellenarVector(vPrimos);
        mostrarVector(vPrimos);
    }
    
}
