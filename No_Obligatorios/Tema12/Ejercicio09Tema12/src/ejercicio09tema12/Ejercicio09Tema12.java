/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio09tema12;

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

        try {
            fr = new FileReader("frase.txt");

            fw = new FileWriter("fraseinvertida.txt");
            pw = new PrintWriter(fw);

            String frase = "";
            int codigo = fr.read();

            while (codigo != -1) {
                char c = (char) codigo;
                frase += c;
                codigo = fr.read();
            }

            String fraseInvertida = "";
            for (int i = frase.length() - 1; i >= 0; i--) {
                fraseInvertida += frase.charAt(i);
            }
            
            pw.println(fraseInvertida);
            System.out.println("Archivo fraseinvertida.txt creado correctamente");
            
            pw.close();
            fw.close();
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se encontro el archivo frase.txt");
        } catch (IOException e) {
            System.out.println("Error al leer o escribir en los archivos");
        }
    }
}