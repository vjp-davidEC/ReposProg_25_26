/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7tema4;
import java.util.Scanner;
/**
 *
 * @author DAVID
 */
public class Ejercicio7Tema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numero1;
        int numero2;
        int numero3;
        int numero4;
                
        System.out.print("Por favor, introduce el primer numero: ");//Pedir al usuario
        numero1 = entrada.nextInt();
        System.out.print("Ahora, introduce un segundo numero: ");
        numero2 = entrada.nextInt();
        System.out.print("Introduce el tercer numero: ");
        numero3 = entrada.nextInt();
        System.out.print("Por ultimo, introduce un cuarto numero: ");
        numero4 = entrada.nextInt();
                       
        ordenarNumeros(numero1, numero2, numero3, numero4);//Llamar al metodo la misma clase
    }
    public static void ordenarNumeros (int numero1, int numero2, int numero3, int numero4) {//Metodo que recibe los 4 numeros y los ordena de menor a mayor
        int[] numeros = {numero1, numero2, numero3, numero4};//Guardar los 4 numeros dentro de una lista de valores
        int i;
        int j;
        int temp;
        //Metodo burbuja que compara cada numero con el siguiente y los intercambia para ordenarlos
        for (i = 0; i < numeros.length - 1; i++) {//Recorrer la lista varias veces - "numeros.length" sirve para obtener el numero de elementos en una coleccion
            for (j = 0; j < numeros.length - 1 - i; j++) {//Comprobar
                if (numeros[j] > numeros[j + 1]) {//Si el numero es mayor al siguiente - "numeros[j + 1]" sirve para referirse al siguiente elemento de la entruzatura de datos
                    temp = numeros[j];//Guardar el valor temporal
                    numeros[j] = numeros[j + 1];//Mover el menor a la izquierda
                    numeros[j + 1] = temp;//Colocar el mayor a la derecha
                }
            }
        }
        System.out.print("El orden de los numeros introducidos es: ");//Mostrar
        for (i = 0; i < numeros.length; i++) {//Recorrer los numeros ya ordenados
            System.out.print(numeros[i]);//Mostrar cada numero
            if (i < numeros.length - 1) {//Añadir el guion para separarlos
                System.out.print(" - ");
            }
        }
        System.out.println();//Salto de linea
    }
}