/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01tema8;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio01Tema8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Array de 6 objetos de Asignatura
        Asignatura[] asig = new Asignatura[6];
        
        //Rellenar cada posicion del array en el que el nombre se lo ponemos y la nota la pedimos al usuario
        asig[0] = new Asignatura("Programacion", pedirNota("Programacion"));
        asig[1] = new Asignatura("Lenguaje de Marcas", pedirNota("Lenguaje de Marcas"));
        asig[2] = new Asignatura("Bases de Datos", pedirNota("Bases de Datos"));
        asig[3] = new Asignatura("Entornos de Desarrollo", pedirNota("Entornos de Desarrollo"));
        asig[4] = new Asignatura("Sistemas Informaticos", pedirNota("Sistemas Informaticos"));
        asig[5] = new Asignatura("Formacion y Orientacion Laboral", pedirNota("Formacion y Orientacion Laboral"));
        
        double media = calcularMedia(asig);//Calcular media
        
        System.out.print("Su nota media del curso es de: " + media + "\n");//Mostrar nota media
    }
    
    //Metodo que pide la nota de cada asignatura la usuario
    public static double pedirNota(String nombreAsig){
        Scanner entrada = new Scanner(System.in);
        double nota;
        
        System.out.print("Introduce la nota de " + nombreAsig + ": ");
        nota = entrada.nextDouble();
        
        return nota;
    }
    
    //Metodo que calcula la nota media
    public static double calcularMedia(Asignatura[] vectorAsignaturas){
        double suma = 0;
        for(int i = 0; i < vectorAsignaturas.length; i++){
            suma += vectorAsignaturas[i].getNota();
        }
        
        return suma / vectorAsignaturas.length;
    }
}
