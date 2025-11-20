/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16tema5;
import java.util.Scanner;
/**
 *
 * @author DAVID
 */
public class Ejercicio16Tema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Pedir al usuario que introduzca el nombre y la nota de los tres alumnos
        Alumno alu1 = new Alumno(pedirNombre(), pedirNota());
        Alumno alu2 = new Alumno(pedirNombre(), pedirNota());
        Alumno alu3 = new Alumno(pedirNombre(), pedirNota());
        
        //Mostrar la informacion de cada alumno
        System.out.println("");
        alu1.mostrarAlumno();
        System.out.println("");
        alu2.mostrarAlumno();
        System.out.println("");
        alu3.mostrarAlumno();
    }
    
    public static String pedirNombre(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce nombre: ");
        return entrada.nextLine();
    }
    
    public static int pedirNota(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce nota: ");
        return entrada.nextInt();
    }
}