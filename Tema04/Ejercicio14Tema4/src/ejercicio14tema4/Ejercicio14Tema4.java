/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14tema4;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio14Tema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = pedirNumero();//Metodo al que hemos llamada para obtener un numero valido
        mostrarMultiplosDeTres(numero);//Metodo al que hemos llamada para imprimir los multiplos de 3 hasta el numero
    }
    public static int pedirNumero() {//Metodo que pide al usuario un numero
        Scanner entrada = new Scanner(System.in);
        int numero;
        
        do {//Bucle que se repite mientras el numero no se mayor a 0
            System.out.print("Introduce un numero: ");//Lo que pedimos al usuario
            numero = entrada.nextInt();
            if(!esValido(numero)) {//Si el numero no es valido, mostrar el mensaje
                System.out.println("Error: El numero debe de ser mayor que 0");
            }
        } while (!esValido(numero));//Repetir si el numero no es valido
        return numero;//Devolver al metodo si el numero es valido
    }
    public static boolean esValido(int numero) {//Metodo que comprueba si el numero es mayor que 0
        return numero > 0;//Devolver true al metodo si el numero es mayor que 0
    }
    public static void mostrarMultiplosDeTres(int numero) {//Metodo que imprime todos los multiplos de 3 entre 1 y el introducido
        int contador = 0;//Contar multiplos que se han mostrado
        System.out.println("Multiplos de 3 entre 1 y " + numero + ":");
        for (int i = 1; i <= numero; i++) {//Bucle que recorre los numeros desde el 1 hasta el introducido
            if (i % 3 == 0) {//Si el numero es valido, mostrarlo y aumentar el contador
                System.out.println(i);
                contador++;
            }
        }
        System.out.println("Total de multiplos de 3 mostrados: " + contador);//Mensaje final
    }
}