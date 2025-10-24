/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8tema4;
import java.util.Scanner;
/**
 *
 * @author DAVID
 */
public class Ejercicio8Tema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int importe;
        
        System.out.print("Por favor, indique una cantidad de dinero: ");//Pedir la cantidad al usuario
        importe = entrada.nextInt();
        
        desglosarDinero(importe);//Llamar al metodo
    }
    public static void desglosarDinero(int importe) {//Metodo que recibe el importe en euros y lo desglosa en billetes y euros
        System.out.println(importe + " Euros se descomponen en: ");//Calculos para los billetes y monedas
        int billetes50 = importe / 50;
        importe = importe % 50;
        int billetes20 = importe / 20;
        importe = importe % 20;
        int billetes10 = importe / 10;
        importe = importe % 10;
        int billetes5 = importe / 5;
        importe = importe % 5;
        int monedas2 = importe / 2;
        importe = importe % 2;
        int monedas1 = importe;
        
        if (billetes50 > 0) System.out.println("Billetes de 50: " + billetes50);//Resultados
        if (billetes20 > 0) System.out.println("Billetes de 20: " + billetes20);
        if (billetes10 > 0) System.out.println("Billetes de 10: " + billetes10);
        if (billetes5 > 0) System.out.println("Billetes de 5: " + billetes5);
        if (monedas2 > 0) System.out.println("Monedas de 2 euros: " + monedas2);
        if (monedas1 > 0) System.out.println("Monedas de 1 euro: " + monedas1);
    }
}
