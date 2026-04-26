/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12bis2tema12;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio12Bis2Tema12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Array de 4 cadenas que introduce el usuario
        String[] cadenas = new String[4];
        for (int i = 0; i < cadenas.length; i++) {
            System.out.print("Introduce la cadena: " + (i+1) + ": ");
            cadenas[i] = entrada.nextLine();
        }
        //Se llama al metodo que escribe las cadenas en el archivo
        escribirCadenasEnArchivo(cadenas, "salida.txt");
        System.out.println("Archivo creado correctamente");
    }
    
    //Metodo que escribe las cadenas en el archivo
    public static void escribirCadenasEnArchivo(String[] cadenas, String nombreArchivo) {
        FileWriter fw = null;
        PrintWriter pw = null;
        
        try {
            //Se abre el archivo indicado
            fw = new FileWriter(nombreArchivo);
            pw = new PrintWriter(fw);
            //Recorre el array de cadenas
            for (int i = 0; i < cadenas.length; i++) {
                pw.print(cadenas[i]);
                //Se escribe la cadena
                if (i < cadenas.length - 1) {
                    pw.print("*");
                }
            }
            //Se cierran los flujos
            pw.close();
            fw.close();
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo");
        }
    }
}