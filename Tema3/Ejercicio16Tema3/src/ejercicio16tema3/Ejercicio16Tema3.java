/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16tema3;

/**
 *
 * @author DAVID
 */
public class Ejercicio16Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeroImparesPedidos = 0;//Contador de los numeros impares imprimidos
        int i;
        
        System.out.println("Numeros impares entre 20 y 160:");
        
        for (i = 21; i < 160; i += 2){//Empieza en el 21 y se va subando de dos en dos hasta que sea menor que 160
            System.out.println(i + " ");
            numeroImparesPedidos++;
        }
        System.out.println("La cantidad de numeros impares impresos han sido: " + numeroImparesPedidos);//Resultado
    }
}
