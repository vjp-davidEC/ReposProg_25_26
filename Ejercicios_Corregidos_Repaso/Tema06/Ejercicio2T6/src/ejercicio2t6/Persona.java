
package ejercicio2t6;

/**
 * Clase Persona
 * 
 * @author Usuario
 */
public abstract class Persona {
    
    //Atributos
    private String nombre;
    
    //Constructores
    public Persona() {
        this.nombre = "";
    }
    
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    //Getters / Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Métodos abstractos
    public abstract String saludar();
    
    //toString
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + '}';
    }
   
}
