/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07tema10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio07Tema10 {

    /**
     * @param args the command line arguments
     */
    //Constante con el numero de semanas
    public static final int SEMANA = 4;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Lista de lista donde se guarda las temperaturas del mes
        ArrayList<ArrayList<Integer>> temperaturas = new ArrayList<>();

        //Array con los nombres de los dias de la semana
        String[] diaSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};

        int opcion;

        //Bucle principal del menu
        do {
            mostrarMenu();
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1 -> rellenarTemperaturas(temperaturas, diaSemana);
                case 2 -> mostrarTemperaturas(temperaturas, diaSemana);
                case 3 -> temperaturaMedia(temperaturas, diaSemana);
                case 4 -> diaMasCaluroso(temperaturas, diaSemana);
                case 5 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion no valida. Intentalo de nuevo");
            }
        } while (opcion != 5);
    }

    //Metodo que muestra el menu de opciones
    public static void mostrarMenu() {
        System.out.println("\n--MENU--");
        System.out.println("1. Rellenar las temperaturas");
        System.out.println("2. Mostrar las temperaturas");
        System.out.println("3. Mostrar la temperatura media del mes");
        System.out.println("4. Dia/Dias mas calurosos del mes");
        System.out.println("5. Salir del programa");
        System.out.print("Introduce una opcion: ");
    }

    //Metodo que rellena la lista de temperaturas introducidas por el usuario
    public static void rellenarTemperaturas(ArrayList<ArrayList<Integer>> lista, String[] diaSemana) {
        Scanner entrada = new Scanner(System.in);
        System.out.println();
        lista.clear();//Para limpiar por si tiene que empezar de nuevo o ya tenia datos
        System.out.println("Introduce las temperaturas");
        for (int i = 0; i < SEMANA; i++) {
            lista.add(new ArrayList<>());//Se añade una nueva semana
            System.out.println("-Semana " + (i + 1) + "-");

            for (int j = 0; j < diaSemana.length; j++) {
                System.out.print("  " + diaSemana[j] + ": ");
                int temp = entrada.nextInt();
                lista.get(i).add(temp);//Se guarda la temperatura en la semana correspondiente
            }
        }
    }

    //Metodo que muestra las temperaturas del mes organizadas por semana
    public static void mostrarTemperaturas(ArrayList<ArrayList<Integer>> lista, String[] diaSemana) {
        System.out.println();
        if (lista.isEmpty()) {
            System.out.println("Aun no se han introducido ninguna temperatura");
        } else {
            System.out.println("--Temperaturas del mes--");
            for (int i = 0; i < lista.size(); i++) {
                System.out.println("Semana " + (i + 1) + ":");

                for (int j = 0; j < lista.get(i).size(); j++) {
                    System.out.println(" - " + diaSemana[j] + ": " + lista.get(i).get(j) + "C");
                }
            }
        }
    }

    //Metod que calcula la temperatura media del mes
    public static void temperaturaMedia(ArrayList<ArrayList<Integer>> lista, String[] diaSemana) {
        System.out.println();
        if (lista.isEmpty()) {
            System.out.println("Aun no se han introducido ninguna temperatura");
        } else {
            int suma = 0;
            int totalDias = diaSemana.length * SEMANA;

            for (int i = 0; i < lista.size(); i++) {
                for (int j = 0; j < lista.get(i).size(); j++) {
                    suma += lista.get(i).get(j);
                }
            }

            float media = (float) suma / totalDias;
            System.out.println("Temperatura media del mes: " + media + "C");
        }
    }

    //Metodo que busca la temperatura maxima del mes
    public static void diaMasCaluroso(ArrayList<ArrayList<Integer>> lista, String[] diaSemana) {
        System.out.println();
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
                        System.out.println(" - " + diaSemana[j] + " de la semana " + (i+1));
                    }
                }
            }
        }
    }
}
