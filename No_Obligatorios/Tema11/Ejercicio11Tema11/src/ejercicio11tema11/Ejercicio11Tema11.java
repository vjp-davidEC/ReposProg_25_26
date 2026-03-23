/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11tema11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author alumno
 */
public class Ejercicio11Tema11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Set<Alumno> alumnos = new HashSet<>();
        HashSet<Alumno> ordenar = new HashSet<>();
        
        int opcion;
        
        do {
            mostrarMenu();
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1 -> aniadirAlumnos();
                case 2 -> mostrarAlumnosPorExpediente(ordenar);
                case 3 -> buscarPorExpediente();
                case 4 -> mostrarAlumnosPorNota();
                case 5 -> System.out.println("Saliendo del programa");
                default -> System.out.println("Opcion no valida, intentelo de nuevo");
            }
        } while (opcion != 5);
    }
    
    //
    public static void mostrarMenu() {
        System.out.println("\n--MENU--");
        System.out.println("1. Aniadir alumno");
        System.out.println("2. Mostrar alumnos ordenados por expediente");
        System.out.println("3. Buscar por numero de expediente");
        System.out.println("4. Mostrar alumnos por nota");
        System.out.println("5. Salir del programa");
        System.out.print("Introduce una opcion: ");
    }
    
    //
    public static void aniadirAlumnos() {
        
    }
    
    //
    public static void mostrarAlumnosPorExpediente(HashSet<Alumno> ordenar) {
        List<Alumno> lAlumnos = new ArrayList<>(ordenar);
        Collection.sort(lAlumnos);
    }
    
    //
    public static void buscarPorExpediente() {
        
    }
    
    //
    public static void mostrarAlumnosPorNota() {
        
    }
}
