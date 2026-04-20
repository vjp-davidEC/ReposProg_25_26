package ejercicio04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Ejercicio04 {
    
    public static final int DONANTES = 8;
    public static final int DONAMENORES = 50;

    public static void main(String[] args) {
        System.out.println("---ARRAYLIST---");
        ArrayList<Donacion> donaciones = new ArrayList<>();
        aniadirDonacion(donaciones);
        mostrarDonaciones(donaciones);
        mayorDonacion(donaciones);
        menorDonacion(donaciones);
        mediaDonacion(donaciones);
        
        System.out.println("---TREESET---");
        TreeSet<Donacion> donaciones2 = new TreeSet<>();
        pasarArrayListASet(donaciones, donaciones2);
        mostrarDonacionOrdenado(donaciones2);
        eliminarDonacion(donaciones2);
        mostrarDonacion(donaciones2);
        
        System.out.println("---HASHMAP---");
        HashMap<String, Double> donaciones3 = new HashMap<>();
        pasarArrayListAMap(donaciones, donaciones3);
        mostrarMapa(donaciones3);
        consultarDonante(donaciones3);
        modificarDonante(donaciones3);
        eliminarDonante(donaciones3);
        mostrarMapaFinal(donaciones3);
    }
    
    public static void aniadirDonacion(ArrayList<Donacion> donaciones) {
        for (int i = 0; i < DONANTES; i++) {
            donaciones.add(new Donacion(pedirNombre(), pedirCantidad()));
            System.out.println("---");
        }
    }
    
    public static void mostrarDonaciones(ArrayList<Donacion> donaciones) {
        System.out.println("");
        
        if (donaciones.isEmpty()) {
            System.out.println("No hay donantes en la lista");
        } else {
            for (Donacion dona : donaciones) {
                System.out.println(dona.toString());
            }
        }
    }
    
    public static void mayorDonacion(ArrayList<Donacion> donaciones) {
        System.out.println("");
        
        if (donaciones.isEmpty()) {
            System.out.println("No hay donantes en la lista");
        } else {
            Donacion mayor = donaciones.get(0);
            
            for (Donacion dona : donaciones) {
                if (dona.getCantidad() > mayor.getCantidad()) {
                    mayor = dona;
                }
            }
            System.out.println(mayor.toString());
        }
    }
    
    public static void menorDonacion(ArrayList<Donacion> donaciones) {
        System.out.println("");
        
        if (donaciones.isEmpty()) {
            System.out.println("No hay donantes en la lista");
        } else {
            Donacion menor = donaciones.get(0);
            
            for (Donacion dona : donaciones) {
                if (dona.getCantidad() < menor.getCantidad()) {
                    menor = dona;
                }
            }
            System.out.println(menor.toString());
        }
    }
    
    public static void mediaDonacion(ArrayList<Donacion> donaciones) {
        System.out.println("");
        
        if (donaciones.isEmpty()) {
            System.out.println("No hay donantes en la lista");
        } else {
            int suma = 0;
            
            for (Donacion dona : donaciones) {
                suma += dona.getCantidad();
            }
            double media = suma / donaciones.size();
            
            System.out.println("La media de todo es: " + media);
        }
    }
    
    public static void pasarArrayListASet(ArrayList<Donacion> donaciones, TreeSet<Donacion> donaciones2) {
        for (int i = 0; i < donaciones.size(); i++) {
            donaciones2.add(donaciones.get(i));
        }
    }
    
    public static void mostrarDonacionOrdenado(TreeSet<Donacion> donaciones2) {
        System.out.println("");
        
        if (donaciones2.isEmpty()) {
            System.out.println("No hay donantes en el conjunto");
        } else {
            for (Donacion donacion : donaciones2) {
                System.out.println(donacion.toString());
            }
        }
    }
    
    public static void eliminarDonacion(TreeSet<Donacion> donaciones2) {
        System.out.println("");
        
        if (donaciones2.isEmpty()) {
            System.out.println("No hay donantes en el conjunto");
        } else {
            Iterator<Donacion> it = donaciones2.iterator();
            
            while (it.hasNext()) {
                Donacion d = it.next();
                if (d.getCantidad() < DONAMENORES) {
                    it.remove();
                }
            }
        }
    }
    
    public static void mostrarDonacion(TreeSet<Donacion> donaciones2) {
        System.out.println("");
        
        if (donaciones2.isEmpty()) {
            System.out.println("No hay donantes en el conjunto");
        } else {
            for (Donacion dona : donaciones2) {
                System.out.println(dona.toString());
            }
        }
    }
    
    public static void pasarArrayListAMap(ArrayList<Donacion> donaciones, HashMap<String, Double> donaciones3) {
        for (Donacion dona : donaciones) {
            String nombre = dona.getNombreDonante();
            double cantidad = dona.getCantidad();
            
            if (donaciones3.containsKey(nombre)) {
                donaciones3.put(nombre, donaciones3.get(nombre) + cantidad);
            } else {
                donaciones3.put(nombre, cantidad);
            }
        }
    }
    
    public static void mostrarMapa(HashMap<String, Double> donaciones3) {
        System.out.println("");
        
        if (donaciones3.isEmpty()) {
            System.out.println("No hay donantes en el mapa");
        } else {
            for (String key : donaciones3.keySet()) {
                Double dona = donaciones3.get(key);
                System.out.println(key + " --> " + dona);
            }
        }
    }
    
    public static void consultarDonante(HashMap<String, Double> donaciones3) {
        System.out.println("");
        
        if (donaciones3.isEmpty()) {
            System.out.println("No hay donantes en el mapa");
        } else {
            System.out.println("Introduce un nombre para consultar");
            String nombre = pedirNombre();
            
            if (donaciones3.containsKey(nombre)) {
                System.out.println("Total donado: " + donaciones3.get(nombre) + " Euros");
            } else {
                System.out.println("No existe donante con este nombre");
            }
        }
    }
    
    public static void modificarDonante(HashMap<String, Double> donaciones3) {
        System.out.println("");
        
        if (donaciones3.isEmpty()) {
            System.out.println("No hay donantes en el mapa");
        } else {
            System.out.println("Introduce el nombre para modificar su cantidad");
            String nombre = pedirNombre();
            
            if (donaciones3.containsKey(nombre)) {
                donaciones3.put(nombre, pedirCantidad());
                System.out.println(donaciones3.toString());
            } else {
                System.out.println("No existe donante con este nombre");
            }
        }
    }
    
    public static void eliminarDonante(HashMap<String, Double> donaciones3) {
        System.out.println("");
        
        if (donaciones3.isEmpty()) {
            System.out.println("No hay donantes en el mapa");
        } else {
            System.out.println("Introduce el nombre a eliminar");
            String nombre = pedirNombre();
            
            if (donaciones3.containsKey(nombre)) {
                donaciones3.remove(nombre);
                System.out.println("Se elimino el donante");
            } else {
                System.out.println("No existe donante con este nombre");
            }
        }
    }
    
    public static void mostrarMapaFinal(HashMap<String, Double> donaciones3) {
        System.out.println("");
        
        if (donaciones3.isEmpty()) {
            System.out.println("No hay donantes en el mapa");
        } else {
            for (String key : donaciones3.keySet()) {
                Double dona = donaciones3.get(key);
                System.out.println(key + " --> " + dona);
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