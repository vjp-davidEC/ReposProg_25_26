/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24tema5;

/**
 *
 * @author DAVID
 */
public class Ejercicio24Tema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Objeto ProductoFresco que se crea utilizando el constructor con parámetros
        ProductoFresco freso = new ProductoFresco("12/02/2026", 145, "10/02/2026", "Espania");
        //Objeto ProductoCongelado que se crea utilizando el constructor con parámetros
        ProductoCongelado congelado = new ProductoCongelado("20/06/2026", 293, -19.87);
        //Objeto ProductoRefrigerado que se crea utilizando el constructor con parámetros
        ProductoRefrigerado refrigerado = new ProductoRefrigerado("04/01/2027", 522, "ES-RF-984");
        
        //Mostrar los datos del ProductoFresco, ProductoCongelado y ProductoRefrigerado con un espacio entre ellos
        System.out.println("Producto fresco:");
        freso.mostrarDatosProductoFresco();
        System.out.println("");
        System.out.println("Producto congelado:");
        congelado.mostrarDatosProductoCongelado();
        System.out.println("");
        System.out.println("Producto refrigerado:");
        refrigerado.mostrarDatosProductoRefrigerado();
    }
}