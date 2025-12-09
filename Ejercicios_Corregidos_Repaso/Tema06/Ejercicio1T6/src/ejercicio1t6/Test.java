
package ejercicio1t6;

/**
 * Clase Test
 * 
 * @author Daniel
 */
public class Test {
    
    public static void main(String[] args) {
        
        Suma suma = new Suma(2, 5);
        suma.realizarOperacion();     
        
        Multiplicacion multiplicacion = new Multiplicacion(2, 5);
        multiplicacion.realizarOperacion(); 
        
        Potencia potencia = new Potencia(2, 5);
        potencia.realizarOperacion();
        
        //Polimorfismo
        System.out.println("\n*** POLIMORFISMO ***");
        Calculadora cSuma = new Suma(2, 5);
        cSuma.realizarOperacion();
        
        Calculadora cMultiplicacion = new Multiplicacion(2, 5);
        cMultiplicacion.realizarOperacion();
        
        Calculadora cPotencia = new Potencia(2, 5);
        cPotencia.realizarOperacion();
        
    }
    
}
