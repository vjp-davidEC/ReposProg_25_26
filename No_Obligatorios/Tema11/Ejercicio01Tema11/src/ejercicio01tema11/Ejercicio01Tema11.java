/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01tema11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio01Tema11 {

    /**
     * @param args the command line arguments
     */
    public static final int POS = 31;
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //
        Map<Integer, Dia> temperaturas = new HashMap<>();
        
        //
        String[] diaSemana = {"Lunes", "Martes", "Miercoles", "Jueves","Viernes", "Sabado", "Domingo"};
        
        int opcion;
        
        do {
            mostrarMenu();
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1 -> rellenarTemperaturas(temperaturas, diaSemana);
                case 2 -> mostrarTempuras(temperaturas);
                case 3 -> temperaturaMedia(temperaturas);
                case 4 -> diaMasCaluroso(temperaturas);
                case 5 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion no valida, intentelo de nuevo");
            }
        } while (opcion != 5);
    }
    
    //
    public static void mostrarMenu() {
        System.out.println("\n--MENU--");
        System.out.println("1. RELLENAR LAS TEMPERATURAS");
        System.out.println("2. MOSTRAR LAS TEMPERATURAS");
        System.out.println("3. MOSTRAR LA TEMPERATURA MEDIA DEL MES");
        System.out.println("4. DIA/DIAS MAS CALUROSOS DEL MES");
        System.out.println("5. SALIR DEL PROGRAMA");
        System.out.print("INTRODUCE UNA OPCION: ");
    }
    
    //
    public static void rellenarTemperaturas(Map<Integer, Dia> mapa, String[] diaSemana) {
        System.out.println();
        mapa.clear();
        
        int diaInicial = (int)(Math.random() * 7);
        
        for (int i = 0; i < POS; i++) {
            int temperatura = (int)(Math.random() * 41);
            
            mapa.put(i, new Dia(diaSemana[diaInicial], temperatura));
            
            diaInicial++;
            if (diaInicial == 7) {
                diaInicial = 0;
            }
        }
        System.out.println("Temperaturas generadas correctamente");
    }
    
    //
    public static void mostrarTempuras(Map<Integer, Dia> mapa) {
        System.out.println();
        
        if (mapa.isEmpty()) {
            System.out.println("Aun no se han generado las temperaturas");
        } else {
            System.out.println("--TEMPERATURAS--");
            for (int i = 0; i < mapa.size(); i++) {
                Dia d = mapa.get(i);
                System.out.println(d.getNombreDia() + " dia " + (i+1) + ": " + d.getTemperatura() + "C");
            }
        }
    }
    
    //
    public static void temperaturaMedia(Map<Integer, Dia> mapa) {
        System.out.println();
        
        if (mapa.isEmpty()) {
            System.out.println("Aun no se han generado las temperaturas");
        } else {
            int suma = 0;
            
            for (int i = 0; i < mapa.size(); i++) {
                suma += mapa.get(i).getTemperatura();
            }
            
            float media = (float) suma / mapa.size();
            System.out.println("La temperatura media del mes es: " + media + "C");
        }
    }
    
    //
    public static void diaMasCaluroso(Map<Integer, Dia> mapa) {
        System.out.println();
        
        if (mapa.isEmpty()) {
            System.out.println("Aun no se han generado temperaturas");
        } else {
            int max = mapa.get(0).getTemperatura();
            
            for (int i = 0; i < mapa.size(); i++) {
                if (mapa.get(i).getTemperatura() > max) {
                    max = mapa.get(i).getTemperatura();
                }
            }
            System.out.println("El dia o dias mas calurosos fueron: " + max + "C");
            for (int i = 0; i < mapa.size(); i++) {
                if (mapa.get(i).getTemperatura() == max) {
                    System.out.println(" - " + mapa.get(i).getNombreDia() + " dia " + (i+1));
                }
            }
        }
    }
}
