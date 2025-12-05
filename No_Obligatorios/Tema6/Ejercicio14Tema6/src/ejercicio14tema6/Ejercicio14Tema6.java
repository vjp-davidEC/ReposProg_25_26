/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14tema6;

import java.util.Scanner;

/**
 *
 * @author DAVID
 */
public class Ejercicio14Tema6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Se piden los datos de la revista al usuario
        System.out.println("--REVISTA--");
        System.out.print("Codigo: ");
        String codRev = entrada.nextLine();
        System.out.print("Titulo: ");
        String titRev = entrada.nextLine();
        System.out.print("Anio de publicacion: ");
        int anioRev = entrada.nextInt();
        System.out.print("Numero de revista: ");
        int numRev = entrada.nextInt();
        entrada.nextLine(); // limpiar buffer

        //Objeto que se crea de la clase Revista
        Revista revista = new Revista(codRev, titRev, anioRev, numRev);
        System.out.println("\nDatos de la revista:");
        revista.mostrarDatos();//Mostrar los datos

        //Se piden los datos del libro al usuario
        System.out.println("\n--LIBRO--");
        System.out.print("Codigo: ");
        String codLib = entrada.nextLine();
        System.out.print("Titulo: ");
        String titLib = entrada.nextLine();
        System.out.print("Anio de publicacion: ");
        int anioLib = entrada.nextInt();

        //Objeto que se crea de la clase Libro
        Libro libro = new Libro(codLib, titLib, anioLib);
        System.out.println("\nDatos del libro:");
        libro.mostrarDatos();//Mostrar los datos

        libro.prestar();//El libro se presta
        libro.mostrarDatos();//Se muestran los datos con estado actualizado
        libro.devolver();//El libro se devuelve
        libro.mostrarDatos();//Se muestran los datos con estado actualizado

        //Objetos que se crean de la clase Publicacion para {Revista-Libro} con poliformismo
        System.out.println("\n--POLIMORFISMO {REVISTA/LIBRO}--");
        Publicacion pub = new Revista("R-202", "Ciencia Hoy", 2022, 45);
        pub.mostrarDatos();//Mostrar los datos

        Prestable prestable = new Libro("L-303", "Java Básico", 2023);
        prestable.prestar();//Se presta el libro
        prestable.mostrarPrestado();//Se muestra si está prestado
        prestable.devolver();//Se devuelve el libro
        prestable.mostrarPrestado();//Se muestra nuevamente el estado
    }
}