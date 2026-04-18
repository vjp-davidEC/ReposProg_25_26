package ejercicio09repaso07tema10;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio09Repaso07Tema10 {

    public static final int NUM_SEMANAS = 4;
    public static final int NUM_DIAS_SEMANA = 7;
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> lista = new ArrayList<>();
        String[] vDiasSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        
        int opcion = 0;
        
        do {
            mostrarMenu();
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1 -> rellenarLista(lista, vDiasSemana);
                case 2 -> mostrarLista(lista, vDiasSemana);
                case 3 -> mostrarTemperaturaMedia(lista);
                case 4 -> mostrarDiasMasCalurosos(lista, vDiasSemana);
                case 5 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion no valida, intentelo de nuevo");
            }
        } while (opcion != 5);
    }
    
    public static void mostrarMenu() {
        System.out.println("\n--MENU--");
        System.out.println("1. Rellenar las temperaturas");
        System.out.println("2. Mostrar las temperaturas");
        System.out.println("3. Mostrar la temperatura media del mes");
        System.out.println("4. Dia/Dias mas calurosos del mes");
        System.out.println("5. Salir del programa");
        System.out.print("Introduce una opcion: ");
    }
    
    public static void rellenarLista(ArrayList<ArrayList<Integer>> lista, String[] vDiasSemana) {
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < NUM_SEMANAS; i++) {
            lista.add(new ArrayList<>());
            for(int j = 0; j < NUM_DIAS_SEMANA; j++) {
                System.out.print("Temperatura " + vDiasSemana[j] + " semana " + i + ": ");
                int temp = entrada.nextInt();
                lista.get(i).add(temp);
            }
        }
    }
    
    public static void mostrarLista(ArrayList<ArrayList<Integer>> lista, String[] vDiasSemana) {
        System.out.println("");
        
        if (lista.isEmpty()) {
            System.out.println("Aun no se han introducido ninguna temperatura");
        } else {
            for (int i = 0; i < NUM_SEMANAS; i++) {
                System.out.println("Semana " + (i+1));
                for (int j = 0; j < NUM_DIAS_SEMANA; j++) {
                    System.out.println(vDiasSemana[j] + " - " + lista.get(i).get(j) + " grados");
                }
                System.out.println(" --------- ");
            }
        }
    }
    
    public static void mostrarTemperaturaMedia(ArrayList<ArrayList<Integer>> lista) {
        System.out.println("");
        
        if (lista.isEmpty()) {
            System.out.println("Aun no se han introducido ninguna temperatura");
        } else {
            float suma = 0;
            for (int i = 0; i < NUM_SEMANAS; i++) {
                for (int j = 0; j < NUM_DIAS_SEMANA; j++) {
                    suma += lista.get(i).get(i);
                }
            }
            System.out.println("Media mes: " + (suma / (NUM_SEMANAS * NUM_DIAS_SEMANA)));
        }
    }
    
    public static void mostrarDiasMasCalurosos(ArrayList<ArrayList<Integer>> lista, String[] vDiasSemana) {
        System.out.println("");
        
        if (lista.isEmpty()) {
            System.out.println("Aun no se han introducido ninguna temperatura");
        } else {
           ArrayList<Integer> listaTemperaturas = lista.get(0);
            int max = listaTemperaturas.get(0);

            for(int i = 0; i < lista.size(); i++) {
                for(int j = 0; j < lista.get(i).size(); j++) {
                    int temp = lista.get(i).get(j);
                    if(temp > max) {
                        max = temp;
                    }
                }
            }
            System.out.println("El dia o dias mas calurosos fueron: " + max + "C");
            
            for(int i = 0; i < lista.size(); i++) {
                for(int j = 0; j < lista.get(i).size(); j++) {
                    if(lista.get(i).get(j) == max) {
                        System.out.println(" - " + vDiasSemana[j] + " de la semana " + (i+1));
                    }
                }
            }
        }
    }
}