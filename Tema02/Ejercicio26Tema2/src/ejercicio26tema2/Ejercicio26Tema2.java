/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26tema2;
import java.util.Scanner;
/**
 *
 * @author DAVID
 */
public class Ejercicio26Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numero;
        int primeraCifra;
        int segundaCifra;
        int terceraCifra;
        int cuartaCifra;
        
        System.out.println("Por favor, introduzca un numero de 4 cifras: ");
        numero = entrada.nextInt();
        
        primeraCifra = numero / 1000;//Se divide para sacar la primera cifra
        segundaCifra = (numero / 100) % 10;//Se divide y salen dos cifras que a su vez se divide y se saca el resto y sale la segunda cifra 
        terceraCifra = (numero /10) % 10;//Se divide y salen tres cifras que a su vez se divide y se saca el resto y sale la tercera cifra
        cuartaCifra = numero % 10;//Se divide para sacar la cuarta cifra, pero se saca del resto
        
        System.out.println("La primera cifra es: " + primeraCifra);
        System.out.println("La segunda cifra es: " + segundaCifra);
        System.out.println("La tercera cifra es: " + terceraCifra);
        System.out.println("La cuarta cifra es: " + cuartaCifra);
    }
    
}
