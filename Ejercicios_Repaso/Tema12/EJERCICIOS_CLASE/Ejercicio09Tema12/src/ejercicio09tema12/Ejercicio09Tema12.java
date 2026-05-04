/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio09tema12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author alumno
 */
public class Ejercicio09Tema12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileWriter fw = null;
        FileReader fr = null;
        PrintWriter pw = null;
        BufferedReader br = null;

        try {
            //Se abre el archivo de entrada
            fr = new FileReader("frase.txt");
            br = new BufferedReader(fr);
            //Se abre el archivo de salida
            fw = new FileWriter("fraseinvertida.txt");
            pw = new PrintWriter(fw);

            String frase = "";
            String linea = br.readLine();

            //Bucle para leer todo el archivo
            while (linea != null) {
                frase += linea;
                linea = br.readLine();
            }

            //Invertir frase
            String fraseInvertida = "";
            for (int i = frase.length() - 1; i >= 0; i--) {
                fraseInvertida += frase.charAt(i);
            }
            //Escribir la frase invertida en el archivo nuevo
            pw.println(fraseInvertida);
            System.out.println("Archivo fraseinvertida.txt creado correctamente");
            
            //Cerrar los flujos
            pw.close();
            fw.close();
            br.close();
            fr.close();
            //Por si hay errores
        } catch (FileNotFoundException e) {
            System.out.println("No se encontro el archivo frase.txt");
        } catch (IOException e) {
            System.out.println("Error al leer o escribir en los archivos");
        }
    }
}