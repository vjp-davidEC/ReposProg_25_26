/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26tema3;

/**
 *
 * @author DAVID
 */
public class Ejercicio26Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suma = 0;
        int i;
        
        for (i = 111; i <= 222; i++) {//Recorrido entre 111 y 222
            if (i % 2 != 0) {//Verificar si es impar
                suma += i;
            }
        }
        System.out.println("La suma total de los numeros impares entre 111 y 222 es: " + suma);//Resultado
    } 
}
