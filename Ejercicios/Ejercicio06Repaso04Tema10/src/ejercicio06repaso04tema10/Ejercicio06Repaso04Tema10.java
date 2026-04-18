package ejercicio06repaso04tema10;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio06Repaso04Tema10 {

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        rellenarLista(lista);
        mostrarLista(lista);
        System.out.println("--Sustituir--");
        recorrerLista(lista);
        mostrarLista(lista);
    }
    
    public static void rellenarLista(ArrayList<Integer> lista) {
        int num = pedirNumero();
        while (num > 0) {
            lista.add(num);
            num = pedirNumero();
        }
    }
    
    public static void sustituirRepetidosPorCero(ArrayList<Integer> lista, int num) {
        int primero = lista.indexOf(num);
        int ultimo = lista.lastIndexOf(num);
        
        for (int i = primero; i <= ultimo; i++) {
            if (lista.get(i) == num) {
                lista.set(i, 0);
            }
        }
    }
    
    public static boolean esRepetido(ArrayList<Integer> lista, int num) {
        return lista.indexOf(num) != lista.lastIndexOf(num);
    }
    
    public static void recorrerLista(ArrayList<Integer> lista) {
        int num;
        for (Integer list : lista) {
            num = list;
            if (num != 0) {
                if (esRepetido(lista, num)) {
                    sustituirRepetidosPorCero(lista, num);
                }
            }
        }
    }
    
    public static void mostrarLista(ArrayList<Integer> lista) {
        for (Integer list : lista) {
            System.out.println("["+list+"]");
        }
    }
    
    
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Entero: ");
        int num = entrada.nextInt();
        return num;
    }
}