/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13y14tema8;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio13y14Tema8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        
        Alumno alumno1 = new Alumno();
        alumno1.setNombre("David");
        alumno1.setEdad(15);
        alumno1.setNotaMedia(6.5f);
        
        Alumno alumno2 = new Alumno("Pedro", 12, 7.8f);
        
        System.out.println("--ALUMNO-1--");
        System.out.println(alumno1.toString());
        System.out.println("--ALUMNO-2--");
        System.out.println(alumno2.toString());
        
        Alumno[] alu = new Alumno[5];
        int opcion;
        
        do{
            mostrarMenu();
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1 -> rellenarAlumnos();
                case 2 -> mostrarAlumnos();
                case 3 -> mostrarAlumnosMediaEncima();
                case 4 -> mostrarAlumnosMediaSuspensa();
                case 5 -> buscarAlumnos();
                case 6 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion no valida, intentalo de nuevo");
            }
        }while (opcion != 6);
    }
    
    //
    public static void mostrarMenu(){
        System.out.println("--MENU--");
        System.out.println("1. Rellenar un alumno");
        System.out.println("2. Mostrar vector del alumno");
        System.out.println("3. Mostrar alumnos con nota media por encima de una nota dada");
        System.out.println("4. Mostrar cuantos alumnos hay con la nota media suspensa");
        System.out.println("5. Buscar alumnos");
        System.out.println("6. Salir del programa");
        System.out.print("Introduce una opcion: ");
    }
    
    //
    public static void rellenarAlumnos(){
        
    }
    
    //
    public static void mostrarAlumnos(){
        
    }
    
    //
    public static void mostrarAlumnosMediaEncima(){
        
    }
    
    //
    public static void mostrarAlumnosMediaSuspensa(){
        
    }
    
    //
    public static void buscarAlumnos(){
        
    }
}