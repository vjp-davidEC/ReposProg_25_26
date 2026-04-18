package ejercicio05repaso03tema10;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio05Repaso03Tema10 {

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        rellenarLista(lista);
        mostraLista(lista);
        System.out.println("---Intercambio---");
        intercambiarPosicion2y4(lista);
        mostraLista(lista);
    }
    
    public static void rellenarLista(ArrayList<Integer> lista) {
        do {
            lista.add(pedirNumero());
        } while (pedirSeguir().equalsIgnoreCase("s"));
    }
    
    public static void mostraLista(ArrayList<Integer> lista) {
        for (Integer list : lista) {
            System.out.println("["+list+"]");
        }
    }
    
    public static void intercambiarPosicion2y4(ArrayList<Integer> lista) {
        int aux;
        if (lista.size() >= 4) {
            aux = lista.get(1);
            lista.set(1, lista.get(3));
            lista.set(3, aux);
        } else {
            System.out.println("No existen las posiciones a intercambiar");
        }
    }
    
    
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Numero: ");
        int num = entrada.nextInt();
        return num;
    }
    public static String pedirSeguir() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Quieres introducir otro nombre (s/n): ");
        String seguir = entrada.nextLine();
        return seguir;
    }
}