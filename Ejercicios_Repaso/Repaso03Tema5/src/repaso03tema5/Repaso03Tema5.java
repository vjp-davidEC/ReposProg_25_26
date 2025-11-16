/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso03tema5;

import java.util.Scanner;

/**
 *
 * @author DAVID
 */
public class Repaso03Tema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int cantidadEstudiantes;
        double sumaNotas = 0;
        int contador = 0;
        String nombre;
        int edad;
        double nota;
        double media;
        
        System.out.print("Cuantos estudiantes quieres registrar?: ");
        cantidadEstudiantes = entrada.nextInt();
        entrada.nextLine(); // limpiar buffer
        System.out.println("");
        
        while (contador < cantidadEstudiantes) {
            System.out.print("Nombre: ");
            nombre = entrada.nextLine();

            System.out.print("Edad: ");
            edad = entrada.nextInt();

            System.out.print("Nota final: ");
            nota = entrada.nextDouble();
            entrada.nextLine(); // limpiar buffer

            if (nota >= 5) {
                System.out.println(nombre + " ha aprobado");
            } else {
            System.out.println(nombre + " ha suspendido");
            }
            System.out.println("");

            sumaNotas = sumaNotas + nota;
            contador++;
        }

        media = sumaNotas / cantidadEstudiantes;
        System.out.println("Nota media de la clase: " + media);
        entrada.close();
    }
}