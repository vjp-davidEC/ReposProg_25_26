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
    //Atributo
    private double lado;
    
    //Contructores
    public Cuadrado(){
        super();
        lado = 0;
    }
    
    public Cuadrado(String color, double lado){
        super(color);
        this.lado = lado;
    }

    //Getter/Setter
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    //Mostrar
    @Override
    public String toString() {
        return super.toString() + "Cuadrado{" + "lado=" + lado + '}';
    }
    
    //Implementación del método abstracto calcularArea()
    @Override
    public double calcularArea(){
        return lado * lado;
    }
    //Implementación del método abstracto calcularPerimetro()
    @Override
    public double calcularPerimetro(){
        return 4 * lado;
    }
}