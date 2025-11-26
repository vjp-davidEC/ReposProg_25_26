/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03tema6;

/**
 *
 * @author DAVID
 */
public class TrianguloRectangulo extends Triangulo{
    
    public TrianguloRectangulo(){
        super();
    }
    
    public TrianguloRectangulo(String color, double base, double altura){
        super(color, base, altura);
    }
    
    @Override
    public double calcularArea(){
        return (getBase() * getAltura()) / 2;
    }
    
    @Override
    public double calcularPerimetro(){
        return getBase() + getAltura() + calcularHipotenusa();
    }
    
    public double calcularHipotenusa(){
        return Math.sqrt(getBase() * getBase() + getAltura() * getAltura());
    }
    
    public String tipoTriangulo(){
        if(getBase() == getAltura() && getBase() == calcularHipotenusa()){
            return "Equilatero";
        }else if(getBase() == getAltura() || getBase() == calcularHipotenusa() || getAltura() == calcularHipotenusa()){
            return "Isosceles";
        }else{
            return "Escaleno";
        }
    }
}