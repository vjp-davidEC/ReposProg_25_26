
package ejercicio3t6;

/**
 * Clase Cuadrado
 * 
 * @author Daniel
 */
public class Cuadrado extends FiguraGeometrica {
    
    //Atributos
    private int lado;
    
    //Constructores
    public Cuadrado() {
        super();
        this.lado = 0;
    }

    public Cuadrado(String color, int lado) {
        super(color);
        this.lado = lado;
    }
    
    //Getters / Setters
    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    
    
    //Métodos
    @Override
    public void calcularArea() {
        int area = lado * lado;
        System.out.println("Área del cuadrado: " + area);
    }

    @Override
    public void calcularPerimetro() {
        int perimetro = 4 * lado;
        System.out.println("Perímetro del cuadrado: " + perimetro);        
    }
    
    //toString
    @Override
    public String toString() {
        return super.toString() + ". Cuadrado{" + "lado=" + lado + '}';
    }
    

}
