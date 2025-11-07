/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04tema5;

/**
 *
 * @author DAVID
 */
public class Ejercicio04Tema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pajarito p1 = new Pajarito();//Crear el primer objeto
        Pajarito p2 = new Pajarito();//Crear el segundo objeto
        p1.establecerColoryEdad("rojo", 1);//Establecer color y edad del primer pajarito
        p2.establecerColoryEdad("azul", 2);//Establecer color y edad del segundo pajarito
        Pajarito.muestraPajaros();//Mostrar el número total de pajaritos creados
    }
}