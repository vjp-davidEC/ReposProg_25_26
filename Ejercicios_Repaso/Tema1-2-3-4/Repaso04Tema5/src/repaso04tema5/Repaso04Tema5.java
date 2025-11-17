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
        
        //Variables 
        int cantidadViajes;
        double sumaTotal = 0;
        int contador = 0;
        String destino;
        int numPersonas;
        double precioPersona;
        double costeViaje;
        
        System.out.print("Cuantos viajes quieres registrar?: ");
        cantidadViajes = entrada.nextInt();
        entrada.nextLine();//Limpiar buffer
        
        //Bucle que se repite hasta registrar todos los viajes 
        while (contador < cantidadViajes) {
            System.out.print("Destino: ");
            destino = entrada.nextLine();

            System.out.print("Numero de personas: ");
            numPersonas = entrada.nextInt();

            System.out.print("Precio por persona: ");
            precioPersona = entrada.nextDouble();
            entrada.nextLine(); // limpiar buffer

            costeViaje = numPersonas * precioPersona;//Calcular el coste total del viaje 
            sumaTotal = sumaTotal + costeViaje;//Sumamos el coste al total acumulado 
            System.out.println("");

            System.out.println("Viaje a " + destino + ", \nPersonas: " + numPersonas + ", \nCoste total: " + costeViaje);
            System.out.println("");
            contador++;
        }
        System.out.println("Coste total acumulado: " + sumaTotal);
    }   
}
/*
    Scanner entrada: permite leer lo que el usuario escribe en la consola.
    cantidadViajes: el usuario indica cuántos viajes quiere registrar.
    while (contador < cantidadViajes): el programa se repite hasta que se registren todos los viajes.
    Dentro del bucle:
        Se pide el destino, el número de personas y el precio por persona.
        Se calcula el costeViaje = numPersonas * precioPersona.
        Se acumula en sumaTotal.
        Se muestra la información del viaje registrado.
        Se incrementa el contador para pasar al siguiente viaje.
    Al final: se imprime el coste total acumulado de todos los viajes.
*/