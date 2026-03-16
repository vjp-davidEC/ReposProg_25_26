
package ejercicio13t10;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio13T10 {   
    
    /**
     * Método que pide al usuario la opción del menú.
     * @return la opción
     */
    public static int pedirOpcion() {
        Scanner entrada = new Scanner(System.in);       
        return entrada.nextInt();
    }
    
    /**
     * Método que pide al usuario el número de ventas del mes.
     * @return las ventas introducidas
     */
    public static int pedirVentas() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nº ventas: ");
        return entrada.nextInt();
    }
    
    /**
     * Método que rellena la lista con las ventas de cada mes.
     * @param lVentas
     * @param nombreMeses
     */
    public static void rellenarLista(ArrayList<Venta> lVentas, String[] nombreMeses) {
        if(lVentas.isEmpty()) {
            for (String nombreMes : nombreMeses) {
                System.out.println(nombreMes);
                lVentas.add(new Venta(nombreMes, pedirVentas()));
            }            
        } else {
            System.out.println("\nLa lista ya está llena.");
        }
    }
    
    /**
     * Método que muestra la lista.
     * @param lVentas
     * @param nombreMeses 
     */
    public static void mostrarLista(ArrayList<Venta> lVentas, String[] nombreMeses) {
        if(!lVentas.isEmpty()) {
            for (int i = 0; i < lVentas.size(); i++) {
                System.out.print("Ventas de " + nombreMeses[i] + ": " + lVentas.get(i));                
            }            
        } else {
            System.out.println("\nLa lista no está llena aún.");
        }
    }
    
    /**
     * Método que muestra las ventas totales de todos los meses.
     * @param lVentas 
     */
    public static void mostrarVentasTotales(ArrayList<Venta> lVentas) {
        int total = 0;
        
        if(!lVentas.isEmpty()) {
            for(Venta venta : lVentas) {
                total += venta.getNumVentas();
            }
            
            System.out.println("\nVentas totales del año: " + total);
        } else {
            System.out.println("\nLa lista no está llena aún.");
        }
        
    }
    
    /**
     * Método que muestra las ventas de los meses que empiezan por A.
     * @param lVentas 
     */
    public static void mostrarVentasMesesA(ArrayList<Venta> lVentas) {
        int total = 0;
        
        if(!lVentas.isEmpty()) {
            for(Venta venta : lVentas) {
                if(venta.getNombreMes().toLowerCase().startsWith("a")) {
                    total += venta.getNumVentas();
                }
            }
            
            System.out.println("\nVentas totales de los meses que comienzan por A: " + total);
        } else {
            System.out.println("\nLa lista no está llena aún.");
        }    
    }
    
    /**
     * Método que muestra los meses con más ventas.
     * @param lVentas 
     */
    public static void mostrarMesMasVentas(ArrayList<Venta> lVentas) {
        int mayor = -1;               
        
        if(!lVentas.isEmpty()) {
            for(Venta venta : lVentas) {
                if(venta.getNumVentas() > mayor) {
                    mayor = venta.getNumVentas();
                }
            }

            System.out.println("\nLos meses con más ventas son:"); 
            for(Venta venta : lVentas) {
                if(venta.getNumVentas() == mayor) {
                    System.out.println(venta);                
                }
            }
        } else {
            System.out.println("\nLa lista no está llena aún.");
        }      
    }
    
    /**
     * Método que muestra y gestiona el menú del programa.
     */
    public static void menu() {        
        ArrayList<Venta> lVentas = new ArrayList<>();
        String[] nombreMeses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};                
        int opcion = 0;
        
        do {
            try {
                
                System.out.println("- MENU -");
                System.out.println("1. Introducir las ventas de coches de cada uno de los meses del año.");
                System.out.println("2. Mostrar las ventas introducidas en el punto anterior.");
                System.out.println("3. Que muestre la suma total de ventas de coches del año.");
                System.out.println("4. Que muestre las ventas totales de los meses que empiezan por la letra A");
                System.out.println("5. Que muestre el nombre del mes con más ventas.");
                System.out.println("6. Salir");

                opcion = pedirOpcion();

                switch(opcion) {
                    case 1 :
                        rellenarLista(lVentas, nombreMeses);
                        break;
                    case 2:
                        mostrarLista(lVentas, nombreMeses);
                        break;
                    case 3:
                        mostrarVentasTotales(lVentas);
                        break;
                    case 4:
                        mostrarVentasMesesA(lVentas);
                        break;
                    case 5:
                        mostrarMesMasVentas(lVentas);
                        break;
                    case 6:
                        break;
                    default:
                        System.out.println("Elige una opción correcta (1-6).");
                }
                
            } catch(InputMismatchException e) {
                System.out.println("ERROR: Introduce un número entero");
            }  catch(NullPointerException e) {
                System.out.println("ERROR: Estás intentando acceder a una posición nula.");
            }
            
        } while(opcion != 6);
    }
    
    public static void main(String[] args) {
        menu();
    }

}
