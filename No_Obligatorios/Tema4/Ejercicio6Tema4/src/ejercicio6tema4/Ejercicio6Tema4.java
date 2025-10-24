/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6tema4;
import java.util.Scanner;
/**
 *
 * @author DAVID
 */
public class Ejercicio6Tema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int nota;
        
        System.out.print("Por favor, introduzca la nota del alumno: ");//Pedir al usuario que introduzca un numero, que tiene que ser 0-10
        nota = entrada.nextInt();
        
        Calificaciones.calificarNota(nota);//Llamar al metodo de la otra clase
    }
}