/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03tema6;

/**
 *
 * @author DAVID
 */
public abstract class FiguraGeometrica {
    //Atributo
    private String color;
    
    //Constructores
    public FiguraGeometrica(){
        color = "";
    }

    public FiguraGeometrica(String color) {
        this.color = color;
    }
    
    //Getter/Setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    //Mostrar
    @Override
    public String toString() {
        return "FiguraGeometrica{" + "color=" + color + '}';
    }
    
    //Métodos abstractos
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
}