
package ejercicio2t6;

/**
 * Clase Alumno
 * 
 * @author Daniel
 */
public class Alumno extends Persona {
    
    //Atributos
    private String grupo;
    
    //Constructores
    public Alumno() {
        super();
        this.grupo = "";
    }

    public Alumno(String nombre, String grupo) {
        super(nombre);
        this.grupo = grupo;
    }
    
    //Getters / Setters
    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
  
    //Métodos
    @Override
    public String saludar() {
        return "Hola, soy el alumno " + getNombre() + " y estoy en el grupo de " + grupo;
    }
    
    //toString
    @Override
    public String toString() {
        return super.toString() + ". Alumno{" + "grupo=" + grupo + '}';
    } 
    
}
