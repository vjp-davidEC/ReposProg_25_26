/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23tema2;
import java.util.Scanner;
/**
 *
 * @author DAVID
 */
public class Ejercicio23Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double precio;
        int unidades;
        double total;
                
        System.out.println("Por favor, introduzca el precio del modelo de ordenador que comprar: ");
        precio = entrada.nextDouble();
        
        System.out.println("Cuantas unidades quiere llevarse");
        unidades = entrada.nextInt();
        
        total = precio * unidades;
        
        System.out.println("El precio total de sus compra es de: " + total + " Euros");
    }
    
}
