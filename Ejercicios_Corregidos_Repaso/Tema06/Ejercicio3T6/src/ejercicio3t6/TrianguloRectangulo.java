
package ejercicio3t6;

/**
 * Clase Triangulo
 * 
 * @author Daniel
 */
public class TrianguloRectangulo extends Triangulo {
    
    //Constructores
    public TrianguloRectangulo() {
        super();
    }

    public TrianguloRectangulo(String color, int base, int altura) {
        super(color, base, altura);
    }
        
    //Métodos
    @Override
    public void calcularPerimetro() {
        double perimetro = getBase() + getAltura() + obtenerHipotenusa();
        System.out.println("Perímetro del triángulo: " + perimetro);        
    }
    
    /**
     * Método que calcula y devuelve la hipotenusa de un triángulo rectángulo utilizando el
     * teorema de Pitágoras (base y altura son los catetos).
     * 
     * @return Hipotenusa de un triángulo rectángulo 
     */
    public double obtenerHipotenusa(){
        return Math.hypot(getBase(), getAltura());
    }
    
    /**
     * Método que determina qué tipo de triángulo es:
     * - Equilátero: sus tres lados son iguales.
     * - Escaleno: sus tres lados son todos diferentes.
     * - Isósceles: dos de sus lados son iguales y otro diferente.
     */
    public void determinarTipoTriangulo() {
        if((getBase() == getAltura()) 
                && (getBase() == obtenerHipotenusa())) {
            System.out.println("Es un triángulo equilátero");
        } else if((getBase() != getAltura()) 
                && (getBase() != obtenerHipotenusa()) 
                && (getAltura() != obtenerHipotenusa())) {
            System.out.println("Es un triángulo escaleno");
        } else {
            System.out.println("Es un triángulo isósceles");
        }
    }
    
    //toString
    @Override
    public String toString() {
        return "TrianguloRectangulo: " + super.toString();
    }
    
    
}
