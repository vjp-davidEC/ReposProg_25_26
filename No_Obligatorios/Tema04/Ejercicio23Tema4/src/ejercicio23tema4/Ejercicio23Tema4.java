/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23tema4;

/**
 *
 * @author DAVID
 */
public class Ejercicio23Tema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mostrarConstantes();//Llamo al metodo mostrarConstantes que muestra las constantes fisicas
    }
    public static void mostrarConstantes() {//Metodo que imprime en pantalla las tres constantes fisicas que le llegan de la clase Constantes
        System.out.println("Velocidad de la Luz: " + Constantes.VELOCIDADLUZ + " m/s");
        System.out.println("Constante Universal de Gravitacion: " + Constantes.CONSTANTEUNIVERSALGRAVITACION + " N*m2/kg2");
        System.out.println("Constante de Planck: " + Constantes.CONSTANTEPLANCK + " J*s");
    }
}