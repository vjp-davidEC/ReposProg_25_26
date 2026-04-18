package ejercicio18repaso01tema11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio18Repaso01Tema11 {

    public static final int POS = 31;
    
    public static void main(String[] args) {
        Map<Integer,Dia> temperaturas = new HashMap<>();
        String[] diaSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        
        int opcion;
        
        do {
            mostrarMenu();
            opcion = pedirOpcion();
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
    
    //Metodo que muestra el menu principal
    public static void mostrarMenu() {
        System.out.println("\n--MENU--");
        System.out.println("1. RELLENAR LAS TEMPERATURAS");
        System.out.println("2. MOSTRAR LAS TEMPERATURAS");
        System.out.println("3. MOSTRAR LA TEMPERATURA MEDIA DEL MES");
        System.out.println("4. DIA/DIAS MAS CALUROSOS DEL MES");
        System.out.println("5. SALIR DEL PROGRAMA");
        System.out.print("INTRODUCE UNA OPCION: ");
    }
    
    //Metodo que genera temperaturas aleatorias y las guarda en el mapa
    public static void rellenarTemperaturas(Map<Integer, Dia> mapa, String[] diaSemana) {
        System.out.println();
        mapa.clear();//Limpia el mapa antes de rellenarlo
        
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
    
    //Metodo que muestra las temperaturas del mes
    public static void mostrarTempuras(Map<Integer, Dia> mapa) {
        System.out.println();
        
        if (mapa.isEmpty()) {
            System.out.println("Aun no se han generado las temperaturas");
        } else {
            System.out.println("--TEMPERATURAS--");
            for (Integer key : mapa.keySet()) {
                Dia d = mapa.get(key);
                System.out.println(d.getNombreDia() + " dia " + (key+1) + ": " + d.getTemperatura() + "C");
            }
        }
    }
    
    //Metodo que calcula y muestra la temperatura media del mes
    public static void temperaturaMedia(Map<Integer, Dia> mapa) {
        System.out.println();
        
        if (mapa.isEmpty()) {
            System.out.println("Aun no se han generado las temperaturas");
        } else {
            int suma = 0;
            
            for (Integer key : mapa.keySet()) {
                suma += mapa.get(key).getTemperatura();
            }
            
            float media = (float) suma / mapa.size();
            System.out.println("La temperatura media del mes es: " + media + "C");
        }
    }
    
    //Metodo que muestra el dia o dias mas calurosos del mes
    public static void diaMasCaluroso(Map<Integer, Dia> mapa) {
        System.out.println();
        
        if (mapa.isEmpty()) {
            System.out.println("Aun no se han generado temperaturas");
        } else {
            int max = mapa.get(0).getTemperatura();
            
            for (Integer key : mapa.keySet()) {
                if (mapa.get(key).getTemperatura() > max) {
                    max = mapa.get(key).getTemperatura();
                }
            }
            System.out.println("El dia o dias mas calurosos fueron: " + max + "C");
            for (Integer key : mapa.keySet()) {
                if (mapa.get(key).getTemperatura() == max) {
                    System.out.println(" - " + mapa.get(key).getNombreDia() + " dia " + (key+1));
                }
            }
        }
    }
    
    
    public static int pedirOpcion() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
}