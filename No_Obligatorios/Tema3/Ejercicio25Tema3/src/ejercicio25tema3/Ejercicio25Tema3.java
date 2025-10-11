/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25tema3;

/**
 *
 * @author DAVID
 */
public class Ejercicio25Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suma = 0;
        int i;
        
        for (i = 18; i < 139; i += 2) {//Empieza por el numero 18, porque es el primer numero par despues de 17
            suma += i;
        }
        System.out.println("La suma de los numeros pares entre 17 y 139 es: " + suma);//Resultado
    }
}
