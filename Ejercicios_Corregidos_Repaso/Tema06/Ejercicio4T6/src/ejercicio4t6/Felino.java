package ejercicio4t6;

/**
 * Clase Felino
 * 
 * @author Daniel
 */
public abstract class Felino extends Animal {

    //Constructores
    public Felino() {
        super();
    }

    public Felino(String nombre, int edad, int peso) {
        super(nombre, edad, peso);
    }
    
    //toString
    @Override
    public String toString() {
        return "Felino: " + super.toString();
    }   
    
}
