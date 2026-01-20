/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16tema7;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio16Tema7 {

    /**
     * @param args the command line arguments
     */
    //Constantes que sirve para ponerlas en vez de poner "matriz.length"
    public final static int ALU = 6;
    public final static int ASI = 4;
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Arrays con los nombres de los alumnos y las asignaturas
        String[] alumnos = {"Pepe", "Juan", "Ana", "Marta", "Pedro", "Maria"};
        String[] asignaturas = {"Lengua", "Mates", "Historia", "Fisica"};
        
        int[][] notas = new int[ALU][ASI];//Matriz donde guardaremos las notas
        
        int opcion;
        
        do{
            mostrarMenu();
            opcion = entrada.nextInt();
            
            switch(opcion){//Selección de la acción según la opción elegida
                case 1 -> rellenarNotas(notas, alumnos, asignaturas);
                case 2 -> mostrarNotas(notas, alumnos, asignaturas);
                case 3 -> alumnoMejor(notas, alumnos);
                case 4 -> alumnoSuspensos(notas, alumnos);
                case 5 -> asignaturaDificil(notas, asignaturas);
                case 6 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion no valida. Intentalo de nuevo");
            }
        }while(opcion != 6);//Repetir hasta que el usuario elija salir
    }
    
    //Metodo que muestra el menu por pantalla
    public static void mostrarMenu(){
        System.out.println("\n--MENU--");
        System.out.println("1. Rellenar las notas de los alumnos");
        System.out.println("2. Mostrar las notas");
        System.out.println("3. Alumno mejor de la clase");
        System.out.println("4. Alumno con mas suspensos");
        System.out.println("5. Asignatura mas dificil");
        System.out.println("6. Salir del menu");
        System.out.print("Elige una opcion: ");
    }
    
    //Metodo que permite introducir las notas de cada alumno en cada asignatura
    public static void rellenarNotas(int[][] notas, String[] alumnos, String[] asignaturas){
        Scanner entrada = new Scanner(System.in);
        System.out.println("");
        System.out.println("Introduce las notas:");
        for(int i = 0; i < ALU; i++){
            System.out.println("Alumno: " + alumnos[i]);
            for(int j = 0; j < ASI; j++){
                System.out.print(" " + asignaturas[j] + ": ");
                notas[i][j] = entrada.nextInt();
            }
        }
    }
    
    //Metodo que muestra todas las notas de todos los alumnos
    public static void mostrarNotas(int[][] notas, String[] alumnos, String[] asignaturas){
        System.out.println("");
        for(int i = 0; i < ALU; i++){
            System.out.print(alumnos[i] + ": ");
            for(int j = 0; j < ASI; j++){
                System.out.print(notas[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    //Metodo que calcula que alumno tiene la mejor media
    public static void alumnoMejor(int[][] notas, String[] alumnos){
        System.out.println("");
        double mejorMedia = -1;
        String mejor = "";
        
        for(int i = 0; i < ALU; i++){
            int suma = 0;
            for (int j = 0; j < ASI; j++) {
                suma += notas[i][j];
            }
            double media = (double)suma / ASI;
            
            if(media > mejorMedia){
                mejorMedia = media;
                mejor = alumnos[i];
            }
        }
        System.out.println("El mejor alumno es: " + mejor + " con media " + mejorMedia);
    }
    
    //Metodo que determina que alumno tiene más suspensos
    public static void alumnoSuspensos(int[][] notas, String[] alumnos){
        System.out.println("");
        int maxSus = -1;
        String peor = "";
        
        for (int i = 0; i < ALU; i++){
            int suspensos = 0;
            for (int j = 0; j < ASI; j++){
                if(notas[i][j] < 5){
                    suspensos++;
                }
            }
            if(suspensos > maxSus){
                maxSus = suspensos;
                peor = alumnos[i];
            }
        }
        System.out.println("El alumno con mas suspensos es: " + peor + " con " + maxSus + " suspensos");
    }
    
    //Metodo que calcula que asignatura tiene la peor media
    public static void asignaturaDificil(int[][] notas, String[] asignaturas){
        System.out.println("");
        double peorMedia = 999;//Lo pongo porque es el valor inicial mas alto
        String peor = "";
        
        for (int j = 0; j < ASI; j++){
            int suma = 0;
            for (int i = 0; i < notas.length; i++){
                suma += notas[i][j];
            }
            double media = (double)suma / notas.length;
            
            if(media < peorMedia){
                peorMedia = media;
                peor = asignaturas[j];
            }
        }
        System.out.println("La asignatura mas dificil es: " + peor + " con media " + peorMedia);
    }
}