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
    //Atributo
    private double radio;
    
    //Contructores
    public Circulo(){
        super();
        radio = 0;
    }

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    //Getter/Setter
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    //Mostrar
    @Override
    public String toString() {
        return super.toString() + "Circulo{" + "radio=" + radio + '}';
    }
    
    //Implementación del método abstracto calcularArea()
    @Override
    public double calcularArea(){
        return Math.PI * (radio * radio);
    }
    //Implementación del método abstracto calcularPerimetro()
    @Override
    public double calcularPerimetro(){
        return 2 * Math.PI * radio;
    }
}