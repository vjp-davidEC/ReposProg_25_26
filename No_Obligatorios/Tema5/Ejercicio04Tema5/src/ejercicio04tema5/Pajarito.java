/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04tema5;

/**
 *
 * @author DAVID
 */
public class Pajarito {
    private static  int numPajaros = 0;//Sirve para cntar cuantos objetos se han creado en total
    
    //Los atributos privados de cada pajarito
    private String color;
    private int edad;
    
    //Método para incrementar el contador de pajaritos
    public static void nuevoPajaro(){
        numPajaros++;
    }
    
    //Método para establecer color y edad de un pajarito
    public void establecerColoryEdad(String col, int ed){
        color = col;
        edad = ed;
        nuevoPajaro();
    }
    
    //Método para mostrar el numero total de pajaritos creados
    public static String muestraPajaros(){
        return "El numero de objetos creados es de: " + numPajaros;
    }
}