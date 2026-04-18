package ejercicio14repaso12tema10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio14Repaso12Tema10 {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        rellenarLista(lista);
        mostrarLista(lista);
    }
    
    public static void rellenarLista(ArrayList<String> lista) {
        do {
            lista.add(pedirNombre());
        } while (pedirSeguir().equalsIgnoreCase("s"));
    }
    
    public static void mostrarLista(ArrayList<String> lista) {
        Iterator<String> it = lista.iterator();
        String nom;
        while (it.hasNext()) {
            nom = it.next();
            System.out.println("[" + nom + "]");
        }
    }
    
    
    public static String pedirSeguir() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Desea introducir otro nombre (s/n): ");
        return entrada.nextLine();
    }
    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre: ");
        return entrada.nextLine();
    }
}