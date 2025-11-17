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
        
        //Variables 
        int cantidadProductos = 0;
        int contador = 0;
        String nombre;
        double precio;
        double costeProducto;
        double costeTotal = 0;
        
        System.out.print("Cuantos productos quieres registrar?: ");
        cantidadProductos = entrada.nextInt();
        entrada.nextLine();//Limpiar buffer
        System.out.println("");
        
        //Bucle que se repite hasta registrar todos los productos 
        while (contador < cantidadProductos) {
            System.out.print("Nombre del producto: ");
            nombre = entrada.nextLine();

            System.out.print("Cantidad: ");
            int cantidad = entrada.nextInt();

            System.out.print("Precio unitario: ");
            precio = entrada.nextDouble();
            entrada.nextLine(); // limpiar buffer

            costeProducto = cantidad * precio;//Calcular el coste del producto 
            costeTotal = costeTotal + costeProducto;//Suman el coste al total acumulado 

            System.out.println("Producto: " + nombre + ", \nCantidad: " + cantidad + ", \nPrecio unitario: " + precio + ", \nCoste: " + costeProducto);
            contador++;//Incrementar el contador
            System.out.println("");
        }
        System.out.println("Coste total acumulado: " + costeTotal);
    }  
}
/*
    Scanner entrada: permite leer lo que el usuario escribe en la consola.
    cantidadProductos: el usuario indica cuántos productos quiere registrar.
    while (contador < cantidadProductos): el programa se repite hasta que se registren todos los productos.
    Dentro del bucle:
        Se pide el nombre, la cantidad y el precio unitario.
        Se calcula el costeProducto = cantidad * precio.
        Se acumula en costeTotal.
        Se muestra la información del producto registrado.
    Al final: se imprime el coste total acumulado de todos los productos.
*/