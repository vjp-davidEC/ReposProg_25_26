/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio08t10;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

/**
 *
 * @author admin
 */
public class Ejercicio08T10 {

    /**
     * Método que pide al usuario el nombre del alumno.
     * 
     * @return el nombre introducido
     */
    public static String pedirNombre(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre: ");
        return entrada.nextLine();        
    }
    
    /**
     * Método que pide al usuario el curso.
     * 
     * @return el curso introducido 
     */
    public static String pedirCurso(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Curso: ");
        return entrada.nextLine();        
    }
    
    /**
     * Método que pregunta al usuario si quiere
     * añadir otro alumno a la lista.
     * 
     * @return s para sí o n para no
     */
    public static String pedirSeguir(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("¿Desea añadir un alumno?(s/n) ");
        return entrada.nextLine();        
    }
    
    /**
     * Método que inserta alumnos en la lista
     * hasta que el usuario quiera.
     * 
     * @param lista 
     */
    public static void rellenarLista(ArrayList<Alumno> lista){        
        do{            
            lista.add(new Alumno(pedirNombre(), pedirCurso()));                        
        } while(pedirSeguir().equalsIgnoreCase("s"));
    }
    
    /**
     * Método que muestra la lista.
     * 
     * @param lista 
     */
    public static void mostrarLista(ArrayList<Alumno> lista){
        for(int i = 0;i < lista.size();i++){
            System.out.println(lista.get(i).toString());
        }
    }
    
    /**
     * Método que muestra la lista con iterador.
     * 
     * @param lista 
     */
    public static void mostrarListaIt(ArrayList<Alumno> lista){
        Alumno alum;
        Iterator <Alumno> it = lista.iterator();
        while(it.hasNext()){
            alum = it.next();
            System.out.println(alum.toString());
        }
    }
    
    /**
     * Método principal.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Alumno> lista = new ArrayList<>();
        rellenarLista(lista);
        mostrarLista(lista);
        mostrarListaIt(lista);
    }
    
}
