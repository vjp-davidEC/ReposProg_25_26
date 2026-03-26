/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11tema11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
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
        //Conjunto de alumnos
        Set<Alumno> alumnos = new TreeSet<>();

        int opcion;

        do {
            mostrarMenu();
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1 ->
                    aniadirAlumnos(alumnos);
                case 2 ->
                    mostrarAlumnosPorExpediente(alumnos);
                case 3 ->
                    buscarPorExpediente(alumnos);
                case 4 ->
                    mostrarAlumnosPorNota(alumnos);
                case 5 ->
                    System.out.println("Saliendo del programa");
                default ->
                    System.out.println("Opcion no valida, intentelo de nuevo");
            }
        } while (opcion != 5);
    }

    //Metodo que muestra el menu por pantalla
    public static void mostrarMenu() {
        System.out.println("\n--MENU--");
        System.out.println("1. ANIADIR ALUMNO");
        System.out.println("2. MOSTRAR ALUMNOS ORDENADOS POR EXPEDIENTE");
        System.out.println("3. BUSCAR POR NUMERO DE EXPEDIENTE");
        System.out.println("4. MOSTRAR ALUMNOS POR NOTA");
        System.out.println("5. SALIR DEL PROGRAMA");
        System.out.print("INTRODUCE UNA OPCION: ");
    }

    //Metodo que añade un alumno al conjunto
    public static void aniadirAlumnos(Set<Alumno> alumnos) {
        System.out.println();

        System.out.println("Aniadiendo alumno...");
        String dni = pedirDni();
        int expediente = pedirExpediente();
        float media = pedirMedia();

        //Se añade el alumno al HashSet
        alumnos.add(new Alumno(dni, expediente, media));
    }

    //Metodo que muestra los alumnos ordenados por numero de expediente
    public static void mostrarAlumnosPorExpediente(Set<Alumno> alumnos) {
        System.out.println();

        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos registrados");
        } else {
            //Se pasa el Set a una lista para poder ordenarlas
            List<Alumno> lAlumnos = new ArrayList<>(alumnos);
            //Se define con el compareTo() de la clase Alumno
            Collections.sort(lAlumnos);

            System.out.println("--ALUMNOS ORDENADOS POR EXPEDIENTE--");
            for (Alumno alum : lAlumnos) {
                System.out.println(alum.toString());
                System.out.println();
            }
        }
    }

    //Metodo que busca un alumno por su numero de expediente
    public static void buscarPorExpediente(Set<Alumno> alumnos) {
        System.out.println();
        Scanner entrada = new Scanner(System.in);

        System.out.print("Numero de expediente a buscar: ");
        int buscarExpediente = entrada.nextInt();

        boolean encontrado = false;

        //Se crea un iterador para recorrer el Set
        Iterator<Alumno> it = alumnos.iterator();

        //Se recorre el Set buscando coincidencias
        while (it.hasNext() && !encontrado) {
            Alumno alum = it.next();

            if (alum.getNumeroExpediente() == buscarExpediente) {
                System.out.println("Alumno encontrado y es");
                System.out.println("DNI: " + alum.getDni());
                System.out.println("Nota media: " + alum.getNotaMedia());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No existe ningun alumno con ese numero de expediente");
        }
    }

    //Metodo que muestra los alumnos ordenados por su nota
    public static void mostrarAlumnosPorNota(Set<Alumno> alumnos) {
        System.out.println();

        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos registrados");
        } else {
            //Se ordena automaticamente las notas de menor a mayor
            TreeSet<Float> ordenar = new TreeSet<>();

            //Se guarda todas las notas en el TreeSet
            for (Alumno alumno : alumnos) {
                ordenar.add(alumno.getNotaMedia());
            }
            System.out.println("--ALUMNOS ORDENADOS POR NOTA--");
            //Se recorre las notas ordenadas
            for (Float nota : ordenar) {
                //Se busca que alumno tiene esa nota
                for (Alumno a : alumnos) {
                    if (a.getNotaMedia() == nota) {
                        System.out.println(a.toString());
                        System.out.println();
                    }
                }
            }
        }
    }

    //Metodos que pide informacion al usuario de lo que sea
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