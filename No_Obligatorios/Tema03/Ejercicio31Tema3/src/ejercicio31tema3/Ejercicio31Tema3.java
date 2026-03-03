/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio31tema3;

/**
 *
 * @author DAVID
 */
public class Ejercicio31Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        int numeroImpares = 0;
        int numerogenerado = 0;
        int impar1 = 0, impar2 = 0, impar3 = 0;//Para guadar los 3 impares
        
        do {
            numero = (int)(Math.random() * 100) + 1;//Generar numero entre 1 y 100
            numerogenerado++;
            
            if (numero % 2 != 0) {//Si es impar
                numeroImpares++;
                
                if (numeroImpares == 1) {//Guardar los impares segun el orden
                    impar1 = numero;
                }else if (numeroImpares == 2) {
                    impar2 = numero;
                }else if (numeroImpares == 3) {
                    impar3 = numero;
                }
            }
        } while (numeroImpares < 3);
        System.out.println("Los tres numeros impares son: " + impar1 + ", " + impar2 + " y " + impar3);
        System.out.println("Se generaron un total de " + numerogenerado + " numeros para obtenerlos");
    }
}
