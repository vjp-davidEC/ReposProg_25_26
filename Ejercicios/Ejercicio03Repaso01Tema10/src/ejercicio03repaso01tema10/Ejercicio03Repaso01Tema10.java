package ejercicio03repaso01tema10;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio03Repaso01Tema10 {

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
        System.out.println("");
        for (String list : lista) {
            System.out.println("-- " + list + " --");
        }
    }
    
    
    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre: ");
        String nombre = entrada.nextLine();
        return nombre;
    }
    
    public static String pedirSeguir() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Quieres introducir otro nombre (s/n): ");
        String seguir = entrada.nextLine();
        return seguir;
    }
}