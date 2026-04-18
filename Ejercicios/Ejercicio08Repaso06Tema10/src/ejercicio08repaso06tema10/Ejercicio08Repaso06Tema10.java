package ejercicio08repaso06tema10;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio08Repaso06Tema10 {

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        String[] vMeses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        
        int opcion = 0;
        
        do {
            try {
                mostrarMenu();
                opcion = pedirInt();
                switch (opcion) {
                    case 1 -> rellenarLista(lista, vMeses);
                    case 2 -> mostrarLista(lista, vMeses);
                    case 3 -> mostrarListaAlReves(lista, vMeses);
                    case 4 -> mostrarTotalVentas(lista);
                    case 5 -> mostrarTotalVentasMesesA(lista, vMeses);
                    case 6 -> mostrarMejoresMeses(lista, vMeses);
                    case 7 -> System.out.println("Saliendo del programa...");
                    default -> System.out.println("Opcion no valida, intentalo de nuevo");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Introduce un numero");
            }
        } while (opcion != 7);
    }
    
    public static void mostrarMenu(){
        System.out.println("\n--MENU--");
        System.out.println("1. Introducir ventas de los 12 meses");
        System.out.println("2. Mostrar ventas");
        System.out.println("3. Mostrar ventas al reves");
        System.out.println("4. Mostrar suma total de las ventas");
        System.out.println("5. Mostrar ventas totales de los meses con 'a'");
        System.out.println("6. Mostras mes o meses con mas ventas");
        System.out.println("7. Salir del programa");
        System.out.print("Introduce una opcion: ");
    }
    
    public static void rellenarLista(ArrayList<Integer> lista, String[] vMeses) {
        System.out.println("");
        for (String mes : vMeses) {
            System.out.print("Ventas " + mes + ": ");
            lista.add(pedirInt());
        }
    }
    
    public static void mostrarLista(ArrayList<Integer> lista, String[] vMeses) {
        System.out.println("");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Ventas de " + vMeses[i] + ": " + lista.get(i));
        }
    }
    
    public static void mostrarListaAlReves(ArrayList<Integer> lista, String[] vMeses) {
        System.out.println("");
        for (int i = lista.size() - 1; i >= 0; i--) {
            System.out.println("Ventas de " + vMeses[i] + ": " + lista.get(i));
        }
    }
    
    public static void mostrarTotalVentas(ArrayList<Integer> lista) {
        System.out.println("");
        int total = 0;
        for (Integer list : lista) {
            total += list;
        }
        System.out.println("Total de ventas: " + total);
    }
    
    public static void mostrarTotalVentasMesesA(ArrayList<Integer> lista, String[] vMeses) {
        System.out.println("");
        int suma = 0;
        for (Integer list : lista) {
            if ((vMeses[list].toLowerCase().indexOf('a') >= 0)) {
                suma += list;
            }
        }
        System.out.println("Total de ventas de meses con A: " + suma);
    }
    
    public static void mostrarMejoresMeses(ArrayList<Integer> lista, String[] vMeses) {
        System.out.println("");
        int num, mayor = 0;
        for (Integer list : lista) {
            num = list;
            if (num > mayor) {
                mayor = num;
            }
        }
        
        System.out.println("Los mejores meses son: ");
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) == mayor) {
                System.out.println("-- " + vMeses[i] + " con " + mayor + " ventas --");
            }
        }
    }
    
    
    public static int pedirInt() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
}