/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02tema10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio02Tema10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Lista donde se guarda los numeros introducidos por el usuario
        ArrayList<Integer> numeros = new ArrayList<>();
        //Se pide al usuario que introduzca numeros positivos
        rellenarLista(numeros);
        //Si la lista no esta vacia, se muestra los resultados
        if(!numeros.isEmpty()){
            mostrarLista(numeros);
            System.out.println("El mayor es: " + listaMayor(numeros));
            System.out.println("El menor es: " + listaMenor(numeros));
            System.out.println("La suma es: " + listaSuma(numeros));
        }else{
            //Si esta vacia, se avisa al usuario
            System.out.println("No se han introducido numeros");
        }
    }
    
    //Metodo que rellena la lista con numeros positivos por el usuario
    public static void rellenarLista(ArrayList<Integer> lista){
        Scanner entrada = new Scanner(System.in);
        int num;
        System.out.print("Introduce numeros positivos: ");
        num = entrada.nextInt();
        //Mientras el numero sea positivo, se añade a la lista
        while(num >= 0){
            lista.add(num);//Se añade a la lista
            num = entrada.nextInt();
        }
    }
    
    //Metodo que muestra todos los elementos de la lista
    public static void mostrarLista(ArrayList<Integer> lista){
        System.out.println("--Elementos de la lista--");
        for(int i = 0; i < lista.size(); i++){
            System.out.print(lista.get(i) + " ");
        }
        System.out.println();
    }
    
    //Metodo que devuelve el numero mayor
    public static int listaMayor(ArrayList<Integer> lista){
        int max = lista.get(0);
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i) > max){
                max = lista.get(i);
            }
        }
        return max;
    }
    
    //Metodo que devuelve el numero menor
    public static int listaMenor(ArrayList<Integer> lista){
        int menor = lista.get(0);
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i) < menor){
                menor = lista.get(i);
            }
        }
        return menor;
    }
    
    //Metodo que devuelve la suma de todos los valores de la lista
    public static int listaSuma(ArrayList<Integer> lista){
        int suma = 0;
        for(int i = 0; i < lista.size(); i++){
            suma += lista.get(i);
        }
        return suma;
    }
}