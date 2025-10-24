/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12tema4;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio12Tema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int contraseniaCorrecta = 2511;//Contrasenia numerica
        int intentos = 0;
        boolean acceso = false;
        int contraseniaIngresada;
        
        while (intentos < 3 && !acceso) {
            contraseniaIngresada = pedirContrasenia();
            acceso = comprobarContrasenia(contraseniaIngresada, contraseniaCorrecta);
            mostrarResultado(acceso);
            intentos++;
        }
        if (!acceso) {
            System.out.println("Has agotado los 3 intentos. Acceso denegado");
        }
    }
    public static int pedirContrasenia () {
       Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca la contrasenia: ");
        int numero1 = entrada.nextInt();
        return numero1;
    }
    public static boolean comprobarContrasenia(int contraseniaIngresada, int contraseniaCorrecta) {
        return contraseniaIngresada == contraseniaCorrecta;
    }
    public static void mostrarResultado (boolean esCorrecta) {
        if (esCorrecta) {
            System.out.println("Enhorabuena, contrasenia correcta");
        } else {
            System.out.println("Contrasenia incorrecta");
        }
    }
}