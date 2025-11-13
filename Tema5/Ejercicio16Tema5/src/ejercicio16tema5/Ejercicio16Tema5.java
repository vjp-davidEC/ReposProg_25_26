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
        Scanner entrada = new Scanner(System.in);
        
        //Pedir al usuario que introduzca el nombre y la nota de los tres alumnos
        System.out.print("Introduce nombre y nota del primero alumno: ");
        Alumno alu1 = new Alumno(entrada.nextLine(), entrada.nextInt());
        entrada.nextLine();//Limpiar buffer del Scanner para evitar problemas
        System.out.print("Introduce nombre y nota del segundo alumno: ");
        Alumno alu2 = new Alumno(entrada.nextLine(), entrada.nextInt());
        entrada.nextLine();
        System.out.print("Introduce nombre y nota del tercer alumno: ");
        Alumno alu3 = new Alumno(entrada.nextLine(), entrada.nextInt());
        
        //Mostrar la informacion de cada alumno
        System.out.println("");
        alu1.mostrarAlumno();
        System.out.println("");
        alu2.mostrarAlumno();
        System.out.println("");
        alu3.mostrarAlumno();
    }
}