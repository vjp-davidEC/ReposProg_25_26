/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14tema10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio14Tema10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String[] asignaturas = {"Lengua", "Mates", "Fisica"};
        
        ArrayList<Integer> clase = new ArrayList<>();
        
        int opcion;
        
        do{
            mostrarMenu();
            opcion = entrada.nextInt();
            switch(opcion){
                case 1 -> rellenarAlumno();
                case 2 -> mostrarAlumno();
                case 3 -> mejorAlumno();
                case 4 -> asignaturaDificil();
                case 5 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion no valida, intentalo de nuevo");
            }
        }while(opcion != 5);
    }
    
    public static void mostrarMenu() {
        System.out.println("\n--MENU--");
        System.out.println("1. ");
        System.out.println("2. ");
        System.out.println("3. ");
        System.out.println("4. ");
        System.out.println("5. ");
        System.out.print("Introduce una opcion: ");
    }
    
    public static void rellenarAlumno() {
        
    }
    
    public static void mostrarAlumno() {
        
    }
    
    public static void mejorAlumno() {
        
    }
    
    public static void asignaturaDificil() {
        
    }
}
