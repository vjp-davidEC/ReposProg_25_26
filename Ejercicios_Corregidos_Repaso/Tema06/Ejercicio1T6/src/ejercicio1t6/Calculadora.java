
package ejercicio1t6;

/**
 * Clase Calculadora
 * 
 * @author Daniel
 */
public abstract class Calculadora {
    
    //Atributos
    private int numero;
    
    //Constructores
    public Calculadora() {
        this.numero = 0;
    }
    
    public Calculadora(int numero) {
        this.numero = numero;
    }
    
    //Getters / Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    //Métodos abstractos
    public abstract void realizarOperacion();
    
    //toString
    @Override
    public String toString() {
        return "Calculadora{" + "numero=" + numero + '}';
    }   
    
}
