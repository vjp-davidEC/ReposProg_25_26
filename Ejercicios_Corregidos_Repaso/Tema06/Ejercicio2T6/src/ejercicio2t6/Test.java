
package ejercicio2t6;

/**
 * Clase Test
 * 
 * @author Daniel
 */
public class Test {
    
    public static void main(String[] args) {
        
        Profesor profesor = new Profesor("Daniel", "Informática");
        System.out.println(profesor.saludar());     
        
        Alumno alumno = new Alumno("Pepe", "1º DAM");
        System.out.println(alumno.saludar());  
        
        //Polimorfismo
        System.out.println("\n*** POLIMORFISMO ***");
        Persona personaProfesor = new Profesor("Daniel", "Informática");
        System.out.println(personaProfesor.saludar()); 
        
        Persona personaAlumno = new Alumno("Pepe", "1º DAM");
        System.out.println(personaAlumno.saludar());

    }
    
}
