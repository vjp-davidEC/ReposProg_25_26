/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12t10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio12T10 {
    /**
     * Método que pregunta al usuario
     * si quiere añadir otro nombre.
     * 
     * @return s para sí o n para no.
     */
    public static String pedirSeguir(){
        Scanner entrada = new Scanner(System.in);                
        System.out.println("¿Desea introducir otro nombre? (s/n)");    
        return entrada.nextLine();
    }
    
    /**
     * Método que pide al usuario un nombre.
     * 
     * @return el nombre introducido.
     */
    public static String pedirNombre(){
        Scanner entrada = new Scanner(System.in);                
        System.out.print("Nombre: ");    
        return entrada.nextLine();
    }

    /**
     * Método que inserta nombres en la lista
     * hasta que el usuario quiera.
     * 
     * @param lista 
     */
    public static void rellenarLista(ArrayList<String> lista){                
        do{               
            lista.add(pedirNombre());                        
        }while(pedirSeguir().equalsIgnoreCase("s"));
    }
    
    /**
     * Método que muestra la lista.
     * 
     * @param lista 
     */
    public static void mostrarLista(ArrayList<String> lista){
        Iterator<String> it = lista.iterator();
        String nom;
        while(it.hasNext()){
            nom = it.next();
            System.out.println("["+nom+"]");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        rellenarLista(lista);
        mostrarLista(lista);
    }
    
}
