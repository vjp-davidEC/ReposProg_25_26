/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso04tema5;

import java.util.Scanner;

/**
 *
 * @author DAVID
 */
public class Repaso04Tema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int cantidadViajes;
        double sumaTotal = 0;
        int contador = 0;
        String destino;
        int numPersonas;
        double precioPersona;
        double costeViaje;
        
        System.out.print("Cuantos viajes quieres registrar?: ");
        cantidadViajes = entrada.nextInt();
        entrada.nextLine(); // limpiar buffer

        while (contador < cantidadViajes) {
            System.out.print("Destino: ");
            destino = entrada.nextLine();

            System.out.print("Numero de personas: ");
            numPersonas = entrada.nextInt();

            System.out.print("Precio por persona: ");
            precioPersona = entrada.nextDouble();
            entrada.nextLine(); // limpiar buffer

            costeViaje = numPersonas * precioPersona;
            sumaTotal = sumaTotal + costeViaje;
            System.out.println("");

            System.out.println("Viaje a " + destino + ", \nPersonas: " + numPersonas + ", \nCoste total: " + costeViaje);
            System.out.println("");
            contador++;
        }
        System.out.println("Coste total acumulado: " + sumaTotal);
    }   
}