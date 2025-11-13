/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12tema5;

/**
 *
 * @author DAVID
 */
public class Triangulo {
    //Atributos privados de la clase
    private double cateto1;
    private double cateto2;
    
    //Constructor que inicializa el triangulo con los valores de sus dos catetos
    public Triangulo(){
        cateto1 = 0;
        cateto2 = 0;
    }
    
    public Triangulo(double c1, double c2){
        cateto1 = c1;
        cateto2 = c2;
    }
    
    //Método para calcular la hipotenusa con el teorema de Pitágoras
    public double calcularHipotenusa(){
        return Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
    }
    
    //Mostrar
    public void mostrarTriangulo(){
        System.out.println(cateto1);
        System.out.println(cateto2);
    }
}