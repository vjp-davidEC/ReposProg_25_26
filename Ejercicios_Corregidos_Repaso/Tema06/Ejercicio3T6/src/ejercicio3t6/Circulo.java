
package ejercicio3t6;

/**
 * Clase Circulo
 * 
 * @author Daniel
 */
public class Circulo extends FiguraGeometrica {
    
    //Atributos
    private int radio;
    
    //Constructores
    public Circulo() {
        super();
        this.radio = 0;
    }

    public Circulo(String color, int radio) {
        super(color);
        this.radio = radio;
    }
    
    //Getters / Setters
    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    
    //Métodos
    @Override
    public void calcularArea() {
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("Área del círculo: " + area);
    }

    @Override
    public void calcularPerimetro() {
        double perimetro = 2 * Math.PI * radio;
        System.out.println("Perímetro del círculo: " + perimetro);        
    }
    
    //toString
    @Override
    public String toString() {
        return super.toString() + ". Circulo{" + "radio=" + radio + '}';
    }

}
