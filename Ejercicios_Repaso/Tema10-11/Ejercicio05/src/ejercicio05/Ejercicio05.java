package ejercicio05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class Ejercicio05 {
    
    public static final int DONAR = 5;

    public static void main(String[] args) {
        ArrayList<Donacion> donaciones = new ArrayList<>();
        TreeSet<Donacion> donaciones2 = new TreeSet<>();
        HashMap<String, Double> donaciones3 = new HashMap<>();
        
        aniadirDonaciones(donaciones);
        mostrarLista(donaciones);
        
        pasarDeArrayListASet(donaciones, donaciones2);
        mostrarSet(donaciones2);
        pasarDeArrayListAMap(donaciones, donaciones3);
        mostrarMap(donaciones3);
        
        pasarDeSetAArrayList(donaciones2, donaciones);
        mostrarArrayListDesdeSet(donaciones);
        pasarDeSetAMap(donaciones2, donaciones3);
        mostrarMapDesdeSet(donaciones3);
        
        pasarDeMapAArrayList(donaciones3, donaciones);
        mostrarListaDesdeMap(donaciones);
        pasarDeMapASet(donaciones3, donaciones2);
        mostrarSetDesdeMap(donaciones2);
    }
    
    public static void aniadirDonaciones(ArrayList<Donacion> donaciones) {
        for (int i = 0; i < DONAR; i++) {
            donaciones.add(new Donacion(pedirNombre(), pedirCantidad()));
            System.out.println("---");
        }
    }
    
    public static void mostrarLista(ArrayList<Donacion> donaciones) {
        System.out.println("");
        
        if (donaciones.isEmpty()) {
            System.out.println("No hay donaciones en la lista");
        } else {
            for (Donacion dona : donaciones) {
                System.out.println(dona.toString());
            }
        }
    }
    
    public static void pasarDeArrayListASet(ArrayList<Donacion> donaciones, TreeSet<Donacion> donaciones2) {
        System.out.println("");
        
        for (int i = 0; i < donaciones.size(); i++) {
            donaciones2.add(donaciones.get(i));
        }
    }
    
    public static void mostrarSet(TreeSet<Donacion> donaciones2) {
        System.out.println("");
        
        if (donaciones2.isEmpty()) {
            System.out.println("No hay donaciones en el conjunto");
        } else {
            for (Donacion dona : donaciones2) {
                System.out.println(dona.toString());
            }
        }
    }
    
    public static void pasarDeArrayListAMap(ArrayList<Donacion> donaciones, HashMap<String, Double> donaciones3) {
        System.out.println("");
        
        for (Donacion dona : donaciones) {
            Donacion donacion = dona;
            String nombre = donacion.getNombreDonante();
            double cantidad = donacion.getCantidad();
            
            if (donaciones3.containsKey(nombre)) {
                donaciones3.put(nombre, donaciones3.get(nombre) + cantidad);
            } else {
                donaciones3.put(nombre, cantidad);
            }
        }
    }
    
    public static void mostrarMap(HashMap<String, Double> donaciones3) {
        System.out.println("");
        
        if (donaciones3.isEmpty()) {
            System.out.println("No hay donaciones en el mapa");
        } else {
            for (String key : donaciones3.keySet()) {
                Double dona = donaciones3.get(key);
                System.out.println(key + " --> " + dona);
            }
        }
    }
    
    public static void pasarDeSetAArrayList(TreeSet<Donacion> donaciones2, ArrayList<Donacion> donaciones) {
        System.out.println("");
        
        donaciones.clear();
        
        for (Donacion dona : donaciones2) {
            donaciones.add(dona);
        }
    }
    
    public static void mostrarArrayListDesdeSet(ArrayList<Donacion> donaciones) {
        System.out.println("");
        
        if (donaciones.isEmpty()) {
            System.out.println("No hay donaciones en la lista");
        } else {
            for (Donacion dona : donaciones) {
                System.out.println(dona.toString());
            }
        }
    }
    
    public static void pasarDeSetAMap(TreeSet<Donacion> donaciones2, HashMap<String, Double> donaciones3) {
        System.out.println("");
        
        donaciones3.clear();
        
        for (Donacion dona : donaciones2) {
            Donacion donacion = dona;
            String nombre = donacion.getNombreDonante();
            double cantidad = donacion.getCantidad();
            
            if (donaciones3.containsKey(nombre)) {
                donaciones3.put(nombre, donaciones3.get(nombre) + cantidad);
            } else {
                donaciones3.put(nombre, cantidad);
            }
        }
    }
    
    public static void mostrarMapDesdeSet(HashMap<String, Double> donaciones3) {
        System.out.println("");
        
        if (donaciones3.isEmpty()) {
            System.out.println("No hay donaciones en el mapa");
        } else {
            for (String key : donaciones3.keySet()) {
                Double dona = donaciones3.get(key);
                System.out.println(key + " --> " + dona);
            }
        }
    }
    
    public static void pasarDeMapAArrayList(HashMap<String, Double> donaciones3, ArrayList<Donacion> donaciones) {
        System.out.println("");
        
        donaciones.clear();
        
        for (String key : donaciones3.keySet()) {
            Double dona = donaciones3.get(key);
            donaciones.add(new Donacion(key, dona));
        }
    }
    
    public static void mostrarListaDesdeMap(ArrayList<Donacion> donaciones) {
        System.out.println("");
        
        if (donaciones.isEmpty()) {
            System.out.println("No hay donaciones en la lista");
        } else {
            for (Donacion dona : donaciones) {
                System.out.println(dona.toString());
            }
        }
    }
    
    public static void pasarDeMapASet(HashMap<String, Double> donaciones3, TreeSet<Donacion> donaciones2) {
        System.out.println("");
        
        donaciones2.clear();
        
        for (String key : donaciones3.keySet()) {
            Double dona = donaciones3.get(key);
            donaciones2.add(new Donacion(key, dona));
        }
    }
    
    public static void mostrarSetDesdeMap(TreeSet<Donacion> donaciones2) {
        System.out.println("");
        
        if (donaciones2.isEmpty()) {
            System.out.println("No hay donaciones en el conjunto");
        } else {
            for (Donacion dona : donaciones2) {
                System.out.println(dona.toString());
            }
        }
    }
    
    
    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre del donante: ");
        return entrada.nextLine();
    }
    public static double pedirCantidad() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Cantidad a donar: ");
        return entrada.nextDouble();
    }
}