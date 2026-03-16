/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio03t10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio03T10 {

    /* Retorna el número introducido por el usuario */
    public static int pedirNumero(){
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.print("Número: ");
        num = teclado.nextInt();
        return num;
    }
            
    public static String pedirSeguir(){
	Scanner teclado = new Scanner(System.in);
	String seguir;
	System.out.print("¿Quiere introducir más números? (s/n)");
        seguir = teclado.nextLine();
	return seguir;
    }
    
    /* Inserta un nuevo número en la lista hasta que el usuario introduzca un número negativo */
    public static void rellenarLista(ArrayList<Integer> lista){
        int num;
        String resp;
        do{
            num = pedirNumero();
            lista.add(num);
            resp = pedirSeguir();
        }while(resp.equalsIgnoreCase("s"));
    }
    
    /* Muestra el contenido de la lista */
    public static void mostrarLista(ArrayList<Integer> lista){
        for(int i = 0;i < lista.size();i++){
            System.out.print("["+lista.get(i)+"]");
        }
        System.out.print("\n");
    }
    
    /* Intercambia las posiciones 2 y 4 de la lista */
    public static void intercambiaPosicion2y4(ArrayList<Integer> lista){
        int aux;
        if  (lista.size() >= 4){
            /* Intercambiamos los valores: con los "vasos" */
            aux = lista.get(1);
            lista.set(1, lista.get(3));
            lista.set(3, aux);
        }
        else{
            System.out.println("No existen las posiciones a intercambiar");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        rellenarLista(lista);
        mostrarLista(lista);
        intercambiaPosicion2y4(lista);
        mostrarLista(lista);
    }
    
}
