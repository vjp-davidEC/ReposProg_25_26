/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso02tema5;

import java.util.Scanner;

/**
 *
 * @author DAVID
 */
public class Repaso02Tema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int cantidadProductos = 0;
        int contador = 0;
        String nombre;
        double precio;
        double costeProducto;
        double costeTotal = 0;
        
        System.out.print("Cuantos productos quieres registrar?: ");
        cantidadProductos = entrada.nextInt();
        entrada.nextLine(); // limpiar buffer
        System.out.println("");
        
        while (contador < cantidadProductos) {
            System.out.print("Nombre del producto: ");
            nombre = entrada.nextLine();

            System.out.print("Cantidad: ");
            int cantidad = entrada.nextInt();

            System.out.print("Precio unitario: ");
            precio = entrada.nextDouble();
            entrada.nextLine(); // limpiar buffer

            costeProducto = cantidad * precio;
            costeTotal = costeTotal + costeProducto;

            System.out.println("Producto: " + nombre + ", \nCantidad: " + cantidad + ", \nPrecio unitario: " + precio + ", \nCoste: " + costeProducto);
            contador++;
            System.out.println("");
        }
        System.out.println("Coste total acumulado: " + costeTotal);
    }  
}