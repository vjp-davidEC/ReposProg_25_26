/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12bistema12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author alumno
 */
public class Ejercicio12BisTema12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader br = null;
        
        try {
            //Se abre el archivo de entrada
            fr = new FileReader("masnumeros.txt");
            br = new BufferedReader(fr);
            
            String linea = br.readLine();
            int sumaTotal = 0;
            
            //Mientras queden lineas por leear
            while (linea != null) {
                //Se divide las lineas usando ";"
                String[] numeros = linea.split(";");
                //Se recorre el array de numeros
                for (int i = 0; i < numeros.length; i++) {
                    //Se combierte cada numero de String en INT
                    sumaTotal += Integer.parseInt(numeros[i]);
                }
                linea = br.readLine();
            }
            System.out.println("La suma de todos los numeros del fichero es: " + sumaTotal);
            //Se cierra los flujos
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se encontro el archivo");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }
    }
}