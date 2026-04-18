package ejercicio12repaso10tema10;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio12Repaso10Tema10 {

    private static final String[] nombreAsignaturas = {
      "PROG", "LMSGI", "BD", "ED", "SI", "IPE", "INGLES"  
    };
    
    public static void main(String[] args) {
        ArrayList<Asignatura> asignaturas = new ArrayList<>();
        rellenarLista(asignaturas);
        mostrarNotaMedia(asignaturas);
    }
    
    public static void rellenarLista(ArrayList<Asignatura> asignaturas) {
        for (int i = 0; i < nombreAsignaturas.length; i++) {
            asignaturas.add(new Asignatura(nombreAsignaturas[i], pedirNota(nombreAsignaturas[i])));
        }
    }
    
    public static void mostrarNotaMedia(ArrayList<Asignatura> asignaturas) {
        double media = 0;
        for (Asignatura asignatura : asignaturas) {
            media += asignatura.getNota();
        }
        media /= asignaturas.size();
        System.out.println("Nota media: " + media);
    }
    
    
    public static int pedirNota(String asignaturas) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce la nota de " + asignaturas + ": ");
        return entrada.nextInt();
    }
}