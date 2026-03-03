/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10tema4;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio10Tema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = pedirNumero();//Es el metodo al que hemos llamado y guarda el valor que devuelve en la variable numero
        imprimirTabla(numero);//Es otro metodo al que hemos llamado y el numero pasa como parametro
    }
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        int numero1;
        System.out.print("Introduce un numero para calcular su tabla de multiplicar: ");//Pedir al usuario
        numero1 = entrada.nextInt();
        return numero1;//Devolver el numero al metodo
    }
    public static void imprimirTabla(int numero) {
        System.out.println("Tabla de multiplicar del " + numero);//Del numero del que vamos hacer
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));//Resultado
        }
    }
}