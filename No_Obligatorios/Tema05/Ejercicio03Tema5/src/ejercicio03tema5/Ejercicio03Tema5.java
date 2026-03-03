/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03tema5;

/**
 *
 * @author DAVID
 */
public class Ejercicio03Tema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Rueda rueda1 = new Rueda();//Crear la primera rueda y establecer sus atributos
        rueda1.establecerMaterial("Aluminio");
        rueda1.establecerPulgadas(16);
        
        Rueda rueda2 = new Rueda();//Crear la primera rueda y establecer sus atributos
        rueda2.establecerMaterial("Acero");
        rueda2.establecerPulgadas(18);
        
        System.out.println("Rueda 1: ");//Mostrar datos de la primera rueda
        rueda1.mostrarRueda();
        System.out.println("");
        System.out.println("Rueda 2: ");//Mostrar datos de la segunda rueda
        rueda2.mostrarRueda();
        
        Coche coche1 = new Coche();//Crear el primer coche y asignarle la rueda1
        coche1.establecerMarca("Renault");
        coche1.establecerModelo("C15");
        coche1.establecerRueda(rueda1);
        
        Coche coche2 = new Coche();//Crear el segundo coche y también asignarle la rueda1
        coche2.establecerMarca("Ford");
        coche2.establecerModelo("Focus");
        coche2.establecerRueda(rueda1);
        
        Coche coche3 = new Coche();//Crear el tercer coche y asignarle la rueda2
        coche3.establecerMarca("Seat");
        coche3.establecerModelo("Ibiza");
        coche3.establecerRueda(rueda2);
        
        //Mostrar los datos de los tres coches
        System.out.println("\n Coche 1: ");
        coche1.mostrarCoche();
        
        System.out.println("\n Coche 2: ");
        coche2.mostrarCoche();
        
        System.out.println("\n Coche 3: ");
        coche3.mostrarCoche();
    }  
}