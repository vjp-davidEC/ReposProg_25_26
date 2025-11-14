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
    
    //Getters y Setters
    public double getCateto1() {
        return cateto1;
    }

    public void setCateto1(double cateto1) {
        this.cateto1 = cateto1;
    }

    public double getCateto2() {
        return cateto2;
    }

    public void setCateto2(double cateto2) {
        this.cateto2 = cateto2;
    }
    
    
    //Método para calcular la hipotenusa con el teorema de Pitágoras
    public double calcularHipotenusa(){
        return Math.sqrt(getCateto1() * getCateto1() + getCateto2() * getCateto2());
    }
    
    //Mostrar
    public void mostrarTriangulo(){
        System.out.println(getCateto1());
        System.out.println(getCateto2());
    }
}