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
        
        Asignatura[] asig = new Asignatura[6];
        
        asig[0] = new Asignatura("Programacion", pedirNota());
        asig[1] = new Asignatura("Lenguaje de Marcas", pedirNota());
        asig[2] = new Asignatura("Bases de Datos", pedirNota());
        asig[3] = new Asignatura("Entornos de Desarrollo", pedirNota());
        asig[4] = new Asignatura("Sistemas Informaticos", pedirNota());
        asig[5] = new Asignatura("Formacion y Orientacion Laboral", pedirNota());
        
        
        System.out.print("Su nota media del curso es de: " + calcularMedia());
    }
    
    public static double pedirNota(){
        Scanner entrada = new Scanner(System.in);
        double nota;
        
        System.out.print("Introduce la nota: ");
        nota = entrada.nextDouble();
        
        return nota;
    }
    
    public static double calcularMedia(Asignatura[] vectorAsignaturas){
        double media = 0;
        for (int i = 0; i < vectorAsignaturas.length; i++) {
            media = 
        }
        
        return media;
    }
}
