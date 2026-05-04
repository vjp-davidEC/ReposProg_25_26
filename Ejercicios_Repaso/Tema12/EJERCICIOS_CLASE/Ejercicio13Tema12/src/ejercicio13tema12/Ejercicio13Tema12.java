/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13tema12;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio13Tema12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Se le pide los datos al usuario
        String nombre = pedirNombreApellido();
        String sexo = pedirSexo();
        String edad = pedirEdad();
        String numSuspensos = pedirNumSuspensos();
        String residencia = pedirResidencia();
        String ingresosAnuales = pedirIngresos();
        
        //Se guarda los datos en el archivo
        escribirEnArchivo(nombre, sexo, edad, numSuspensos, residencia, ingresosAnuales);
        System.out.println("Datos guardados correctamente en \"DatosBeca.txt\"");
    }
    
    //Metodo que escribe los datos en archivo
    public static void escribirEnArchivo(String nombre, String sexo, String edad, String numSuspensos, String residencia, String ingresosAnuales) {
        FileWriter fw = null;
        PrintWriter pw = null;
        
        try {
            //Se abre el archivo en modo "append"
            fw = new FileWriter("DatosBeca.txt", true);
            pw = new PrintWriter(fw);
            
            //Se escribe la informacion en cada linea
            pw.println("Nombre: " + nombre);
            pw.println("Sexo: " + sexo);
            pw.println("Edad: " + edad);
            pw.println("Numero de suspensos: " + numSuspensos);
            pw.println("Residencia familiar: " + residencia);
            pw.println("Ingresos anuales: " + ingresosAnuales);
            pw.println("---");
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo");
        } finally {
            try {
                //Cierre de flujos
                if (pw != null) {
                    pw.close();
                }
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar los flujos");
            }
        }
    }
     
        
    //Metodo que piden al usuario en nombre y apellido, el sexo, edad, numeros de suspensos, residencia e ingresos
    public static String pedirNombreApellido() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre y apellido: ");
        String nombreApellido = entrada.nextLine();
        return nombreApellido;
    }
    
    public static String pedirSexo() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Sexo (H-M): ");
        String sexo = entrada.nextLine();
        return sexo;
    }
    
    public static String pedirEdad() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Edad (20-60): ");
        String edad = entrada.nextLine();
        return edad;
    }
    
    public static String pedirNumSuspensos() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Numero de suspensos (0-4): ");
        String numSuspensos = entrada.nextLine();
        return numSuspensos;
    }
    
    public static String pedirResidencia() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Residencia familiar (SI-NO): ");
        String residencia = entrada.nextLine();
        return residencia;
    }
    
    public static String pedirIngresos() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresos anuales: ");
        String ingresosAnuales = entrada.nextLine();
        return ingresosAnuales;
    }
}