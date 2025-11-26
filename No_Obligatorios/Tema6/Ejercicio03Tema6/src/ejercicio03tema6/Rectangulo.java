/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03tema6;

/**
 *
 * @author DAVID
 */
public class Rectangulo extends FiguraGeometrica{
    //Atributos
    private double base;
    private double altura;
    
    //Constructores
    public Rectangulo(){
        super();
        base = 0;
        altura = 0;
    }
    
    public Rectangulo(String color, double base, double altura){
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
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    
    //Implementación del método abstracto calcularArea()
    @Override
    public double calcularArea(){
        return base * altura;
    }
    //Implementación del método abstracto calcularPerimetro()
    @Override
    public double calcularPerimetro(){
        return 2 * (base + altura);
    }
}