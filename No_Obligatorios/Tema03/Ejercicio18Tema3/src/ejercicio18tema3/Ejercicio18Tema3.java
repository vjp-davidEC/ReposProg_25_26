/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18tema3;
import java.util.Scanner;

/**
 *
 * @author DAVID
 */
public class Ejercicio18Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int contraseniaCorrecta = 2511;//Contrasenia numerica
        int contrasenia;//Lo que va a introducir el usuario
        int intentos = 0;
        boolean acceso = false;
        
        do {
            System.out.print("Introduce la contrasenia, tiene que ser en numero: ");//Lo que le pedimos que introduzca
            contrasenia = entrada.nextInt();
            intentos++;
            
            if (contrasenia == contraseniaCorrecta) {
                acceso = true;
            }else {
                System.out.println("Contrasenia incorrecta. Intento " + intentos + " de 3");
            }
        }while (!acceso && intentos < 3);//Es el bucle de los intentos que va a tener el usuario
        
        if (acceso) {
            System.out.println("Enhorabuena, has accedido correctamente");//Resultado de la contrasenia correcta
        }else {
            System.out.println("Has agotado los 3 intentos. Acceso denegado");//Resultado de la contraseña incorrecta
        }
    }
}
