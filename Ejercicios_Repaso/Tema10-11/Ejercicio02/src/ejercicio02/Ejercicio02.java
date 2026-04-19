package ejercicio02;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Ejercicio02 {

    public static final int PERSONAS = 5;
    public static final int EDAD = 18;
    
    public static void main(String[] args) {
        TreeSet<Persona> conjuntoPersona = new TreeSet<>();
        aniadirPersonas(conjuntoPersona);
        mostrarEdadOrdenado(conjuntoPersona);
        eliminarPersonasMenorDeEdad(conjuntoPersona);
        mostrarSet(conjuntoPersona);
    }
    
    public static void aniadirPersonas(TreeSet<Persona> conjuntoPersona) {
        System.out.println("Aniadiendo personas...");
        for (int i = 0; i < PERSONAS; i++) {
            conjuntoPersona.add(new Persona(pedirNombre(), pedirEdad()));
            System.out.println("---");
        }
    }
    
    public static void mostrarEdadOrdenado(TreeSet<Persona> conjuntoPersona) {
        System.out.println();
        
        if (conjuntoPersona.isEmpty()) {
            System.out.println("No hay ninguna edad en el conjunto");
        } else {
            for (Persona persona : conjuntoPersona) {
                System.out.println(persona.toString());
            }
        }
    }
    
    public static void eliminarPersonasMenorDeEdad(TreeSet<Persona> conjuntoPersona) {
        System.out.println();
        
        if (conjuntoPersona.isEmpty()) {
            System.out.println("No hay nadie en el conjunto");
        } else {
            Iterator<Persona> it = conjuntoPersona.iterator();
            
            while (it.hasNext()) {
                Persona persona = it.next();
                if (persona.getEdad() < EDAD) {
                    it.remove();
                }
            }
        }
    }
    
    public static void mostrarSet(TreeSet<Persona> conjuntoPersona) {
        System.out.println("");
        
        if (conjuntoPersona.isEmpty()) {
            System.out.println("No hay nadie en el conjunto");
        } else {
            for (Persona persona : conjuntoPersona) {
                System.out.println(persona.toString());
            }
        }
    }
    
    
    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre de la persona: ");
        return entrada.nextLine();
    }
    public static int pedirEdad() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Edad de la persona: ");
        return entrada.nextInt();
    }
}