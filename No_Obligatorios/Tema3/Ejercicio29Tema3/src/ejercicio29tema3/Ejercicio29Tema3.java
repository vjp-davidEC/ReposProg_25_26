/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio29tema3;
import java.util.Scanner;

/**
 *
 * @author DAVID
 */
public class Ejercicio29Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numeroSecreto;
        int intentos = 0;
        int intentosUsuario = 0;
        
        numeroSecreto = (int) (Math.random() * 100) + 1;
        
        System.out.println("Adivina el numero entre 1 y 100");
        
        while (intentosUsuario != numeroSecreto) {
            System.out.print("Por favor, introduce un numero para averiguarlo: ");//Lo que pedimos al usuario
            intentosUsuario = entrada.nextInt();
            intentos++;
            
            if (intentosUsuario < numeroSecreto) {
                System.out.println("El numero es mayor");//Ver si es mayor o menor
            }else if (intentosUsuario > numeroSecreto) {
                System.out.println("El numero es menor");
            }else {
                System.out.println("Correctooo, has adivinado el numero");//Acierto
                System.out.println("Numero de intentos: " + intentos);//Resultado
            }
        }
    }
}
