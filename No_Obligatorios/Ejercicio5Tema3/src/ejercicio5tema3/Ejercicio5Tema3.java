/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5tema3;
import java.util.Scanner;
/**
 *
 * @author DAVID
 */
public class Ejercicio5Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numeroPedido;
        
        System.out.println("Por favoz, introduzca un numero:");
        numeroPedido = entrada.nextInt();
        
        if (numeroPedido % 2 == 0){//Division de resto para que salga si es impar o par y pongo que le 0 es par
            System.out.println("El numero " + numeroPedido + " es par");
        }else {
            System.out.println("El numero " + numeroPedido + " es impar");
        }
    }
    
}
