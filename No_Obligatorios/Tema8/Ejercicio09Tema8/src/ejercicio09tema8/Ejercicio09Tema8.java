/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio09tema8;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio09Tema8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Arrays con los nombres de los alumnos y las asignaturas
        String[] alumnos = {"Pepe", "Juan", "Marta"};
        String[] asignaturas = {"Lengua", "Mates", "Historia", "Fisica"};
        
        //Array de objetos Alumno
        Alumno[] alu = new Alumno[3];
        
        //Se crea cada alumno y asignarle su nombre
        for(int i = 0; i < alu.length; i++){
            alu[i] = new Alumno();
            alu[i].setNombreAlumno(alumnos[i]);
        }
        
        int opcion;
        
        do{
            mostrarMenu();
            opcion = entrada.nextInt();
            
            switch(opcion){//Selección de la acción según la opción elegida
                case 1 -> rellenarNotas(alu, asignaturas);
                case 2 -> mostrarNotas(alu);
                case 3 -> alumnoMejor(alu);
                case 4 -> alumnoSuspensos(alu);
                case 5 -> asignaturaDificil(alu, asignaturas);
                case 6 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion no valida. Intentalo de nuevo");
            }
        }while(opcion != 6);//Repetir hasta que el usuario elija salir
    }
    
    //Metodo que muestra el menu por pantalla
    public static void mostrarMenu(){
        System.out.println("\n--MENU--");
        System.out.println("1. Rellenar las notas de los alumnos");
        System.out.println("2. Mostrar las notas introducidas de los alumnos");
        System.out.println("3. Alumno mejor de la clase");
        System.out.println("4. Alumno con mas suspensos");
        System.out.println("5. Asignatura mas dificil");
        System.out.println("6. Salir del programa");
        System.out.print("Introduce una opcion: ");
    }
    
    //Metodo que permite introducir las notas de cada alumno en cada asignatura
    public static void rellenarNotas(Alumno[] alu, String[] asignaturas){
        System.out.println("");
        Scanner entrada = new Scanner(System.in);
        
        for(int i = 0; i < alu.length; i++){
            System.out.println("Introduce las notas para " + alu[i].getNombreAlumno());
            //Array temporal para guardar las 4 asignaturas del alumno
            Asignatura[] notas = new Asignatura[4];
            
            for(int j = 0; j < asignaturas.length; j++){
                System.out.print("Nota de " + asignaturas[j] + ": ");
                float nota = entrada.nextFloat();
                //Se crea objeto Asignatura con nombre y nota
                notas[j] = new Asignatura(asignaturas[j], nota);
            }
            //Se guarda las asignaturas dentro del alumno
            alu[i].setNotas(notas);
        }
        System.out.println("Notas introducidas correctamente");
    }
    
    //Metodo que muestra todas las notas de todos los alumnos
    public static void mostrarNotas(Alumno[] alu){
        System.out.println("");
        for(Alumno alumno : alu){
            System.out.println("Alumno: " + alumno.getNombreAlumno());
            for(Asignatura asig : alumno.getNotas()){
                System.out.println(" - " + asig.getNombreAsignatura() + ": " + asig.getNota());
            }
        }
    }
    
    //Metodo que calcula que alumno tiene la mejor media
    public static void alumnoMejor(Alumno[] alu){
        System.out.println("");
        float mejorMedia = 0f;
        String mejorAlumno = "";
        float suma;
        
        for(int i = 0; i < alu.length; i++){
            suma = 0f;
            for(int j = 0; j < alu[i].getNotas().length; j++){
                suma += alu[i].getNotas()[j].getNota();
            }
            float media = suma / 4;
            if(media > mejorMedia){
                mejorMedia = media;
                mejorAlumno = alu[i].getNombreAlumno();
            }
        }
        System.out.println("El mejor alumno es: " + mejorAlumno + " con una media de " + mejorMedia);
    }
    
    //Metodo que determina que alumno tiene más suspensos
    public static void alumnoSuspensos(Alumno[] alu){
        System.out.println("");
        int maxSuspensos = 0;
        String alumnoPeor = "";
        int suspensos;
        
        for(int i = 0; i < alu.length; i++){
            suspensos = 0;
            for(int j = 0; j < alu[i].getNotas().length; j++){
                if(alu[i].getNotas()[j].getNota() < 5){
                    suspensos++;
                }
            }
            if(suspensos > maxSuspensos){
                maxSuspensos = suspensos;
                alumnoPeor = alu[i].getNombreAlumno();
            }
        }
        System.out.println("El alumno con mas suspensos es: " + alumnoPeor + " con " + maxSuspensos + " suspensos");
    }
    
    //Metodo que calcula que asignatura tiene la peor media
    public static void asignaturaDificil(Alumno[] alu, String[] asignaturas){
        System.out.println("");
        float peorMedia = 999f;//Lo pongo porque es el valor inicial mas alto
        String peor = "";
        int suma;
        
        for(int j = 0; j < asignaturas.length; j++){
            suma = 0;
            for(int i = 0; i < alu.length; i++){
                suma += alu[i].getNotas()[j].getNota();
            }
            float media = (float)suma / alu.length;
            if(media < peorMedia){
                peorMedia = media;
                peor = asignaturas[j];
            }
        }
        System.out.println("La asignatura mas dificil es: " + peor + " con media " + peorMedia);
    }
}