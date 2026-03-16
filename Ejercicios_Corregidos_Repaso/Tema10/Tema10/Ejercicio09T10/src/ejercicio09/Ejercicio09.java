
package ejercicio09;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio09 {
    public final static int NUM_DIAS = 31;   
    
    /**
     * Método que pide la opción al usuario.
     * 
     * @return la opción dada por el usuario
     */
    public static int pedirOpcion() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
    
    /**
     * Método que rellena la lista con los días del mes.
     * 
     * @param dias
     * @param nombresDias 
     */
    public static void rellenarDias(ArrayList<Dia> dias, String[] nombresDias) {
        // Calculo el nombre del primer día aleatorio
        int indice = (int)(Math.random() * nombresDias.length);
        
        // Relleno la lista con 31 días
        for(int i = 0; i < NUM_DIAS; i++) {
            dias.add(new Dia(nombresDias[indice % 7], (int)(Math.random() * 15 - 5)));
            indice++;
        }
    }

    /**
     * Método que muestra los días del mes.
     * 
     * @param dias 
     */
    public static void mostrarDias(ArrayList<Dia> dias) {
        for(int i = 0; i < NUM_DIAS; i++) {
            System.out.println(
                    dias.get(i).getNombreDia() + " " + (i + 1) + 
                            " - " + dias.get(i).getTemperatura());
        }
    }
    
    /**
     * Método que muestra la temperatura media del mes.
     * 
     * @param dias 
     */
    public static void mostrarTemperaturaMedia(ArrayList<Dia> dias) {
        int suma = 0;
        for(Dia dia : dias) {
            suma += dia.getTemperatura();
        }
        System.out.println("Temperautra media: " + suma / dias.size() + "ºC");
    }
    
    /**
     * Método que muestra los días más calurosos del mes.
     * 
     * @param dias 
     */
    public static void mostrarDiasMasCalurosos(ArrayList<Dia> dias) {
        Dia diaMasCaluroso = null;
        int maxTemp = -10, tempActual;
        
        for(int i = 0; i < NUM_DIAS; i++) {
            tempActual = dias.get(i).getTemperatura();
            if(tempActual > maxTemp) {
                diaMasCaluroso = dias.get(i);
            }
        }
        
        for(Dia dia : dias) {
            System.out.println("El día o días más calurosos del mes fueron:");
            if(dia.getTemperatura() == maxTemp) {
                System.out.println(diaMasCaluroso);                
            }
        }
        
    }
    
    /**
     * Método que muestra y maneja el menú del programa.
     * 
     */
    public static void menu() {  
        String[] nombresDias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        ArrayList<Dia> dias = new ArrayList<>();
        int opcion = 0;
        
        do {
            
            try {
                System.out.println("- MENU -");
                System.out.println("1. Rellenar temperaturas");
                System.out.println("2. Mostrar temperaturas");
                System.out.println("3. Visualizar temperatura media");
                System.out.println("4. Días más calurosos");
                System.out.println("5. Salir");

                opcion = pedirOpcion();

                switch(opcion) {
                    case 1 -> rellenarDias(dias, nombresDias);
                    case 2 -> mostrarDias(dias);
                    case 3 -> mostrarTemperaturaMedia(dias);
                    case 4 -> mostrarDiasMasCalurosos(dias);
                    case 5 -> System.out.println("¡Gracias! Nos vemos");
                    default -> System.out.println("Elige una opción correcta.");
                }
                
            } catch(InputMismatchException e) {
                System.out.println("Error: Introduce un número entero entre 1 y 5.");
            }
            
        } while(opcion != 5);
        
    }
    
    /**
     * Método principal.
     * 
     * @param args 
     */
    public static void main(String[] args) {        
        menu();
    }

}
