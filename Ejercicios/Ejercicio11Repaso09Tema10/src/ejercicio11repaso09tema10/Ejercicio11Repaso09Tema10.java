package ejercicio11repaso09tema10;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio11Repaso09Tema10 {

    public final static int NUM_DIAS = 31;
    
    public static void main(String[] args) {
        ArrayList<Dia> dias = new ArrayList<>();
        String[] nombreDias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        
        int opcion = 0;
        
        do {
            try {
                mostrarMenu();
                opcion = pedirOpcion();
                switch (opcion) {
                    case 1 -> rellenarDias(dias, nombreDias);
                    case 2 -> mostrarDias(dias);
                    case 3 -> mostrarTemperaturaMedia(dias);
                    case 4 -> diaMasCaluroso(dias);
                    case 5 -> System.out.println("Saliendo del programa...");
                    default -> System.out.println("Opcion no valida, intentelo de nuevo");
                }
            } catch (InputMismatchException e) {
                System.out.println("ERROR: Introduce un numero entero");
            }
        } while (opcion != 5);
    }
    
    public static void mostrarMenu() {
        System.out.println("\n--MENU--");
        System.out.println("1. Rellenar las temperaturas");
        System.out.println("2. Mostrar las temperaturas");
        System.out.println("3. Mostrar la temperatura media del mes");
        System.out.println("4. Dia/Dias mas calurosos del mes");
        System.out.println("5. Salir del programa");
        System.out.print("Introduce una opcion: ");
    }
    
    public static void rellenarDias(ArrayList<Dia> dias, String[] nombreDias) {
        int indice = (int)(Math.random() * nombreDias.length);
        
        for (int i = 0; i < NUM_DIAS; i++) {
            dias.add(new Dia(nombreDias[indice % 7], (int)(Math.random() * 15 - 5)));
            indice++;
        }
    }
    
    public static void mostrarDias(ArrayList<Dia> dias) {
        for (int i = 0; i < NUM_DIAS; i++) {
            System.out.println(dias.get(i).getNombreDia() + " " + (i+1) + " - " + dias.get(i).getTemperatura());
        }
    }
    
    public static void mostrarTemperaturaMedia(ArrayList<Dia> dias) {
        int suma = 0;
        for (Dia dia : dias) {
            suma += dia.getTemperatura();
        }
        System.out.println("Temperatura media: " + suma / dias.size() + "C");
    }
    
    public static void diaMasCaluroso(ArrayList<Dia> dias) {
        System.out.println();
        if(dias.isEmpty()) {
            System.out.println("Aun no se han generado temperaturas");
        } else {
            int max = dias.get(0).getTemperatura();
            
            for(int i = 0; i < NUM_DIAS; i++) {
                if(dias.get(i).getTemperatura() > max) {
                    max = dias.get(i).getTemperatura();
                }
            }
            System.out.println("El dia o dias mas calurosos fueron: " + max + "C");
            for(int i = 0; i < dias.size(); i++) {
                if(dias.get(i).getTemperatura() == max) {
                    System.out.println(" - " + dias.get(i).getNombreDia() + " dia " + (i+1));
                }
            }
        }
    }
    
    
    public static int pedirOpcion(){
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
}