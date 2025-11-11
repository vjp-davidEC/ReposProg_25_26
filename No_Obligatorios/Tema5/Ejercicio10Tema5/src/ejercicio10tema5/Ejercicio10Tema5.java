/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10tema5;
import java.util.Scanner;
/**
 *
 * @author DAVID
 */
public class Ejercicio10Tema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Variables
        int num1, num2, num3, num4;
        int aux;
        int i;
        
        ////Pedir al usuario que introduzca cuatro nuemeros y se guarden en los objetos de la clase Numero
        System.out.print("Por favor, introduzca el primer numero: ");
        Numero numero1 = new Numero(entrada.nextInt());
        System.out.print("Introduzca el segundo numero: ");
        Numero numero2 = new Numero(entrada.nextInt());
        System.out.print("Introduzca el tercer numero: ");
        Numero numero3 = new Numero(entrada.nextInt());
        System.out.print("Por ultimo, introduzca el cuarto numero: ");
        Numero numero4 = new Numero(entrada.nextInt());
        
        //Obtener los valores de los objetos Numero y asignarles las variables
        num1 = numero1.getValor();
        num2 = numero2.getValor();
        num3 = numero3.getValor();
        num4 = numero4.getValor();
        
        //Bucle for para realizar varias pasadas para ordenar los numeros de menor a mayor
        for (i=1; i<=3; i++) {
            if (num1 > num2) {//Comparacion 1
                aux = num1;
                num1 = num2;
                num2 = aux;
            } if (num2 > num3) {//Comparacion 2
                aux = num2;
                num2 = num3;
                num3 = aux;
            } if (num3 > num4) {//Comparacion 3
                aux = num3;
                num3 = num4;
                num4 = aux;
            }
        }
        System.out.println("Los numeros de menor a mayor son: " + num1 + ", " + num2 + ", " + num3 + ", " + num4);//Resultado
    }
}