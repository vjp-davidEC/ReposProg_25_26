/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11y12tema8;

/**
 *
 * @author alumno
 */
public class Ejercicio11y12Tema8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mueble mueble1 = new Mueble();
        mueble1.setPrecio(75.99);
        mueble1.setDescripcion("Mesa de madera"); 
        Mueble mueble2 = new Mueble(167.75, "Sofa de color azul");
        
        System.out.println("--MUEBLE-1--");
        mueble1.toString();
        System.out.println("--MUEBLE-2--");
        mueble2.toString();
        mueble1.setDescripcion("Mesa de madera pequenia");
        mueble2.setDescripcion("Sofa de color negro"); 
        System.out.println("\nDespués de modificar:"); 
        mueble1.toString();
        mueble2.toString();
        
        int[] vectorMueble = new int[4];
    }
    
}
