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
    //Constructores
    public TrianguloRectangulo(){
        super();
    }
    
    public TrianguloRectangulo(String color, double base, double altura){
        super(color, base, altura);
    }
    
    //Implementación del método abstracto calcularArea()
    @Override
    public double calcularArea(){
        return (getBase() * getAltura()) / 2;
    }
    //Implementación del método abstracto calcularPerimetro()
    @Override
    public double calcularPerimetro(){
        return getBase() + getAltura() + calcularHipotenusa();
    }
    
    //Método específico para calcular la hipotenusa usando el teorema de Pitágoras
    public double calcularHipotenusa(){
        return Math.sqrt(getBase() * getBase() + getAltura() * getAltura());
    }
    
    //Método para determinar el tipo de triángulo
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