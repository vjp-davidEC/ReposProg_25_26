
package ejercicio05t10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Ejercicio05T10
 * 
 * @author admin
 */
public class Ejercicio05T10 {

    //Pide un número al usuario y lo retorna
    public static int pedirNumero(){
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.print("Introduzca un número entero: ");
        num = teclado.nextInt();
        return num;
    }
    
    //Pregunta al usuario si desea introducir más números
    public static String pedirRespuesta(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Desea introducir otro número? (s/n)");
        String resp = teclado.nextLine();
        return resp;
    }
    
    //Rellena la lista con los números enteros que quiera el usuario
    public static void rellenarLista(ArrayList<Integer> lista) {
        int num;
        String resp;     
        do{
            num = pedirNumero();
            lista.add(num);
            resp = pedirRespuesta();     
        } while(resp.equalsIgnoreCase("si"));
    }
    
    //Muestra el contenido de la lista
    public static void mostrarLista(ArrayList<Integer> lista){
        for(int i = 0;i < lista.size();i++){
            System.out.print("["+lista.get(i)+"]");
        }
        System.out.print("\n");
    }
    
    //Retorna el mayor número par de la lista
    public static int mayorNumeroPar(ArrayList<Integer> lista){
        //Inicializamos mayorPar en 0, ya que no podemos asegurar que el primer elemento de la lista sea par
        int n, mayorPar = 0;
        for(int i = 0;i < lista.size();i++){
            n = lista.get(i);
            if  ((n % 2 == 0) && (n > mayorPar)){
                mayorPar = n;
            }
        }
        return mayorPar;
    }
    
    //Retorna el menor número impar de la lista
    public static int menorNumeroImpar(ArrayList<Integer> lista){
        //Inicializamos menorImpar en 999, ya que no podemos asegurar que el primer elemento de la lista sea impar
        int n, menorImpar = 999;
        for(int i = 0;i < lista.size();i++){
            n = lista.get(i);
            if  ((n % 2 != 0) && (n < menorImpar)){
                menorImpar = n;
            }
        }
        return menorImpar;
    }
    
    //Intercambia las posiciones de mayorNumeroPar y menorNumeroImpar en la lista
    public static void intercambiarPosiciones(ArrayList<Integer> lista, int mayorPar, int menorImpar) {
        //Obtenemos el índice de ambos números
        int posMayorPar = lista.indexOf(mayorPar);
        int posMenorImpar = lista.indexOf(menorImpar);
        //Intercambiamos posiciones en la lista
        if(posMayorPar != -1 && posMenorImpar != -1) {
            int aux = lista.get(posMayorPar);
            lista.set(posMayorPar, lista.get(posMenorImpar));
            lista.set(posMenorImpar, aux);
        } else {
            System.out.println("No se han podido intercambiar las posiciones.");
        }
    }
    
    /**
     * Método main
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos el ArrayList de Integer
        ArrayList<Integer> lista = new ArrayList<>();
        
        rellenarLista(lista);
        mostrarLista(lista);
        int mayorPar = mayorNumeroPar(lista);
        int menorImpar = menorNumeroImpar(lista);
        System.out.println("Mayor par: " + mayorPar);
        System.out.println("Menor impar: " + menorImpar);
        intercambiarPosiciones(lista, mayorPar, menorImpar);
        mostrarLista(lista);
        
    }

}
