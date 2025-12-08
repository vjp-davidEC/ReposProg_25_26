
package ejercicio4t6;

/**
 * Clase Perro
 * 
 * @author Daniel
 */
public class Perro extends Canido {

    //Constructores
    public Perro() {
        super();
    }

    public Perro(String nombre, int edad, int peso) {
        super(nombre, edad, peso);
    }
    
    //Métodos
    @Override
    public void mostrarSonido() {
        System.out.println("Su sonido es el ladrido");
    }

    @Override
    public void mostrarAlimentacion() {
        System.out.println("Su alimentación es carnívora");
    }

    @Override
    public void mostrarHabitat() {
        System.out.println("Su hábitat es doméstico");
    }

    @Override
    public void mostrarNombreCientifico() {
        System.out.println("Su nombre científico es Canis lupus familiaris");
    }

    @Override
    public String toString() {
        return "Perro: " + super.toString() ;
    }
   
    
}
