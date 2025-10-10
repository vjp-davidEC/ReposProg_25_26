/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24tema2;

import java.util.Scanner;

/**
 *
 * @author DAVID
 */
public class Ejercicio24Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double programacion;
        double lenguajesMarcas;
        double basesDatos;
        double entornosDesarrollo;
        double sistemasInformaticos;
        double fol;
        double media;
        
        System.out.println("Por favor, introduzca la nota de programacion: ");
        programacion = entrada.nextDouble();
        
        System.out.println("Introduzca la nota de Lenguajes de Marcas: ");
        lenguajesMarcas = entrada.nextDouble();
        
        System.out.println("Introduzca la nota de Bases de Datos: ");
        basesDatos = entrada.nextDouble();
        
        System.out.println("Introduzca la nota de Entornos de Desarrollo: ");
        entornosDesarrollo = entrada.nextDouble();
        
        System.out.println("Introduzca la nota de Sistemas Informaticos: ");
        sistemasInformaticos = entrada.nextDouble();
        
        System.out.println("Por ultimo, introduzca la nota de Formacion y Orientacion Laboral: ");
        fol = entrada.nextDouble();
        
        media = (programacion + lenguajesMarcas + basesDatos + entornosDesarrollo + sistemasInformaticos + fol) / 6;
        
        System.out.println("Su nota media del curso es de: " + media);
    }
    
}
