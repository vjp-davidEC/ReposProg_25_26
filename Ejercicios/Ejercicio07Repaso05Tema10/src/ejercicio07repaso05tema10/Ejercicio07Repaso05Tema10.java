package ejercicio07repaso05tema10;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio07Repaso05Tema10 {

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        rellenarLista(lista);
        mostrarLista(lista);
        System.out.println("--Calcular--");
        System.out.println("Mayor que: " + mayorPar(lista));
        System.out.println("Menor que: " + menorImpar(lista));
        System.out.println("--Intercambiar--");
        intercambiarPosiciones(lista, mayorPar(lista), menorImpar(lista));
        mostrarLista(lista);
    }
    
    public static void rellenarLista(ArrayList<Integer> lista) {
        do {
            lista.add(pedirNumero());
        } while (pedirRespuesta().equalsIgnoreCase("s"));
    }
    
    public static void mostrarLista(ArrayList<Integer> lista) {
        for (Integer list : lista) {
            System.out.println("["+list+"]");
        }
    }
    
    public static int mayorPar(ArrayList<Integer> lista) {
        int numPar, mayorPar = 0;
        for (Integer list : lista) {
            numPar = list;
            if ((numPar % 2 == 0) && (numPar > mayorPar)) {
                mayorPar = numPar;
            }
        }
        return mayorPar;
    }
    
    public static int menorImpar(ArrayList<Integer> lista) {
        int numImpar, menorImpar = 999;
        for (Integer list : lista) {
            numImpar = list;
            if ((numImpar % 2 != 0) && (numImpar < menorImpar)) {
                menorImpar = numImpar;
            }
        }
        return menorImpar;
    }
    
    public static void intercambiarPosiciones(ArrayList<Integer> lista, int mayorPar, int menorImpar) {
        int posMayorPar = lista.indexOf(mayorPar);
        int posMenorImpar = lista.lastIndexOf(menorImpar);
        if (posMayorPar != -1 && posMenorImpar != -1) {
            int aux = lista.get(posMayorPar);
            lista.set(posMayorPar, lista.get(posMenorImpar));
            lista.set(posMenorImpar, aux);
        } else {
            System.out.println("No se ha podido intercambiar las posiciones");
        }
    }
    
    
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un numero entero: ");
        int num = entrada.nextInt();
        return num;
    }
    public static String pedirRespuesta() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Deseas introducir otro numero (s/n): ");
        String respuesta = entrada.nextLine();
        return respuesta;
    }
}