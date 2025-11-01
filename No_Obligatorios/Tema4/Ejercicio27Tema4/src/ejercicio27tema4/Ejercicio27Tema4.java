/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio27tema4;
import java.util.Scanner;

/**
 *
 * @author DAVID
 */
public class Ejercicio27Tema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String eleccion;//Variables
        String resultado;
        
       do {//Bucle que se repite hasta que el usuario acierte
            System.out.print("Por favor, introduce 'cara' o 'cruz': ");//Pedir al usuario que introduzca la eleccion
            eleccion = entrada.nextLine();

            if (Math.random() < 0.5) {//Generar el resultado aleatorio de la moneda
                resultado = "cara";//Si el resultado es menor que 0.5 es cara
            } else {
                resultado = "cruz";//Si el resultado es mayor que 0.5 es cruz
            }
            System.out.println("Resultado: " + resultado);//Mensaje del resultado

            if (eleccion.equals(resultado)) {//Comprobar si el usuario ha acertado y poner un mensaje positivo o sino acierta ponerle otro mensaje
                System.out.println("ENHORABUENAA, Has acertadooo!");
            } else {
                System.out.println("Fallastes, vuelve a intentarlo");
            }
        } while (!eleccion.equals(resultado));//Repetir todas las veces hasta que se acierte
    }
}