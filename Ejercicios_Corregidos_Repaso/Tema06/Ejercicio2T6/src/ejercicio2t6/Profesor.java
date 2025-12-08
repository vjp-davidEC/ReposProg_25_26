
package ejercicio2t6;

/**
 * Clase Profesor
 * 
 * @author Daniel
 */
public class Profesor extends Persona {
    
    //Atributos
    private String especialidad;
    
    //Constructores
    public Profesor() {
        super();
        this.especialidad = "";
    }

    public Profesor(String nombre, String especialidad) {
        super(nombre);
        this.especialidad = especialidad;
    }
    
    //Getters / Setters
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    //Métodos
    @Override
    public String saludar() {
        return "Hola, soy el profesor " + getNombre() + " y soy de la especialidad de " + especialidad;
    }
    
    //toString
    @Override
    public String toString() {
        return super.toString() + ". Profesor{" + "especialidad=" + especialidad + '}';
    } 
    
}
