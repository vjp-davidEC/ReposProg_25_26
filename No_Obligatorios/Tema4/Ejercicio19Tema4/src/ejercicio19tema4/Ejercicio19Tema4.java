/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19tema4;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio19Tema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String dia = "";//Lo dejo vacio, porque es como si fuese un 0
        
        System.out.print("Por favor, introduce un dia de la semana: ");//Mensaje para que el usuario ponga un dia de la semana
        dia = entrada.nextLine();
        
        mostrarPosicionDia(dia);//Llamo al metodo mostrarPosicionDia pasando el dia como parametro
    }
    public static void mostrarPosicionDia(String dia) {//Metodo que muestra por un switch los casos que puede haber del Lunes al Domingo
        switch (dia) {
            case "Lunes":
                System.out.println(dia + " es el primer dia de la semana");
                break;
            case "Martes":
                System.out.println(dia + " es el segundo dia de la semana");
                break;
            case "Miercoles":
                System.out.println(dia + " es el tercer dia de la semana");
                break;
            case "Jueves":
                System.out.println(dia + " es el cuarto dia de la semana");
                break;
            case "Viernes":
                System.out.println(dia + " es el quinto dia de la semana");
                break;
            case "Sabado":
                System.out.println(dia + " es el sexto dia de la semana");
                break;
            case "Domingo":
                System.out.println(dia + " es el septimo dia de la semana");
                break;
            default:
                System.out.println("Ese dia no es valido, introduzca un dia que sea del Lunes al Domingo");
        }
    }
}