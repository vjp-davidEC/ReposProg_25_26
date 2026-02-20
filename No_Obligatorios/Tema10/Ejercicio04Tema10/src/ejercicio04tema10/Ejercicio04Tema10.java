/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04tema10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio04Tema10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Lista donde se guardan los numeros introducidos por el usuario
        ArrayList<Integer> numeros = new ArrayList<>();
        //Se pide al usuario que rellene la lista, se muestra, luego los repetidos se sustituyen por 0 y se vuelve a mostrar
        rellenarLista(numeros);
        System.out.println("Lista original");
        mostrarLista(numeros);
        sustituirRepetidosPorCero(numeros);
        System.out.println("Lista modificada");
        mostrarLista(numeros);
    }
    
    //Metodo que rellena los numeros de la lista
    public static void rellenarLista(ArrayList<Integer> lista){
        Scanner entrada = new Scanner(System.in);
        int num;
        System.out.print("Introduce numeros positivos: ");
        num = entrada.nextInt();
        //Mientras sea positivo, se añade a la lista
        while(num >= 0){
            lista.add(num);//Se añade a la lista
            num = entrada.nextInt();
        }
    }
    
    //Metodo que muestra todos los elementos de la lista
    public static void mostrarLista(ArrayList<Integer> lista){
        for(int i = 0; i < lista.size(); i++){
            System.out.print(lista.get(i) + " ");
        }
        System.out.println();
    }
    
    //Metodo que sustituye por 0 todos los numeros repetidos
    public static void sustituirRepetidosPorCero(ArrayList<Integer> lista){
        //Lista donde se guarda cuantas veces aparece cada elemento
        ArrayList<Integer> contadores = new ArrayList<>();
        
        //Primera pasada: Se cuenta las repeticiones de cada valor
        for(int i = 0; i < lista.size(); i++){
            int valor = lista.get(i);
            int contador = 0;
            //Se cuenta cuantas veces aparece el valor en toda la lista
            for(int j = 0; j < lista.size(); j++){
                if(lista.get(j).equals(valor)){
                    contador++;
                }
            }
            contadores.add(contador);//Se guarda el numero de repeticiones
        }
        //Segunda pasada: Se sustituyen por 0 los valores repetidos
        for(int i = 0; i < lista.size(); i++){
            if(contadores.get(i) >= 2){
                lista.set(i, 0);
            }
        }
    }
}