/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio09tema10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio09Tema10 {

    /**
     * @param args the command line arguments
     */
    //Constante con el numero total de dias del mes
    public static final int POS = 31;
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Lista donde se guarda las 31 temperaturas del mes
        ArrayList<Dia> temperaturas = new ArrayList<>();
        
        //Array con los nombres de los dias de la semana
        String[] diaSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        
        int opcion;
        
        //Bucle principal del menu
        do {
            mostrarMenu();
            opcion = entrada.nextInt();
            switch(opcion){
                case 1 -> rellenarTemperaturas(temperaturas, diaSemana);
                case 2 -> mostrarTemperaturas(temperaturas, diaSemana);
                case 3 -> temperaturaMedia(temperaturas);
                case 4 -> diaMasCaluroso(temperaturas, diaSemana);
                case 5 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion no valida. Intentalo de nuevo");
            }
        }while(opcion != 5);
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
    
    //Metodo que rellena las temperaturas aleatoriamente
    public static void rellenarTemperaturas(ArrayList<Dia> lista, String[] diaSemana) {
        int diaInicial = (int)(Math.random()* 7);
        
        for(int i = 0; i < POS; i++) {
            int temperatura = (int)(Math.random() * 41);
            //Se crea un nuevo objeto Dia con nombre y temperatura
            lista.add(new Dia(diaSemana[diaInicial], temperatura));
            diaInicial++;
            if(diaInicial == 7) {
                diaInicial = 0;
            }
        }
    }
    
    //Metodo que muestra todas las temperaturas del mes con su dia correspondiente
    public static void mostrarTemperaturas(ArrayList<Dia> lista, String[] diaSemana) {
        System.out.println();
        if(lista.isEmpty()) {
            System.out.println("Aun no se han generado temperaturas");
        } else {
            System.out.println("--TEMPERATURAS--");
            for(int i = 0; i < lista.size(); i++) {
                System.out.println(lista.get(i).getNombreDia() + " " + (i+1) + ": " + lista.get(i).getTemperatura() + "C");
            }
        }
    }
    
    //Metodo que calcula la temperatura media del mes
    public static void temperaturaMedia(ArrayList<Dia> lista) {
        System.out.println();
        if(lista.isEmpty()) {
            System.out.println("Aun no se han generado temperaturas");
        } else {
            int suma = 0;
            for(int i = 0; i < lista.size(); i++) {
                suma += lista.get(i).getTemperatura();
            }
            
            float media = (float)suma / lista.size();
            System.out.println("Temperatura media del mes: " + media + "C");
        }
    }
    
    //Metodo que busca la temperatura maxima del mes
    public static void diaMasCaluroso(ArrayList<Dia> lista, String[] diaSemana) {
        System.out.println();
        if(lista.isEmpty()) {
            System.out.println("Aun no se han generado temperaturas");
        } else {
            int max = lista.get(0).getTemperatura();
            
            for(int i = 0; i < lista.size(); i++) {
                if(lista.get(i).getTemperatura() > max) {
                    max = lista.get(i).getTemperatura();
                }
            }
            
            System.out.println("El dia o dias mas calurosos fueron: " + max + "C");
            
            for(int i = 0; i < lista.size(); i++) {
                if(lista.get(i).getTemperatura() == max) {
                    System.out.println(" - " + lista.get(i).getNombreDia() + " dia " + (i+1));
                }
            }
        }
    }
}