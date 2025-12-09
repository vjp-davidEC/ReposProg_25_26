
package ejercicio3t6;

/**
 * Clase Test
 * 
 * @author Daniel
 */
public class Test {
    
    public static void main(String[] args) {
        
        System.out.println("*** CUADRADO ***");
        Cuadrado cuadrado = new Cuadrado("azul", 5);
        cuadrado.calcularArea();
        cuadrado.calcularPerimetro();
        
        System.out.println("\n*** RECTÁNGULO ***");
        Rectangulo rectangulo = new Rectangulo("rojo", 5, 2);
        rectangulo.calcularArea();
        rectangulo.calcularPerimetro();
        
        System.out.println("\n*** TRIÁNGULO RECTÁNGULO ***");
        TrianguloRectangulo trianguloRectangulo = new TrianguloRectangulo("verde", 5, 5);
        trianguloRectangulo.calcularArea();
        System.out.println("Hipotenusa: " + trianguloRectangulo.obtenerHipotenusa());
        trianguloRectangulo.calcularPerimetro();
        trianguloRectangulo.determinarTipoTriangulo();
        
        System.out.println("\n------ POLIMORFISMO ------");
        
        System.out.println("*** CUADRADO ***");
        FiguraGeometrica figuraCuadrado = new Cuadrado("azul", 5);
        figuraCuadrado.calcularArea();
        figuraCuadrado.calcularPerimetro();
        
        System.out.println("\n*** RECTÁNGULO ***");
        FiguraGeometrica figuraRectangulo = new Rectangulo("rojo", 5, 2);
        figuraRectangulo.calcularArea();
        figuraRectangulo.calcularPerimetro();
        
        System.out.println("\n*** TRIÁNGULO RECTÁNGULO ***");
        FiguraGeometrica figuraTrianguloRectangulo = new TrianguloRectangulo("verde", 5, 5);
        figuraTrianguloRectangulo.calcularArea();
        figuraTrianguloRectangulo.calcularPerimetro();
        
        //No se pueden invocar a estos métodos ya que no están definidos en la superclase
        //System.out.println("Hipotenusa: " + figuraTrianguloRectangulo.obtenerHipotenusa());
        //figuraTrianguloRectangulo.determinarTipoTriangulo();
    
    }
    
}
