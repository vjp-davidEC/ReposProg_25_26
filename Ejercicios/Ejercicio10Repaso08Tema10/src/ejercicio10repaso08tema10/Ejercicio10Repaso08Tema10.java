package ejercicio10repaso08tema10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio10Repaso08Tema10 {

    public static void main(String[] args) {
        ArrayList<Alumno> lista = new ArrayList<>();
        rellenarLista(lista);
        mostrarLista(lista);
        System.out.println("--Mostrar lista con it--");
        mostrarListaIt(lista);
    }
    
    public static void rellenarLista(ArrayList<Alumno> lista) {
        do {
            lista.add(new Alumno(pedirNombre(), pedirCurso()));
        } while (pedirSeguir().equalsIgnoreCase("s"));
    }
    
    public static void mostrarLista(ArrayList<Alumno> lista) {
        System.out.println("");
        for (Alumno alum : lista) {
            System.out.println(alum.toString());
        }
    }
    
    public static void mostrarListaIt(ArrayList<Alumno> lista) {
        Alumno alum;
        Iterator <Alumno> it = lista.iterator();
        while (it.hasNext()) {
            alum = it.next();
            System.out.println(alum.toString());
        }
    }
    
    
    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre: ");
        return entrada.nextLine();
    }
    public static String pedirSeguir() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Quieres introducir otro alumno (s/n): ");
        return entrada.nextLine();
    }
    public static String pedirCurso() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Curso: ");
        return entrada.nextLine();
    }
}