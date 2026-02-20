/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05tema10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio05Tema10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Lista donde se guarda los numeros introducidos por el usuario
        ArrayList<Integer> numeros = new ArrayList<>();
        //Se pide que rellene la lista y que se muestre
        rellenarLista(numeros);
        System.out.println("Lista original");
        mostrarLista(numeros);
        
        //Se busca el indice mayor del Par y el indice menor del Impar
        int idxPar = indiceMayorPar(numeros);
        int idxImpar = indiceMenorImpar(numeros);
        
        //Si alguno no existe, no se puede hacer el intercambio
        if(idxPar == -1 || idxImpar == -1){
            System.out.println("No hay suficientes pares/impares para hacer el intercambio");
        }else{
            //Se muestra los valores encontrados
            System.out.println("Mayor que: " + numeros.get(idxPar));
            System.out.println("Menor que: " + numeros.get(idxImpar));
            //Se intercambian las posiciones en la lista y se vuelve a mostrar
            intercambiar(numeros, idxPar, idxImpar);
            System.out.println("Lista modificada");
            mostrarLista(numeros);
        }
    }
    
    //Metodo que rellena la lista con numeros introducidos por el usuario
    public static void rellenarLista(ArrayList<Integer> lista){
        Scanner entrada = new Scanner(System.in);
        String respuesta;
        int num;
        do{
            System.out.print("Introduce un numero entero: ");
            num = entrada.nextInt();
            lista.add(num);//Se añade a la lista
            entrada.nextLine();
            System.out.print("Deseas introducir otro numero - (SI o NO): ");
            respuesta = entrada.nextLine();
        }while(respuesta.equalsIgnoreCase("si"));
    }
    
    //Metodo que muestra todos los elementos de la lista
    public static void mostrarLista(ArrayList<Integer> lista){
        System.out.println("--LISTA--");
        for(int i = 0; i < lista.size(); i++){
            System.out.print(lista.get(i) + " ");
        }
        System.out.println();
    }
    
    //Metodo que muestra el indice del mayor numero par de la lista
    public static int indiceMayorPar(ArrayList<Integer> lista){
        int indice = 0;
        //Se avanza hasta encontrar el primer numero par
        while(indice < lista.size() && lista.get(indice) % 2 != 0){
            indice++;
        }
        //Si no se encontro ningun par
        if(indice == lista.size()){
            return -1;
        }
        //Se busca el mayor par a partir del primero encontrado
        for(int i = indice + 1; i < lista.size(); i++){
            int valor = lista.get(i);
            if(valor % 2 == 0 && valor > lista.get(indice)){
                indice = i;
            }
        }
        return indice;
    }
    
    //Metodo que muestra el indice del menor numero impar de la lista
    public static int indiceMenorImpar(ArrayList<Integer> lista){
        int indice = 0;
        //Se avanza hasta encontrar el primer numero impar
        while(indice < lista.size() && lista.get(indice) % 2 == 0){
            indice++;
        }
        //Si no se encontro ningun impar
        if(indice == lista.size()){
            return -1;
        }
        //Se busca el menor impar a partir del primero encontrado
        for(int i = indice + 1; i < lista.size(); i++){
            int valor = lista.get(i);
            if(valor % 2 != 0 && valor < lista.get(indice)){
                indice = i;
            }
        }
        return indice;
    }
    
    //Se intercambian los valores de las posiciones i y j de la lista
    public static void intercambiar(ArrayList<Integer> lista, int i, int j){
        int aux = lista.get(i);
        lista.set(i, lista.get(j));
        lista.set(j, aux);
    }
}
