package ejercicio15repaso14tema10;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio15Repaso14Tema10 {

    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList<>();
        String[] nombresAsig = {"Lengua", "Mates", "FyQ"};
        
        int opcion = 0;
        
        do {
            mostrarMenu();
            opcion = pedirOpcion();
            switch (opcion) {
                case 1 -> insertarAlumno(alumnos, nombresAsig);
                case 2 -> mostrarAlumnos(alumnos);
                case 3 -> mejorAlumno(alumnos);
                case 4 -> asignaturaMasDificil(alumnos, nombresAsig);
                case 5 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion no valida, intentelo de nuevo");
            }
        } while (opcion != 5);
    }
    
    public static void mostrarMenu() {
        System.out.println("\n--MENU--");
        System.out.println("1. Introducir un nuevo alumno");
        System.out.println("2. Mostrar alumnos y notas");
        System.out.println("3. Mejor alumno de la clase");
        System.out.println("4. Asignatura mas dificl");
        System.out.println("5. Salir del programa");
        System.out.print("Introduce una opcion: ");
    }
    
    public static void insertarAlumno(ArrayList<Alumno> alumnos, String[] nombresAsig) {
        System.out.println("");
        
        Alumno alu = new Alumno(pedirNombre());
        alu.rellenarNotas(nombresAsig);
        alumnos.add(alu);
        System.out.println("Alumno creado correctamente");
    }
    
    public static void mostrarAlumnos(ArrayList<Alumno> alumnos) {
        System.out.println("");
        
        if(alumnos.isEmpty()) {
            System.out.println("No hay alumnos registrados");
        } else {
            System.out.println("--LISTA DE ALUMNO--");
            for(Alumno alum : alumnos) {
                alum.mostrarNotas();
                System.out.println();
            }
        }
    }
    
    public static void mejorAlumno(ArrayList<Alumno> alumnos) {
        System.out.println("");
        
        if(alumnos.isEmpty()) {
            System.out.println("No hay alumnos registrados");
        } else {
            Alumno mejorAlumno = alumnos.get(0);
            for(Alumno alum : alumnos) {
                if(alum.calcularMedia() > mejorAlumno.calcularMedia()) {
                    mejorAlumno = alum;
                }
            }
            System.out.println("El mejor alumno es: " + mejorAlumno.getNombreAlumno() + " con media " + mejorAlumno.calcularMedia());
        }
    }
    
    public static void asignaturaMasDificil(ArrayList<Alumno> alumnos, String[] nombresAsig) {
        System.out.println("");
        int asigMasDificil = 0;
        float suma, menorNotaAsignatura = 999;
        
            for(int j = 0;j < nombresAsig.length;j++){
                suma = 0;
                for(int i = 0;i < alumnos.size();i++){
                    suma = suma + alumnos.get(i).getNotaPorPosicion(j);
                }
                if(suma < menorNotaAsignatura){
                    menorNotaAsignatura = suma;
                    asigMasDificil = j;
                }
            }
            System.out.println("La asignatura mas dificil es " + nombresAsig[asigMasDificil]);
    }
    
    
    public static int pedirOpcion() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre alumno: ");
        return entrada.nextLine();
    }
}