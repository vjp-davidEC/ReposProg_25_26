
package ejercicio10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author d3stroya
 */

/*
        ·-----------------------------------------·
Nombre: | PROG |  LM  | BBDD |  ED  |  SI  | FOL  | 
Nota:   | Nota | Nota | Nota | Nota | Nota | Nota | 
        ·-----------------------------------------·
    
*/
public class Ejercicio10 {
    private final static String[] nombresAsignaturas = {
        "Programación", 
        "Lenguaje de Marcas", 
        "Bases de datos",
        "Entornos de desarrollo",
        "Sistemas informáticos",
        "IPE",
        "Inglés Profesional"
    };   
    
    /**
     * Método que pide al usuario la nota de la asignatura.
     * 
     * @param asignatura
     * @return la nota introducida
     */
    public static int pedirNota(String asignatura) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Por favor, introduzca la nota de " + asignatura + ": ");
        return entrada.nextInt();
    }
    
    /**
     * Método que inserta asignaturas en la lista.
     * 
     * @param asignaturas 
     */
    public static void rellenarLista(ArrayList<Asignatura> asignaturas) {
        for(int i = 0; i < nombresAsignaturas.length; i++) {
            asignaturas.add(new Asignatura(nombresAsignaturas[i], pedirNota(nombresAsignaturas[i])));
        }
    }
    
    /**
     * Método que muestra la nota media 
     * de las asignaturas de la lista.
     * 
     * @param asignaturas 
     */
    public static void mostrarNotaMedia(ArrayList<Asignatura> asignaturas) {
        double media = 0;
        for(Asignatura asignatura : asignaturas) {
            media += asignatura.getNota();
        }
        media /= asignaturas.size();
        System.out.println("Nota media: " + media);
    }
    
    /**
     * Método principal.
     * 
     * @param args 
     */
    public static void main(String[] args) {
        ArrayList<Asignatura> asignaturas = new ArrayList<>();
        rellenarLista(asignaturas);
        mostrarNotaMedia(asignaturas);
    }

}
