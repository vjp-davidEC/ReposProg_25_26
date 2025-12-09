
package ejercicio1t6;

/**
 * Clase Multiplicacion
 * 
 * @author Daniel
 */
public class Multiplicacion extends Calculadora {
    
    //Atributos
    private int multiplicando;
    
    //Constructores
    public Multiplicacion() {
        super();
        this.multiplicando = 0;
    }

    public Multiplicacion(int numero, int multiplicando) {
        super(numero);
        this.multiplicando = multiplicando;
    }
    
    //Getters / Setters
    public int getMultiplicando() {
        return multiplicando;
    }

    public void setMultiplicando(int multiplicando) {
        this.multiplicando = multiplicando;
    }
      
    //Métodos  
    @Override
    public void realizarOperacion() {
        int resultado = getNumero() * multiplicando;
        System.out.println("Multiplicacion: " + resultado);
    }
    
    //toString
    @Override
    public String toString() {
        return super.toString() + ". Multiplicacion{" + "multiplicando=" + multiplicando + '}';
    }
     
}
