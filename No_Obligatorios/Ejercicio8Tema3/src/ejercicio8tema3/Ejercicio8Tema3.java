/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8tema3;
import java.util.Scanner;
/**
 *
 * @author DAVID
 */
public class Ejercicio8Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int importe;
        int cantidadDinero;
        int billeteCincuenta;
        int billeteVeinte;
        int billeteDiez;
        int billeteCinco;
        int monedasDos;
        int monedasUno;
        
        System.out.println("Por favor, indique una cantidad de dinero: ");
        importe = entrada.nextInt();
        cantidadDinero = importe;//Lo pongo para que el importe que ponga el cliente sea la cantidad del dinero y se pueda hacer las operaciones y en System.out.println salga el otra vez el importe que puso el cliente
        
        billeteCincuenta = cantidadDinero / 50;
        cantidadDinero %= 50;//Esta puesto para que el resto del dinero que falta se vaya a la cantida del dinero total y se hace igual que en todas las demas operaciones
        
        billeteVeinte = cantidadDinero / 20;
        cantidadDinero %= 20;
        
        billeteDiez = cantidadDinero / 10;
        cantidadDinero %= 10;
        
        billeteCinco = cantidadDinero / 5;
        cantidadDinero %= 5;
        
        monedasDos = cantidadDinero / 2;
        cantidadDinero %= 2;
        
        monedasUno = cantidadDinero;
        
        System.out.println("");//Lo pongo para que haya una separacion y se vea mejor el resultado
        System.out.println(importe + " Euros se descomponen en: ");
        
        if (billeteCincuenta  > 0){
            System.out.println("Billetes de 50: " + billeteCincuenta);
        }if (billeteVeinte > 0){
            System.out.println("Billete de 20: " + billeteVeinte);
        }if (billeteDiez > 0){
            System.out.println("Billete de 10: " + billeteDiez);
        }if (billeteCinco > 0){
            System.out.println("Billete de 5: " + billeteCinco);
        }if (monedasDos > 0){
            System.out.println("Monedas de 2 euros: " + monedasDos);
        }if (monedasUno > 0){
            System.out.println("Monedas de 1 euro: " + monedasUno);
        }
    }
    
}
