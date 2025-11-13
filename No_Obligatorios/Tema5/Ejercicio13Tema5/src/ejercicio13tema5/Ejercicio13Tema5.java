/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13tema5;

/**
 *
 * @author DAVID
 */
public class Ejercicio13Tema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Objeto de la clase Saludo
        Saludo sal = new Saludo();
        
        //Bucle for que se repetira 5 veces 
        for (int i = 0; i < 5; i++){
            sal.mostrarSaludo();//Lo que se va a imprimir 5 veces de la clase Saludo
        }
    } 
}