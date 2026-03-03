/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio32tema3;
import java.util.Scanner;

/**
 *
 * @author DAVID
 */
public class Ejercicio32Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int anioActual;
        int mesActual;
        int diaActual;
        int anioNacimiento;
        int mesNacimiento;
        int diaNacimiento;
        int anios;
        int meses;
        int dias;
        
        System.out.print("Introduzca el anio actual: ");//Pedir al usuario la fecha actual
        anioActual = entrada.nextInt();
        System.out.print("Introduzca el mes actual: ");
        mesActual = entrada.nextInt();
        System.out.print("Introduzca el dia actual: ");
        diaActual = entrada.nextInt();
        
        System.out.print("Ahora, introduzca su anio de nacimiento: ");//Pedir al usuario la fecha de nacimiento
        anioNacimiento = entrada.nextInt();
        System.out.print("Introduzca su mes de nacimiento: ");
        mesNacimiento = entrada.nextInt();
        System.out.print("Por ultimo introdizca su dia de nacimiento: ");
        diaNacimiento = entrada.nextInt();
        
        anios = anioActual - anioNacimiento;//Resta para sacar el anio, mes y dia
        meses = mesActual - mesNacimiento;
        dias = diaActual - diaNacimiento;
        
        if (dias < 0) {
            meses--;
            dias += 30;
        }
        if (meses < 0) {
            anios--;
            meses += 12;
        }
        System.out.println("Su edad exacta es de " + anios + " anios, " + meses + " meses y " + dias + " dias");//Resultado
    }
    
}
