
package ejercicio3t6;

/**
 * Clase Rectangulo
 * 
 * @author Daniel
 */
public class Rectangulo extends FiguraGeometrica {
    
    //Atributos
    private int base;
    private int altura;
    
    //Constructores
    public Rectangulo() {
        super();
        this.base = 0;
        this.altura = 0;
    }

    public Rectangulo(String color, int base, int altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }
    
    //Getters / Setters
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
        
    //Métodos
    @Override
    public void calcularArea() {
        int area = base * altura;
        System.out.println("Área del rectángulo: " + area);
    }

    @Override
    public void calcularPerimetro() {
        int perimetro = (2 * base) + (2 * altura);
        System.out.println("Perímetro del rectángulo: " + perimetro);        
    }
    
    //toString
    @Override
    public String toString() {
        return super.toString() + ". Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    
}
