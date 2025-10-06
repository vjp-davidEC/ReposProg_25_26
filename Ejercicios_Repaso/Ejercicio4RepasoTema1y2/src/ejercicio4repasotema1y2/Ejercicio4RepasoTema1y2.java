/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4repasotema1y2;
import java.util.Scanner;
/**
 *
 * @author DAVID
 */
public class Ejercicio4RepasoTema1y2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int anio;
        
        System.out.println("Introduzca el anio: ");
        anio = entrada.nextInt();
        
        if (anio % 4 == 0 && anio % 100 !=0 || anio % 400 == 0){
        System.out.println("El anio " + anio + " es bisiesto");
        }else{
            System.out.println("El anio " + anio + " no es bisiesto");
            }
    }
    
}
