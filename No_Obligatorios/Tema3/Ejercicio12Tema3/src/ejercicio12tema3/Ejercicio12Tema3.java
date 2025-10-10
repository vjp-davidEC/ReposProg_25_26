/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12tema3;

/**
 *
 * @author alumno
 */
public class Ejercicio12Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero = 12;//Lo pongo porque es el primer numero par despues del 11
        
        do {
            System.out.println (numero);
            numero += 2;//Lo que hace es que salte dos hasta el siguiente numero par
        } while (numero <= 133);
    }
}
