
package ejercicio4t6;

/**
 * Clase Lobo
 * 
 * @author Daniel
 */
public class Lobo extends Canido {

    //Constructores
    public Lobo() {
        super();
    }

    public Lobo(String nombre, int edad, int peso) {
        super(nombre, edad, peso);
    }
    
    //Métodos
    @Override
    public void mostrarSonido() {
        System.out.println("Su sonido es el aullido");
    }

    @Override
    public void mostrarAlimentacion() {
        System.out.println("Su alimentación es carnívora");
    }

    @Override
    public void mostrarHabitat() {
        System.out.println("Su hábitat es el bosque");
    }

    @Override
    public void mostrarNombreCientifico() {
        System.out.println("Su nombre científico es Canis lupus");
    }

    @Override
    public String toString() {
        return "Lobo: " + super.toString() ;
    }
    
}
