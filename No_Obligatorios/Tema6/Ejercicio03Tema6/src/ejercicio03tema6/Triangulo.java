/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03tema6;

/**
 *
 * @author DAVID
 */
public abstract class Triangulo extends FiguraGeometrica{
    //Atributos
    private double base;
    private double altura;
    
    //Contructores
    public Triangulo(){
        super();
        base = 0;
        altura = 0;
    }
    
    public Triangulo(String color, double base, double altura){
        super(color);
        this.base = base;
        this.altura = altura;
    }
    
    //Getters/Setters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //Mostrar
    @Override
    public String toString() {
        return "Triangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
}