/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14tema3;

/**
 *
 * @author alumno
 */
public class Ejercicio14Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numeroParesImpresos = 0;//Contador de los numeros pares impresos
        int numero = 0;//Es el primer numero par
        
        while (numeroParesImpresos <= 100){//Lo pongo para que tambien entre el 100
            System.out.println(numero);
            numero += 2;//Lo que hace es que se sume 2 para sacar el siguiente numero par
            numeroParesImpresos++;
        }
    }
}
