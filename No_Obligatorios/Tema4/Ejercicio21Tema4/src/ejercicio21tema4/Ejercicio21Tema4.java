/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21tema4;
import java.util.Scanner;

/**
 *
 * @author DAVID
 */
public class Ejercicio21Tema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1 = pedirPrimerNumero();//Llamo al metodo pedirPrimerNumero y lo guardo con un int
        int numero2 = pedirSegundoNumero(numero1);//Llamo al metodo pedirSegundoNumero pasando el numero1 como parametro y lo guardo con un int
        
        mostrarSumaPares(numero1, numero2);//Llamo al metodo mostrarSumaPares pasando el numero1 y 2 como parametro
    }
    public static int pedirPrimerNumero() {//Metodo que pide al usuario que introduzca el numero1 y devuelve el numero1 al metodo
        Scanner entrada = new Scanner(System.in);
        System.out.print("Por favor, introduce el primer numero: ");
        return entrada.nextInt();
    }
    public static int pedirSegundoNumero(int numero1) {//Metodo que pide al usuario el numero2 y que sea mayor que el numero1
        Scanner entrada = new Scanner(System.in);
        int numero2;
        
        do {//Repetir hasta que el numero2 sea mayor que el numero1
            System.out.print("Por favor, introduzca el segundo numero: ");
            numero2 = entrada.nextInt();
            if (numero2 <= numero1) {//Si el numero2 es menor que el numero1, saldra un error
                System.out.println("Intentalo de nuevo...El segundo numero debe ser mayor que el primer numero");
            }
        } while (numero2 <= numero1);//Repetir hasta que lo ponga bien
        return numero2;//Devolver el numero2 valido al metodo
    }
    public static void mostrarSumaPares(int numero1, int numero2) {//Metodo que calcula y muestra la suma de los numeros pares entre el numero1 y numero2
        int suma = 0;
        int i;
        
        for (i = numero1 + 1; i < numero2; i++) {//Bucle que recorre los numeros entre el numero1 y numero2
            if (i % 2 == 0) {//Si es par se suma
                suma += i;
            }
        }
        System.out.println("La suma de los numeros pares entre " + numero1 + " y " + numero2 + " es: " + suma);//Resultado
    }
}