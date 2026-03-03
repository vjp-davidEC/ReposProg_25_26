/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23tema5;

/**
 *
 * @author DAVID
 */
public class Ejercicio23Tema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Objeto Taxi que se crea utilizando el constructor con parámetros
        Taxi taxi1 = new Taxi("0000KGR", "Toyota Prius", 4, 93924);
        //Objeto Taxi que se crea utilizando el constructor con parámetros
        Autobus autobus1 = new Autobus("8493MFE", "Mercedes Sprinter", 20, 5);
        
        //Objeto Taxi que se crea utilizando el constructor sin parámetros
        Taxi taxi2 = new Taxi();
        //Asignar los valores mediante setters
        taxi2.setMatricula("8943NSD");
        taxi2.setModelo("Seat Toledo");
        taxi2.setNumeroPlazas(4);
        taxi2.setNumeroLicencia(892948);
        
        //Objeto Taxi que se crea utilizando el constructor sin parámetros
        Autobus autobus2 = new Autobus();
        //Asignar los valores mediante setters
        autobus2.setMatricula("8326JID");
        autobus2.setModelo("Iveco Urbanway");
        autobus2.setNumeroPlazas(30);
        autobus2.setNumeroPlazasBus(15);
        
        //Mostrar los datos de los taxis y autobuses con un espacio entre los taxis y autbuses
        System.out.println("TAXI-1: ");
        taxi1.mostrarDatosTaxi();
        System.out.println("TAXI-2: ");
        taxi2.mostrarDatosTaxi();
        System.out.println("");
        System.out.println("AUTOBUS-1: ");
        autobus1.mostrarDatosAutobus();
        System.out.println("AUTOBUS-2: ");
        autobus2.mostrarDatosAutobus();
    }
}