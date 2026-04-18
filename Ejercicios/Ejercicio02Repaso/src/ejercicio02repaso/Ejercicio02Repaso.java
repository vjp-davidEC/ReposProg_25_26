package ejercicio02repaso;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio02Repaso {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();
        
        System.out.println("Introduce los datos de los alumnos");
        for (int i = 0; i < 3; i++) {
            String nombre = pedirNombre();
            Double nota = pedirNota();
            listaAlumnos.add(new Alumno(nombre, nota));
        }
        
        System.out.println("");
        if (listaAlumnos.isEmpty()) {
            System.out.println("No hay ningun alumno en la lista");
        } else {
            for (Alumno alumno : listaAlumnos) {
                if (alumno.getNota() >= 5) {
                    System.out.println(alumno.toString());
                }
            }
        }
        
        System.out.println("");
        System.out.print("Introduce el nombre del alumno para cambiar su nota: ");
        String nombre = entrada.nextLine();
        
        boolean encontrado = false;
        int i = 0;
        
        while (i < listaAlumnos.size() && !encontrado) {
            if (listaAlumnos.get(i).getNombre().equalsIgnoreCase(nombre)) {
                listaAlumnos.get(i).setNota(pedirNota());
                encontrado = true;
            }
            i++;
        }
        if (!encontrado) {
            System.out.println("No hay nota con este alumno");
        }
        
        System.out.println("");
        for (Alumno alumno : listaAlumnos) {
            System.out.println(alumno.toString());
        }
    }
    
    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre del alumno: ");
        String nombre = entrada.nextLine();
        return nombre;
    }
    public static double pedirNota() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nota del alumno: ");
        double nota = entrada.nextDouble();
        return nota;
    }
}