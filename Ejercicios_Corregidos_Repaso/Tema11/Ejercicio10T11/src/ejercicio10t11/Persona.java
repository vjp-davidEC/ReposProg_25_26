
package ejercicio10t11;

/**
 * Clase Persona
 * 
 * @author Usuario
 */
public class Persona implements Comparable<Persona> {
    
    //Atributos
    private String nombre;
    private int edad;
    
    //Constructores
    public Persona() {
        this.nombre = "";
        this.edad = 0;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //Getters/Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //toString()
    @Override
    public String toString() {
        return "Nombre=" + nombre + ", Edad=" + edad;
    }

    @Override
    public int compareTo(Persona p) {
        if(this.edad < p.getEdad()) {
            return -1;
        } else if(this.edad > p.getEdad()) {
            return 1;
        } else {
            return 0;
        }
    }
}
