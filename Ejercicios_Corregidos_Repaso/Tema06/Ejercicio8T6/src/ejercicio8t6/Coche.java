
package ejercicio8t6;

/**
 * Clase Coche
 * 
 * @author Daniel
 */
public class Coche extends Vehiculo {

    //Atributos
    private boolean aireEncendido;
    
    //Constructores
    public Coche() {
        super();
    }

    public Coche(int velocidad) {
        super(velocidad);
        this.aireEncendido = false;
    }
    
    //Getters / Setters
    public boolean isAireEncendido() {
        return aireEncendido;
    }

    public void setAireEncendido(boolean aireEncendido) {
        this.aireEncendido = aireEncendido;
    }
    
    //Métodos
    @Override
    public void mostrarMovimiento() {
        System.out.println("El coche está circulando a " + getVelocidad() + "km/h.");
    }
    
    public void encenderAire() {
        if(!aireEncendido) {
            aireEncendido = true;
            System.out.println("El coche ha encendido el aire. La velocidad se reduce.");
            setVelocidad(getVelocidad() - 10);
        } else {
            System.out.println("El aire ya está encendido");
        }
    }
    
    //toString
    @Override
    public String toString() {
        return super.toString() + ". Coche{" + "aireEncendido=" + aireEncendido + '}';
    }
    
}
