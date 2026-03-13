/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioampliacioni10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioAmpliacionI10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        ArrayList<Vivienda> listaVivienda = new ArrayList<>();
        
        int opcion;
        
        do {
            mostrarMenu();
            opcion = entrada.nextInt();
            switch(opcion) {
                case 1 -> aniadirActividad(listaVivienda);
                case 2 -> mostrarActividades(listaVivienda);
                case 3 -> mostrarActividadesFamilia(listaVivienda);
                case 4 -> mostrarActividadesTipo(listaVivienda);
                case 5 -> mostrarNumeroActividades(listaVivienda);
                case 6 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion no valida, intentalo de nuevo");
            }
        } while(opcion != 6);
    }
    
    //
    public static void mostrarMenu() {
        System.out.println("\n--MENU--");
        System.out.println("1. Aniadir actividad");
        System.out.println("2. Mostrar actividades");
        System.out.println("3. Mostrar actividades para toda la familia");
        System.out.println("4. Mostrar actividades por tipo");
        System.out.println("5. Mostrar numero de actividades");
        System.out.print("Introduce una opcion: ");
    }
    
    //
    public static void aniadirActividad(ArrayList<Vivienda> lVivienda) {
        
    }
    
    //
    public static void mostrarActividades(ArrayList<Vivienda> lVivienda) {
        
    }
    
    //
    public static void mostrarActividadesFamilia(ArrayList<Vivienda> lVivienda) {
        
    }
    
    //
    public static void mostrarActividadesTipo(ArrayList<Vivienda> lVivienda) {
        
    }
    
    //
    public static void mostrarNumeroActividades(ArrayList<Vivienda> lVivienda) {
        
    }
}