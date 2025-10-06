/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2repasotema1y2;
import java.util.Scanner;
/**
 *
 * @author DAVID
 */
public class Ejercicio2RepasoTema1y2 {
    public final static double IVA = 1.21;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double precioSinIVA;
        double precioConIVA;
        
        System.out.println("Dime un precio para un producto que no tiene IVA: ");
        precioSinIVA = entrada.nextDouble();
        precioConIVA = precioSinIVA * IVA;
        
        System.out.println("El precio final es: " + precioConIVA);
        
    }
    
}
