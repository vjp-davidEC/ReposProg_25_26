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
        int contraseniaCorrecta = 2511;//Contrasenia numerica
        int intentos = 0;//Contar intentos
        boolean acceso = false;//Saber si el acceso fue concedido
        int contraseniaIngresada;//Guardar la contrasenia que introduce el usuario
        
        while (intentos < 3 && !acceso) {//Bucle que se repite mientras el usuario no acierte y no supere los 3 intentos
            contraseniaIngresada = pedirContrasenia();//Metodo al que hemos llamado para pedir la contrasenia
            acceso = comprobarContrasenia(contraseniaIngresada, contraseniaCorrecta);//Metodo al que hemos llamado para compribar si la contrasenia es correcta
            mostrarResultado(acceso);//Metodo al que hemos llamado para mostrar el resultado de la comprobacion
            intentos++;//Contador de intentos
        }
        if (!acceso) {//Bloquear al pasarse de 3 intentos
            System.out.println("Has agotado los 3 intentos. Acceso denegado");
        }
    }
    public static int pedirContrasenia () {//Metodo que pide al usuario la contrasenia
       Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca la contrasenia: ");//Lo que pedimos al usuario
        int numero1 = entrada.nextInt();
        return numero1;//Devolver la contrasenia al metodo
    }
    public static boolean comprobarContrasenia(int contraseniaIngresada, int contraseniaCorrecta) {//Metodo que compara si la contrasenia ingresada es correcta
        return contraseniaIngresada == contraseniaCorrecta;//Devolver true al metodo si son iguales
    }
    public static void mostrarResultado (boolean esCorrecta) {//Metodo que muestra el resultado de la comprobacion
        if (esCorrecta) {
            System.out.println("Enhorabuena, contrasenia correcta");//Mensaje correcto
        } else {
            System.out.println("Contrasenia incorrecta");//Mensaje incorrecto
        }
    }
}