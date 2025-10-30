/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17tema4;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio17Tema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char letraSecreta = generarLetraAleatoria();//Generar letra
        jugar(letraSecreta);
    }
    public static char generarLetraAleatoria() {
        int numero = (int)(Math.random() * (122 - 97 + 1)) + 97;//Numero aleatorio para el codigo ASCII
        return (char)numero;//Devolver el numero
    }
    public static void jugar(char letraSecreta) {
        Scanner entrada = new Scanner(System.in);
        int intentos = 0;//Intentos
        char letraUsuario;//Variable para la letra que va a pedir el usuario
        
        do {
            letraUsuario = pedirLetra();//Metodo al que llamo para que pida al usuario la letra
            intentos++;//Incremento de intentos
            if (letraUsuario < letraSecreta) {//Comparar la letra si esta despues
                System.out.println("La letra esta despues en el alfabeto");
            } else if (letraUsuario > letraSecreta) {//Comparar la letra si esta antes
                System.out.println("La letra esta antes en el alfabeto");
            } else {//Mostrar mensaje si se acierta y en cuantos intentos
                System.out.println("Correctoo!! HAS ACERTADOOO LA LETRAA");
                System.out.println("Has tartado en adivinar la letra en " + intentos + " intentos");
            }
        } while (letraUsuario !=letraSecreta);//Repetir hasta que se acierte
    }
    public static char pedirLetra() {//Metodo que pide al usario que ponga una letra
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce una letra minuscula: ");//Pedirselo al usuario
        return entrada.nextLine().charAt(0);//Devolver el numero
    }
}