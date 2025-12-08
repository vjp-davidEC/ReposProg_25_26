
package ejercicio1t6;

/**
 * Clase Suma
 * 
 * @author Daniel
 */
public class Suma extends Calculadora {
    
    //Atributos
    private int sumando;
    
    //Constructores
    public Suma() {
        super();
        this.sumando = 0;
    }

    public Suma(int numero, int sumando) {
        super(numero);
        this.sumando = sumando;
    }
    
    //Getters / Setters
    public int getSumando() {
        return sumando;
    }

    public void setSumando(int sumando) {
        this.sumando = sumando;
    }
    
    //Métodos  
    @Override
    public void realizarOperacion() {
        int resultado = getNumero() + sumando;
        System.out.println("Suma: " + resultado);
    }
    
    //toString
    @Override
    public String toString() {
        return super.toString() + ". Suma{" + "sumando=" + sumando + '}';
    }
     
}
