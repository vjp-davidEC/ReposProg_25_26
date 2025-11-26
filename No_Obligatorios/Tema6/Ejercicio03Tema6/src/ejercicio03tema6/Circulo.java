/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03tema6;

/**
 *
 * @author DAVID
 */
public class Circulo extends FiguraGeometrica{
    private double radio;
    
    public Circulo(){
        super();
        radio = 0;
    }

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }
    
    @Override
    public double calcularArea(){
        return Math.PI * (radio * radio);
    }
    
    @Override
    public double calcularPerimetro(){
        return 2 * Math.PI * radio;
    }
}