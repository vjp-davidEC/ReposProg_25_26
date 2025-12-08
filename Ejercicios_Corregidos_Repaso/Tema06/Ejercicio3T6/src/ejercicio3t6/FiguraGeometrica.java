
package ejercicio3t6;

/**
 * Clase FiguraGeometrica
 * 
 * @author Daniel
 */
public abstract class FiguraGeometrica {
    
    //Atributos
    private String color;
    
    //Constructores
    public FiguraGeometrica() {
        this.color = "";
    }
    
    public FiguraGeometrica(String color) {
        this.color = color;
    }
    
    //Getters / Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    //Métodos abstractos
    public abstract void calcularArea();
    
    public abstract void calcularPerimetro();
    
    //toString
    @Override
    public String toString() {
        return "FiguraGeometrica{" + "color=" + color + '}';
    }
       
    
}
