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
        
        //Arrays con los nombres de las asignaturas
        String[] asig = {"Lengua", "Mates", "Fisica"};
        
        //Lista donde se guarda los alumnos creados
        ArrayList<Alumno> claseAlumno = new ArrayList<>();
        
        int opcion;
        
        do{
            mostrarMenu();
            opcion = entrada.nextInt();
            switch(opcion){//Selección de la acción según la opción elegida
                case 1 -> rellenarAlumno(claseAlumno, asig);
                case 2 -> mostrarAlumno(claseAlumno);
                case 3 -> mejorAlumno(claseAlumno);
                case 4 -> asignaturaMasDificil(claseAlumno, asig);
                case 5 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion no valida, intentalo de nuevo");
            }
        }while(opcion != 5);
    }
    
    //Metodo que muestra el menu por pantalla
    public static void mostrarMenu() {
        System.out.println("\n--MENU--");
        System.out.println("1. Introducir un nuevo alumno");
        System.out.println("2. Mostrar alumnos y notas");
        System.out.println("3. Mejor alumno de la clase");
        System.out.println("4. Asignatura mas dificl");
        System.out.println("5. Salir del programa");
        System.out.print("Introduce una opcion: ");
    }
    
    public static void rellenarAlumno(ArrayList<Alumno> claseAlumno, String[] asig) {
        System.out.println("");
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduce el nombre del alumno: ");
        String nombre = entrada.nextLine();
        
        Alumno alu = new Alumno(nombre);
        alu.rellenarNotas(asig);
        claseAlumno.add(alu);
        System.out.println("Alumno creado correctamente");
    }
    
    //Metodo que muestra todos los alumnos registrados con sus notas
    public static void mostrarAlumno(ArrayList<Alumno> claseAlumno) {
        System.out.println("");
        if(claseAlumno.isEmpty()) {
            System.out.println("No hay alumnos registrados");
        } else {
            System.out.println("--LISTA DE ALUMNO--");
            for(Alumno alum : claseAlumno) {
                alum.mostrarNotas();
                System.out.println();
            }
        }
    }
    
    //Metodo que calcula que alumno tiene la mejor media
    public static void mejorAlumno(ArrayList<Alumno> claseAlumno) {
        System.out.println("");
        if(claseAlumno.isEmpty()) {
            System.out.println("No hay alumnos registrados");
        } else {
            Alumno mejorAlumno = claseAlumno.get(0);
            for(Alumno alum : claseAlumno) {
                if(alum.calcularMedia() > mejorAlumno.calcularMedia()) {
                    mejorAlumno = alum;
                }
            }
            System.out.println("El mejor alumno es: " + mejorAlumno.getNombreAlumno() + " con media " + mejorAlumno.calcularMedia());
        }
    }
    
    //Metodo que determina cual es la asignatura con mas suspensos
    public static void asignaturaMasDificil(ArrayList<Alumno> claseAlumno, String[] asignaturas) {
        System.out.println("");
        if(claseAlumno.isEmpty()) {
            System.out.println("No hay alumnos registrados");
        } else {
            //Array para contar suspenos por asignatura
            int[] suspensos = new int[asignaturas.length];
            
            for(Alumno alum : claseAlumno) {
                for(int i = 0; i < asignaturas.length; i++) {
                    if(alum.getNotaPorPosicion(i) < 5) {
                        suspensos[i]++;
                    }
                }
            }
            int max = suspensos[0];
            String asignaturaDificil = asignaturas[0];
            
            for(int i = 1; i < suspensos.length; i++) {
                if(suspensos[i] > max) {
                    max = suspensos[i];
                    asignaturaDificil = asignaturas[i];
                }
            }
            System.out.println("La asignatura mas dificil es: " + asignaturaDificil + " con " + max + " suspensos");
        }
    }
}