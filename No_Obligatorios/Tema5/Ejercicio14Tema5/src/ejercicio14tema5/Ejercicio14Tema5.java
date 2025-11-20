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
        
        
        //Objeto de la clase Numero, pedir al usuario que introduzca un numero y se asigne el numero al objeto
        Numero n = new Numero();
        n.setValor(pedirNumero());
        
        n.mostrarTabla();//Llamar al método mostrarTabla para imprimir la tabla del numero introducido por el usuario
    }
    
    public static int pedirNumero(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce numero: ");
        return entrada.nextInt();
    }
}