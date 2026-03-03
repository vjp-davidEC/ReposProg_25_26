/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio28tema3;

/**
 *
 * @author DAVID
 */
public class Ejercicio28Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double aleatorio;
        int numero;
        
        aleatorio = Math.random() * 100 + 1;
        numero = (int) Math.floor(aleatorio);
        
        System.out.println("Numero aleatorio generado: " + numero);//Mostrar el numero generado
        
        if (numero % 2 == 0) {
            System.out.println("El numero es par");//Comprobacion del numero par
        }else {
            System.out.println("El numero es impar");//Comprobacion del numero impar
        }
    }
}
