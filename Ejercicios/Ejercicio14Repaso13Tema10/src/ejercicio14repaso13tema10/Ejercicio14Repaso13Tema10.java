package ejercicio14repaso13tema10;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio14Repaso13Tema10 {

    public static void main(String[] args) {
        ArrayList<Venta> ventas = new ArrayList<>();
        String[] nombreMeses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        
        int opcion = 0;
        
        do {
            try {
                mostrarMenu();
                opcion = pedirOpcion();
                switch (opcion) {
                    case 1 -> rellenarLista(ventas, nombreMeses);
                    case 2 -> mostrarLista(ventas, nombreMeses);
                    case 3 -> mostrarVentasTotales(ventas);
                    case 4 -> mostrarVentasMesesA(ventas);
                    case 5 -> mostrarMesMasVentas(ventas, nombreMeses);
                    case 6 -> System.out.println("Saliendo del programa...");
                    default -> System.out.println("Opcion no valida, intentelo de nuevo");
                }
            } catch (InputMismatchException e) {
                System.out.println("Introduce un numero entero");
            }
        } while (opcion != 6);
    }
    
    public static void mostrarMenu() {
        System.out.println("\n-- MENU --");
        System.out.println("1. Introducir las ventas de coches de cada uno de los meses del anio");
        System.out.println("2. Mostrar las ventas introducidas en el punto anterior");
        System.out.println("3. Que muestre la suma total de ventas de coches del anio");
        System.out.println("4. Que muestre las ventas totales de los meses que empiezan por la letra A");
        System.out.println("5. Que muestre el nombre del mes con mas ventas");
        System.out.println("6. Salir del programa");
        System.out.print("Introduce una opcion: ");
    }
    
    public static void rellenarLista(ArrayList<Venta> ventas, String[] nombreMeses) {
        System.out.println("");
        
        for (String nombreMes : nombreMeses) {
            System.out.println(nombreMes);
            ventas.add(new Venta(nombreMes, pedirVentas()));
        }
    }
    
    public static void mostrarLista(ArrayList<Venta> ventas, String[] nombreMeses) {
        System.out.println("");
        
        if (ventas.isEmpty()) {
            System.out.println("No hay ninguna lista de ventas");
        } else {
            for (int i = 0; i < ventas.size(); i++) {
                System.out.println("Ventas de " + nombreMeses[i] + ": " + ventas.get(i));
            }
        }
    }
    
    public static void mostrarVentasTotales(ArrayList<Venta> ventas) {
        System.out.println("");
        int total = 0;
        
        if (ventas.isEmpty()) {
            System.out.println("No hay ninguna lista de ventas");
        } else {
            for (Venta venta : ventas) {
                total += venta.getNumVentas();
            }
            System.out.println("Ventas totales del anio: " + total);
        }
    }
    
    public static void mostrarVentasMesesA(ArrayList<Venta> ventas) {
        System.out.println("");
        int total = 0;
        
        if (ventas.isEmpty()) {
            System.out.println("No hay ninguna lista de ventas");
        } else {
            for (Venta venta : ventas) {
                if (venta.getNombreMes().toLowerCase().startsWith("a")) {
                    total += venta.getNumVentas();
                }
            }
            System.out.println("Ventas totales de los meses que comienzan por A: " + total);
        }
    }
    
    public static void mostrarMesMasVentas(ArrayList<Venta> ventas, String[] nombreMeses) {
        System.out.println("");
        int mayor = 0;
        
        if (ventas.isEmpty()) {
            System.out.println("No hay ninguna lista de ventas");
        } else {
            for(Venta venta : ventas) {
                if(venta.getNumVentas() > mayor) {
                    mayor = venta.getNumVentas();
                }
            }

            System.out.println("\nLos meses con mas ventas son: " + mayor); 
            for(Venta venta : ventas) {
                if(venta.getNumVentas() == mayor) {
                    System.out.println(" - " + venta.getNombreMes());                
                }
            }
        }
    }
    
    
    public static int pedirOpcion() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
    public static int pedirVentas() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Num de ventas: ");
        return entrada.nextInt();
    }
}