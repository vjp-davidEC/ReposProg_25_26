/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9tema4;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio9Tema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numero1;
        int numero2;
        int numero3;
        
        System.out.print("Por favor, introduzca el primer numero: ");//Pedir al usuario
        numero1 = entrada.nextInt();
        System.out.print("Ahora, introduzca el segundo numero: ");
        numero2 = entrada.nextInt();
        System.out.print("Por ultimo, introduzca el tercer numero: ");
        numero3 = entrada.nextInt();
        
        //"Operaciones" es el clase y "pedirNumeros" es el metedo al que hemos llamado, pasando tres numeros
        int menor = Operaciones.pedirNumeros(numero1, numero2, numero3);//Metodo que devuelve el menor de los tres, que guardamos en la variable menor
        System.out.println("El numero menor de los introducidos es el " + menor);//Mostrar en pantalla
    }
}