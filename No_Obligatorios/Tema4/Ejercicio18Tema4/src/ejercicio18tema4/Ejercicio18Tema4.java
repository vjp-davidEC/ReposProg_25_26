/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18tema4;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio18Tema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = pedirNombre();//Llamo al metodo pedirNombre y lo guardo con un String
        mostrarNombre(nombre);//Llamo al metodo mostrarNombre pasando el nombre como parametro
    }
    public static String pedirNombre() {//Metodo que pide al usuario que introduzca su nombre y devuelve el nombre al metodo
        Scanner entrada = new Scanner(System.in);
        System.out.print("Por favor, introduce tu nombre: ");
        return entrada.nextLine();
    }
    public static void mostrarNombre(String nombre) {//Metodo que imprime 5 veces el nombre con un bucle y lo imprime
        for (int i = 1; i <= 5; i++) {
            System.out.println("Nombre-" + i + ": " + nombre);
        }
    }
}