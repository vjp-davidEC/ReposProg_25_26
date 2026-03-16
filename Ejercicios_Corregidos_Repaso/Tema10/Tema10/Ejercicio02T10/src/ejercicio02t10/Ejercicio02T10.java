/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02t10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio02T10 {

    /* Retorna el número introducido por el usuario */
    public static int pedirNumero(){
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.print("Numero: ");
        num = teclado.nextInt();
        return num;
    }
            
    /* Inserta un nuevo número en la lista hasta que el usuario introduzca un número negativo */
    public static void rellenarLista(ArrayList<Integer> lista){
        int num;
        num = pedirNumero();
        while(num > 0){
            lista.add(num);
            num = pedirNumero();
        }
    }
    
    /* Muestra el contenido de la lista */
    public static void mostrarLista(ArrayList<Integer> lista){
        for(int i = 0;i < lista.size();i++){
            System.out.print("["+lista.get(i)+"]");
        }
        System.out.print("\n");
    }
    
    /* Retorna el valor mayor de la lista */
    public static int mayorElementosLista(ArrayList<Integer> lista){
        int n, mayor = lista.get(0);
        for(int i = 1;i < lista.size();i++){
            n = lista.get(i);
            if  (n > mayor){
                mayor = n;
            }
        }
        return mayor;
    }
    
    /* Retorna el valor más pequeño de la lista */
    public static int menorElementosLista(ArrayList<Integer> lista){        
        int n, menor = lista.get(0);
        for(int i = 1;i < lista.size();i++){
            n = lista.get(i);
            if  (n < menor){
                menor = n;
            }
        }
        return menor;
    }
    
    /* Retorna la suma de todos los valores contenidos en las celdas */
    public static int sumaElementosLista(ArrayList<Integer> lista){
        int suma = 0;
        for(int i = 0;i < lista.size();i++){
            suma = suma + lista.get(i);
        }
        return suma;
    }
            
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        rellenarLista(lista);
        mostrarLista(lista);
        System.out.println("Mayor: "+mayorElementosLista(lista));
        System.out.println("Menor: "+menorElementosLista(lista));
        System.out.println("Suma: "+sumaElementosLista(lista));
    }
    
}
