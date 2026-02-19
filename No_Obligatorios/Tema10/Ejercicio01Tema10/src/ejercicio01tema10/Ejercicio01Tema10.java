/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01tema10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio01Tema10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <String> nombres = new ArrayList<>();
        rellenarLista(nombres);
        mostrarLista(nombres);
    }
    
    //
    public static void rellenarLista(ArrayList<String> lista){
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String repuesta;
        do {
            System.out.print("Introduce un nombre: ");
            nombre = entrada.nextLine();
            lista.add(nombre);
            System.out.print("Deseas introducir otro nombre - (SI o NO): ");
            repuesta = entrada.nextLine();
        }while (repuesta.equalsIgnoreCase("si"));
    }
    
    //
    public static void mostrarLista(ArrayList<String> lista){
        System.out.println("--NOMBRE DE LAS LISTA--");
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
    }
}