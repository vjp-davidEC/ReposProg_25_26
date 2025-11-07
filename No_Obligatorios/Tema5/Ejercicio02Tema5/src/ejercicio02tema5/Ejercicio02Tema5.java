/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02tema5;

/**
 *
 * @author DAVID
 */
public class Ejercicio02Tema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Curso curso1 = new Curso();//Crear el primer curso y establecer su nombre y horas e incrementar en el contador
        curso1.establecerNombreyHoras("LMSGI", 40);
        Curso.sumarCursos();
        
        Curso curso2 = new Curso();//Crear el segundo curso y establecer su nombre y horas e incrementar en el contador
        curso2.establecerNombreyHoras("Programacion", 70);
        Curso.sumarCursos();
        
        System.out.println("Curso 1: ");//Mostrar los datos del primer curso
        curso1.mostrarCurso();
        
        System.out.println("");
        
        System.out.println("Curso 2: ");//Mostrar los datos del segundo curso
        curso2.mostrarCurso();
        
        System.out.println("");
        
        System.out.println("Numero total de cursos creados: " + Curso.verNumeroCursos());//Mostrar el numero total de cursos creados
    }
}