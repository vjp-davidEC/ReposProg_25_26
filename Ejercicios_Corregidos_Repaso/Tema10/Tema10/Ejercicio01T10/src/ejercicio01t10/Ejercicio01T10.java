/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01t10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejercicio01T10 {

    public static String pedirNombre(){
	Scanner teclado = new Scanner(System.in);
	String nombre;
	System.out.print("Nombre: ");
	nombre = teclado.nextLine();
	return nombre;
    }

    public static String pedirSeguir(){
	Scanner teclado = new Scanner(System.in);
	String seguir;
	System.out.print("¿Quiere introducir más nombres? (s/n)");
        seguir = teclado.nextLine();
	return seguir;
    }
    
    public static void rellenarLista(ArrayList<String> lista){
        do{
            lista.add(pedirNombre());
        }while(pedirSeguir().equalsIgnoreCase("s"));
    }
    
    public static void mostrarLista(ArrayList<String> lista){
        lista.forEach(nombre -> System.out.println("-- "+ nombre +" --"));        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList <>();
        rellenarLista(lista);
        mostrarLista(lista);
    }
    
}
