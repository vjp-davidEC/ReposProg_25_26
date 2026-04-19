package ejercicio03;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio03 {
    
    public static final int ALUMNOS = 5;

    public static void main(String[] args) {
        HashMap<String, Alumno> mapaAlumno = new HashMap<>();
        aniadirAlumnos(mapaAlumno);
        mostrarMapa(mapaAlumno);
        buscarAlumno(mapaAlumno);
        modificarNota(mapaAlumno);
        eliminarAlumno(mapaAlumno);
        mostrarMapaFinal(mapaAlumno);
    }
    
    public static void aniadirAlumnos(HashMap<String, Alumno> mapaAlumno) {
        for (int i = 0; i < ALUMNOS; i++) {
            mapaAlumno.put(pedirNombre(), new Alumno(pedirNombre(), pedirNota()));
            System.out.println("---");
        }
    }
    
    public static void mostrarMapa(HashMap<String, Alumno> mapaAlumno) {
        System.out.println("");
        
        if (mapaAlumno.isEmpty()) {
            System.out.println("No hay nada en el mapa");
        } else {
            for (String key : mapaAlumno.keySet()) {
                Alumno alum = mapaAlumno.get(key);
                System.out.println(alum.toString());
            }
        }
    }
    
    public static void buscarAlumno(HashMap<String, Alumno> mapaAlumno) {
        System.out.println("");
        
        if (mapaAlumno.isEmpty()) {
            System.out.println("No hay nadie en el mapa");
        } else {
            System.out.println("Introduce el alumno a que deseas buscar");
            String nombre = pedirNombre();
        
            if (mapaAlumno.containsKey(nombre)) {
                System.out.println("La nota de " + nombre + " es " + mapaAlumno.get(nombre).getNota());
            } else {
                System.out.println("No hay ningun alumno con ese nombre");
            }
        }
    }
    
    public static void modificarNota(HashMap<String, Alumno> mapaAlumno) {
        System.out.println("");
        
        if (mapaAlumno.isEmpty()) {
            System.out.println("No hay nadie en el mapa");
        } else {
            System.out.println("Introduce el nombre para modificar su nota");
            String nombre = pedirNombre();
            
            if (mapaAlumno.containsKey(nombre)) {
                mapaAlumno.get(nombre).setNota(pedirNota());
                System.out.println("La nota de " + nombre + " ahora es " + mapaAlumno.get(nombre).getNota());
            } else {
                System.out.println("No hay ninguna nota con ese nombre");
            }
        }
    }
    
    public static void eliminarAlumno(HashMap<String, Alumno> mapaAlumno) {
        System.out.println("");
        
        if (mapaAlumno.isEmpty()) {
            System.out.println("No hay nadie en el mapa");
        } else {
            System.out.println("Introduce el nombre a eliminar");
            String nombre = pedirNombre();
            
            if (mapaAlumno.containsKey(nombre)) {
                mapaAlumno.remove(nombre);
            } else {
                System.out.println("No hay nadie con ese nombre para eliminar");
            }
        }
    }
    
    public static void mostrarMapaFinal(HashMap<String, Alumno> mapaAlumno) {
        System.out.println("");
        
        if (mapaAlumno.isEmpty()) {
            System.out.println("No hay nadie en el mapa");
        } else {
            for (String key : mapaAlumno.keySet()) {
                Alumno alum = mapaAlumno.get(key);
                System.out.println(alum.toString());
            }
        }
    }
    
    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre del alumno: ");
        return entrada.nextLine();
    }
    public static double pedirNota() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nota del alumno: ");
        return entrada.nextDouble();
    }
}