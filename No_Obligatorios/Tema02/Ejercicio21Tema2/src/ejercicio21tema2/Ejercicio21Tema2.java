/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21tema2;
import java.util.Scanner;
/**
 *
 * @author DAVID
 */
public class Ejercicio21Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int totalSegundos;
        int dias;
        int resto;
        int horas;
        int minutos;
        int segundos;
        
        System.out.println("Por favor, introduzca un numero de segundos: ");
        totalSegundos = entrada.nextInt();
        
        dias = totalSegundos / 86400;
        resto = totalSegundos % 86400;
        
        horas = resto / 3600;
        resto = resto % 3600;
        
        minutos = resto / 60;
        segundos = resto % 60;
        
        System.out.println(totalSegundos + " segundos hacen un total de: " + dias + " dias, " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos");
    }
    
}
