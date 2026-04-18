package ejercicio04repaso02tema10;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio04Repaso02Tema10 {

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        rellenarLista(lista);
        mostrarLista(lista);
        System.out.println("Mayor: " + mayorElemento(lista));
        System.out.println("Menor: " + menorElemento(lista));
        System.out.println("Suma: " + sumaElemento(lista));
    }
    
    public static void rellenarLista(ArrayList<Integer> lista) {
        int num = pedirNumero();
        while(num > 0) {
            lista.add(num);
            num = pedirNumero();
        }
    }
    
    public static void mostrarLista(ArrayList<Integer> lista) {
        for (Integer list: lista) {
            System.out.println("["+list+"]");
        }
    }
    
    public static int mayorElemento(ArrayList<Integer> lista) {
        int numMayor, mayor = lista.get(0);
        for (Integer list : lista) {
            numMayor = list;
            if (numMayor > mayor) {
                mayor = numMayor;
            }
        }
        return mayor;
    }
    
    public static int menorElemento(ArrayList<Integer> lista) {
        int numMenor, menor = lista.get(0);
        for (Integer list : lista) {
            numMenor = list;
            if (numMenor < menor) {
                menor = numMenor;
            }
        }
        return menor;
    }
    
    public static int sumaElemento(ArrayList<Integer> lista) {
        int suma = 0;
        for (Integer list : lista) {
            suma += list;
        }
        return suma;
    }
    
    
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Numero: ");
        int num = entrada.nextInt();
        return num;
    }
}