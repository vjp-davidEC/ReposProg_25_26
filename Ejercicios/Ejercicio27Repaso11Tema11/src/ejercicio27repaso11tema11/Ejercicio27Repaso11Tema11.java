package ejercicio27repaso11tema11;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio27Repaso11Tema11 {

    public static void main(String[] args) {
        Set<Alumno> alumnos = new TreeSet<>();

        int opcion;

        do {
            mostrarMenu();
            opcion = pedirOpcion();
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
    
    public static void aniadirAlumnos(Set<Alumno> alumnos) {
        System.out.println("");
        
        System.out.println("Aniandiendo alumno...");
        alumnos.add(new Alumno(pedirDni(), pedirExpediente(), pedirMedia()));
    }
    
    public static void mostrarAlumnosPorExpediente(Set<Alumno> alumnos) {
        System.out.println("");
        
        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos registrados");
        } else {
            for (Alumno alum : alumnos) {
                System.out.println(alum.toString());
            }
        }
    }
    
    public static void buscarPorExpediente(Set<Alumno> alumnos) {
        System.out.println("");
        
        System.out.println("Numero de expediente a buscar");
        int buscarExpediente = pedirExpediente();
        
        boolean encontrado = false;
        Iterator<Alumno> it = alumnos.iterator();
        
        while (it.hasNext() && !encontrado) {
            Alumno alum = it.next();
            if (alum.getNumeroExpediente() == buscarExpediente) {
                encontrado = true;
                System.out.println("DNI: " + alum.getDni() + "\nNota media: " + alum.getNotaMedia());
            }
        }
    }
    
    public static void mostrarAlumnosPorNota(Set<Alumno> alumnos) {
        System.out.println("");
        
        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos registrados");
        } else {
            for (Alumno alum : alumnos) {
                System.out.println("La nota media del DNI " + alum.getDni() + " es " + alum.getNotaMedia());
            }
        }
    }
    
    //Metodos que pide informacion al usuario de lo que sea
    public static int pedirOpcion() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
    public static String pedirDni() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("DNI: ");
        return entrada.nextLine();
    }
    public static int pedirExpediente() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Numero del expediente: ");
        return entrada.nextInt();
    }
    public static float pedirMedia() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nota media: ");
        float nota = entrada.nextFloat();
        return nota;
    }
}