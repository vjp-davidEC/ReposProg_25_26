/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio09tema8;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio09Tema8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //
        String[] alumnos = {"Pepe", "Juan", "Marta"};
        String[] asignaturas = {"Lengua", "Mates", "Historia", "Fisica"};
        
        //
        Alumno[] alu = new Alumno[3];
        Asignatura[] asig = new Asignatura[4];
        
        int opcion;
        
        do{
            mostrarMenu();
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1 -> rellenarNotas();
                case 2 -> mostrarNotas();
                case 3 -> alumnoMejor();
                case 4 -> alumnoSuspensos();
                case 5 -> asignaturaDificil();
                case 6 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion no valida. Intentalo de nuevo");
            }
        }while(opcion != 6);
    }
    
    //
    public static void mostrarMenu(){
        System.out.println("--MENU--");
        System.out.println("1. Rellenar las notas de los alumnos");
        System.out.println("2. Mostrar las notas introducidas de los alumnos");
        System.out.println("3. Alumno mejor de la clase");
        System.out.println("4. Alumno con mas suspensos");
        System.out.println("5. Asignatura mas dificil");
        System.out.println("6. Salir del programa");
        System.out.print("Introduce una opcion: ");
    }
    
    //
    public static void rellenarNotas(){
        
    }
    
    //
    public static void mostrarNotas(){
        
    }
    
    //
    public static void alumnoMejor(){
        
    }
    
    //
    public static void alumnoSuspensos(){
        
    }
    
    //
    public static void asignaturaDificil(){
        
    }
}