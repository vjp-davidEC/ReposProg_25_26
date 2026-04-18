/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14tema12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author alumno
 */

public class Ejercicio14Tema12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader br = null;
        
        try {
            //Se abre el archivo de entrada
            //fr = new FileReader("C:\\Users\\alumno\\Documents\\workspace_netbeans\\Ejercicio13Tema12\\DatosBeca.txt");
            fr = new FileReader("DatosBeca.txt");
            br = new BufferedReader(fr);
            
            String linea = br.readLine();
            
            //Variables donde se guardan los datos del becario
            String nombre = "";
            String sexo = "";
            String edad = "";
            String suspensos = "";
            String residencia = "";
            String ingresos = "";
            
            while (linea != null) {
                if (empiezaPor(linea, "Nombre:")) {
                    nombre = extraerTexto(linea);
                }
                if (empiezaPor(linea, "Sexo:")) {
                    sexo = extraerTexto(linea);
                }
                if (empiezaPor(linea, "Edad:")) {
                    edad = extraerTexto(linea);
                }
                if (empiezaPor(linea, "Numero de suspensos:")) {
                    suspensos = extraerTexto(linea);
                }
                if (empiezaPor(linea, "Residencia familiar:")) {
                    residencia = extraerTexto(linea);
                }
                if (empiezaPor(linea, "Ingresos anuales:")) {
                    ingresos = extraerTexto(linea);
                }
                    
                if (empiezaPor(linea, "---")) {
                    int beca = calcularBeca(edad, suspensos, residencia, ingresos);//Calcular beca
                    if (beca > 0) {//Mostrar si tiene beca
                        System.out.println(nombre + "(" + sexo + ")" + "tiene una beca de " + beca + " Euros");
                    }
                    //Reiniciar variables
                    nombre = "";
                    sexo = "";
                    edad = "";
                    suspensos = "";
                    residencia = "";
                    ingresos = "";  
                }
                linea = br.readLine();
            }
            //Cierre de flujos
            br.close();
            fr.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }
    }
    
    //Metodo que comprueba si una linea empieza por un texto
    public static boolean empiezaPor(String linea, String inicio) {
        if (linea.length() < inicio.length()) return false;
        
        for (int i = 0; i < inicio.length(); i++) {
            if (linea.charAt(i) != inicio.charAt(i)) return false;
        }
        return true;
    }
    
    //Metodo que extrae el texto que aparece despues de los dos puntos
    public static String extraerTexto(String linea) {
        boolean copiar = false;
        String resultado = "";
        
        for (int i = 0; i < linea.length(); i++) {
            char c = linea.charAt(i);
            
            if (c == ':') {
                copiar = true;
            } else if (copiar) {
                if (c != ' ') {
                    resultado += c;
                }
            }
        }
        //Se copia sin el espacio
        return resultado;
    }
    
    //Metodo que calcula la beca usando numeros reales
    public static int calcularBeca (String edad, String suspensos, String residencia, String ingresos) {
        //Se convierte a INT todos los Strings
        int edadNum = Integer.parseInt(edad);
        int suspensosNum = Integer.parseInt(suspensos);
        int ingresosNum = Integer.parseInt(ingresos);
        
        //Beca
        int beca = 1500;
        //Ingresos
        if (ingresosNum <= 12000) {
            beca += 500;
        }//Edad
        if (edadNum < 23) {
            beca += 200;
        }//Suspensos
        if (suspensosNum == 0) {
            beca += 500;
        } else if (suspensosNum == 1) {
            beca += 200;
        } else {
            return 0;
        }//Residencia
        if (residencia.equalsIgnoreCase("NO")) {
            beca += 1000;
        }
        return beca;
    }
}