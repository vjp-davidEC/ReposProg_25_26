/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio30tema3;
import java.util.Scanner;

public class Ejercicio30Tema3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numeroSecreto;
        int intentos = 0;
        int intentosUsuario = 0;

        numeroSecreto = (int) (Math.random() * 100) + 1;

        System.out.println("Adivina el numero entre 1 y 100");

        while (intentosUsuario != numeroSecreto) {
            System.out.print("Por favor, introduce un numero para averiguarlo: ");
            try {
                intentosUsuario = entrada.nextInt();//Lee la línea completa
                intentos++;
                
                if (intentosUsuario < numeroSecreto) {
                    System.out.println("El numero es mayor");
                } else if (intentosUsuario > numeroSecreto) {
                    System.out.println("El numero es menor");
                } else {
                    System.out.println("Correctooo, has adivinado el numero");
                    System.out.println("Numero de intentos: " + intentos);
                }
            } catch (NumberFormatException e) {//Captura si el usuario no introduce un número válido
                System.out.println("Error: Debes introducir un numero valido.");
                intentos++;//Cuenta como intento
            }
        }
    }
}