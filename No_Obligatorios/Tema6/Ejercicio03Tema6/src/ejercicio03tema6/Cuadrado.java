/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03tema6;

/**
 *
 * @author DAVID
 */
public class Cuadrado extends FiguraGeometrica{
    private double lado;
    
    public Cuadrado(){
        super();
        lado = 0;
    }
    
    public Cuadrado(String color, double lado){
        super(color);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "lado=" + lado + '}';
    }
    
    @Override
    public double calcularArea(){
        return lado * lado;
    }
    
    @Override
    public double calcularPerimetro(){
        return 4 * lado;
    }
}