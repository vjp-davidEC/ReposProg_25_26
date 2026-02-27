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
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Dia> temperaturas = new ArrayList<>();
        
        String[] diaSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        
        int opcion;
        
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
    
    //
    public static void mostrarMenu() {
        System.out.println("\n--MENU--");
        System.out.println("1. Rellenar las temperaturas");
        System.out.println("2. Mostrar las temperaturas");
        System.out.println("3. Mostrar la temperatura media del mes");
        System.out.println("4. Dia/Dias mas calurosos del mes");
        System.out.println("5. Salir del programa");
        System.out.print("Introduce una opcion: ");
    }
    
    //
    public static void rellenarTemperaturas(ArrayList<Dia> lista, String[] diaSemana) {
        
    }
    
    //
    public static void mostrarTemperaturas(ArrayList<Dia> lista, String[] diaSemana) {
        
    }
    
    //
    public static void temperaturaMedia(ArrayList<Dia> lista) {
        
    }
    
    //
    public static void diaMasCaluroso(ArrayList<Dia> lista, String[] diaSemana) {
        
    }
}