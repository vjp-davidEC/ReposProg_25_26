
package ejercicio4t6;

/**
 * Clase Leon
 * 
 * @author Daniel
 */
public class Leon extends Felino {

    //Constructores
    public Leon() {
        super();
    }

    public Leon(String nombre, int edad, int peso) {
        super(nombre, edad, peso);
    }
    
    //Métodos
    @Override
    public void mostrarSonido() {
        System.out.println("Su sonido es el rugido");
    }

    @Override
    public void mostrarAlimentacion() {
        System.out.println("Su alimentación es carnívora");
    }

    @Override
    public void mostrarHabitat() {
        System.out.println("Su hábitat es la sabana");
    }

    @Override
    public void mostrarNombreCientifico() {
        System.out.println("Su nombre científico es Panthera leo");
    }

    @Override
    public String toString() {
        return "Leon: " + super.toString() ;
    }
    
}
