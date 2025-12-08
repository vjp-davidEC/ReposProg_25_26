
package ejercicio4t6;

/**
 * Clase Animal
 * 
 * @author Daniel
 */
public abstract class Animal {
    
    //Atributos
    private String nombre;
    private int edad;
    private int peso;
    
    //Constructores
    public Animal() {
        this.nombre = "";
        this.edad = 0;
        this.peso = 0;
    }
    
    public Animal(String nombre, int edad, int peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }   
    
    //Getters / Setters
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

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    //Métodos abstractos
    public abstract void mostrarSonido();
    
    public abstract void mostrarAlimentacion();
    
    public abstract void mostrarHabitat();
    
    public abstract void mostrarNombreCientifico();
    
    //toString
    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + '}';
    }    
    
}
