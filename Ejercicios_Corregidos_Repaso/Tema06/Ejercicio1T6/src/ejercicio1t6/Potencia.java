
package ejercicio1t6;

/**
 * Clase Potencia
 * 
 * @author Daniel
 */
public class Potencia extends Calculadora {
    
    //Atributos
    private int exponente;
    
    //Constructores
    public Potencia() {
        super();
        this.exponente = 0;
    }

    public Potencia(int numero, int exponente) {
        super(numero);
        this.exponente = exponente;
    }
    
    //Getters / Setters
    public int getExponente() {
        return exponente;
    }

    public void setExponente(int exponente) {
        this.exponente = exponente;
    }
       
    //Métodos  
    @Override
    public void realizarOperacion() {
        double resultado = Math.pow(getNumero(), exponente);
        System.out.println("Potencia: " + resultado);
    }
    
    //toString
    @Override
    public String toString() {
        return super.toString() + ". Potencia{" + "exponente=" + exponente + '}';
    }
     
}
