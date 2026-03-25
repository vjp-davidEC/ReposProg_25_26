/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11tema11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

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

        int opcion;

        do {
            mostrarMenu();
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1 -> aniadirAlumnos(alumnos);
                case 2 -> mostrarAlumnosPorExpediente(alumnos);
                case 3 -> buscarPorExpediente(alumnos);
                case 4 -> mostrarAlumnosPorNota(alumnos);
                case 5 -> System.out.println("Saliendo del programa");
                default -> System.out.println("Opcion no valida, intentelo de nuevo");
            }
        } while (opcion != 5);
    }

    //
    public static void mostrarMenu() {
        System.out.println("\n--MENU--");
        System.out.println("1. ANIADIR ALUMNO");
        System.out.println("2. MOSTRAR ALUMNOS ORDENADOS POR EXPEDIENTE");
        System.out.println("3. BUSCAR POR NUMERO DE EXPEDIENTE");
        System.out.println("4. MOSTRAR ALUMNOS POR NOTA");
        System.out.println("5. SALIR DEL PROGRAMA");
        System.out.print("INTRODUCE UNA OPCION: ");
    }

    //
    public static void aniadirAlumnos(Set<Alumno> alumnos) {
        System.out.println();
        
        System.out.println("Aniadiendo alumno...");
        String dni = pedirDni();
        int expediente = pedirExpediente();
        float media = pedirMedia();
        
        alumnos.add(new Alumno(dni, expediente, media));
    }

    //
    public static void mostrarAlumnosPorExpediente(Set<Alumno> alumnos) {
        System.out.println();

        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos registrados");
        } else {
            List<Alumno> lAlumnos = new ArrayList<>(alumnos);
            Collections.sort(lAlumnos);
            
            System.out.println("--ALUMNOS ORDENADOS POR EXPEDIENTE--");
            for (Alumno alum : lAlumnos) {
                System.out.println(alum.toString());
                System.out.println();
            }
        }
    }

    //
    public static void buscarPorExpediente(Set<Alumno> alumnos) {
        System.out.println();
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Numero de expediente a buscar: ");
        int buscarExpediente = entrada.nextInt();
        
        boolean encontrado = false;
        
        for (Alumno alum: alumnos) {
            if (alum.getNumeroExpediente() == buscarExpediente) {
                System.out.println("Alumno encontrado y es" + "\nDNI: " + alum.getDni() + "\nNota media: " + alum.getNotaMedia());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No existe ningun alumno con ese numero de expediente");
        }
    }

    //
    public static void mostrarAlumnosPorNota(Set<Alumno> alumnos) {
        System.out.println();

        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos registrados");
        } else {
            TreeSet<Float> ordenar = new TreeSet<>();
            
            for (Alumno alumno : alumnos) {
                ordenar.add(alumno.getNotaMedia());
            }
            System.out.println("--ALUMNOS ORDENADOS POR NOTA--");
            for (Float nota : ordenar) {
                for (Alumno a : alumnos) {
                    if (a.getNotaMedia() == nota) {
                        System.out.println(a.toString());
                        System.out.println();
                    }
                }
            }
        }
    }
    
    
    //
    public static String pedirDni() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("DNI: ");
        String dni = entrada.nextLine();
        return dni;
    }
    public static int pedirExpediente() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Numero del expediente: ");
        int expediente = entrada.nextInt();
        return expediente;
    }
    public static float pedirMedia() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nota media: ");
        float media = entrada.nextFloat();
        return media;
    }
}