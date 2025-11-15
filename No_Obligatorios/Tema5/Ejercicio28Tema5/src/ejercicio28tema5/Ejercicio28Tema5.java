/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio28tema5;
import java.util.Scanner;

/**
 *
 * @author DAVID
 */
public class Ejercicio28Tema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double kms, litros, vmed, pgas;//Variables
        
        //Pedir al usuario la distancia recorrida, los litros de combustibles consumidos, la velocidad media y el precio de la gasolina por litro
        System.out.println("Introduce los datos del viaje");
        System.out.print("Kilometros recorridos: ");
        kms = entrada.nextDouble();
        System.out.print("Litros consumidos:  ");
        litros = entrada.nextDouble();
        System.out.print("Velocidad media (km/h): ");
        vmed = entrada.nextDouble();
        System.out.print("Precio de la gasolina (euros/litro): ");
        pgas = entrada.nextDouble();
        
        Consumo viaje = new Consumo(kms, litros, vmed, pgas);//Objeto Consumo que se crea con los datos introducidos
        
        System.out.println("\nResultados del viaje");
        System.out.println("Tiempo realizado: " + viaje.getTiempo());//Tiempo total del viaje
        System.out.println("Consumo medio: " + viaje.consumoMedio());//Consumo medio en litros cada 100km
        System.out.println("Consumo medio: " + viaje.consumoEuros());//Consumo medio en euros cada 100km
    }
}