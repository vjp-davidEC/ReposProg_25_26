
package ejercicio4t6;

/**
 * Clase Gato
 * 
 * @author Daniel
 */
public class Gato extends Felino {

    //Constructores
    public Gato() {
        super();
    }

    public Gato(String nombre, int edad, int peso) {
        super(nombre, edad, peso);
    }
    
    //Métodos
    @Override
    public void mostrarSonido() {
        System.out.println("Su sonido es el maullido");
    }

    @Override
    public void mostrarAlimentacion() {
        System.out.println("Se alimenta de ratones");
    }

    @Override
    public void mostrarHabitat() {
        System.out.println("Su hábitat es doméstico");
    }

    @Override
    public void mostrarNombreCientifico() {
        System.out.println("Su nombre científico es Felis silvestris catus");
    }

    @Override
    public String toString() {
        return "Gato: " + super.toString() ;
    }
    
}
