
package ejercicio06t11comparable;

import java.util.Scanner;

/**
 *
 * Ejercicio06T11 - Interfaz Comparable
 * 
 * @author Usuario
 */
public class Ejercicio06T11Comparable {

/**
     * Pedir opción de menú
     * 
     * @return opción de menú
     */
    public static int pedirOpcionMenu(){
        Scanner teclado = new Scanner(System.in);
        int opc;
        System.out.print("Opcion: ");
        opc = teclado.nextInt();
        return opc;
    }

    /**
     * Método main
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Campania c = new Campania("Campaña Prueba");
        
        int opc;
        
        do{
            System.out.println("1. Añadir donación ");
            System.out.println("2. Mostrar donaciones ");
            System.out.println("3. Mostrar donaciones por nombre");
            System.out.println("4. Mostrar número de donaciones");
            System.out.println("5. Mostrar total dinero recaudado");
            System.out.println("6. Ordenar donaciones");
            System.out.println("7. Salir");
            opc = pedirOpcionMenu();
            
            switch(opc){
                case 1:
                    c.insertarDonacion();
                    break;
                case 2:
                    c.mostrarDonaciones();
                    break;
                case 3:
                    c.mostrarDonacionesPorNombre();
                    break;
                case 4:
                    c.mostrarNumeroDonaciones();
                    break;
                case 5:
                    c.mostrarTotalRecaudado();
                    break;
                case 6:
                    System.out.println("No es necesaria esta opción. Ya se insertan las Donaciones en orden.");
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
            
        } while(opc != 7);
    }
    
}
