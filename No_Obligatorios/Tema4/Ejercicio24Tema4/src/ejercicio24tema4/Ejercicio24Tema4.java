/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24tema4;
import java.util.Scanner;
/**
 *
 * @author DAVID
 */
public class Ejercicio24Tema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = pedirNombre();//Llamo al metodo pedirNombre y lo guardo con un String
        int edad = pedirEdad();//Llamo al metodo pedirEdad y lo guardo con un int
        
        mayorDeEdad(nombre, edad);//Llamo al metodo mayorDeEdad pasando el nombre y edad como parametro
    }
    public static String pedirNombre() {//Metodo que pide al usuario que introduzca su nombre y devuelve el nombre al metodo
        Scanner entrada = new Scanner(System.in);
        System.out.print("Por favor, introduzca tu nombre: ");
        return entrada.nextLine();
    }
    public static int pedirEdad() {//Metodo que pide al usuario que introduzca su edad y devuelve la edad al metodo
        Scanner entrada = new Scanner(System.in);
        System.out.print("Por favor, introduzca tu edad: ");
        return entrada.nextInt();
    }
    public static void mayorDeEdad(String nombre, int edad) {//Metodo que determina si el usuario es mayor de edad y mostrar el resultado
        if (edad >= 18) {//Si es mayor de edad, mostrar el mensaje
            System.out.println("El usuario llamada " + nombre + " es mayor de edad");
        } else {//Si es menor de edad, mostrar el otro mensaje
            System.out.println("El usuario llamado " + nombre + " no es mayor de edad");
        }
    }
}