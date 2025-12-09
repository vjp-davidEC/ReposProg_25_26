
package ejercicio4t6;

/**
 * Clase Canido
 * 
 * @author Daniel
 */
public abstract class Canido extends Animal {

    //Constructores
    public Canido() {
        super();
    }

    public Canido(String nombre, int edad, int peso) {
        super(nombre, edad, peso);
    }
    
    //toString
    @Override
    public String toString() {
        return "Canido: " + super.toString();
    }   
    
}
