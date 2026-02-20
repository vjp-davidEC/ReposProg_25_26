/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03tema10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio03Tema10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Lista donde se guardan los numeros introducidos por el usuario
        ArrayList<Integer> numeros = new ArrayList<>();
        //Se pide al usuario los datos, se muestra, luego se intercambia y se vuelve a mostrar con el intercambio
        rellenarDatos(numeros);
        System.out.println("Lista original");
        mostrarLista(numeros);
        intercambiarPosicionesLista(numeros);
        System.out.println("Lista tras intercambiar la 2 y 4 posicion");
        mostrarLista(numeros);
    }
    
    //Metodo que rellena los datos por el usuario
    public static void rellenarDatos(ArrayList<Integer> lista){
        Scanner entrada = new Scanner(System.in);
        String respuesta;
        int num;
        do{
            System.out.print("Introduce un numero entero: ");
            num = entrada.nextInt();
            lista.add(num);//Se añade a la lista
            entrada.nextLine();//Limpiar buffer
            System.out.print("Deseas introducir otro numero - (SI o NO): ");
            respuesta = entrada.nextLine();
        }while(respuesta.equalsIgnoreCase("si"));
    }
    
    //Metodo que muestra la lista
    public static void mostrarLista(ArrayList<Integer> lista){
        System.out.println("--LISTA--");
        for(int i = 0; i < lista.size(); i++){
            System.out.print(lista.get(i) + " ");
        }
        System.out.println();
    }
    
    //Metodo que intercambia la posicion 2 y 4 que es el indice 1 y 3
    public static void intercambiarPosicionesLista(ArrayList<Integer> lista){
        //Se comprueba si existen los indices 1 y 3
        if(lista.size() > 3){
            //Se guarda temporalmente el valor de la posicion 2
            int aux = lista.get(1);
            //Se intercambia los valores
            lista.set(1, lista.get(3));
            lista.set(3, aux);
        }else{
            System.out.println("No hay suficientes elementos para intercambiar la 2 y 4 posicion");
        }
    }
}