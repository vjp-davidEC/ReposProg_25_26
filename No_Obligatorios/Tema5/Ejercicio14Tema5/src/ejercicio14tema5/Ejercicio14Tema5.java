/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14tema5;
import java.util.Scanner;

/**
 *
 * @author DAVID
 */
public class Ejercicio14Tema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Objeto de la clase Numero
        Numero n = new Numero();
        
        //Pedir al usuario que introduzca un numero y se asigne el numero al objeto
        System.out.print("Introduce un numero: ");
        n.setValor(entrada.nextInt());
        
        n.mostrarTabla();//Llamar al método mostrarTabla para imprimir la tabla del numero introducido por el usuario
    }
}