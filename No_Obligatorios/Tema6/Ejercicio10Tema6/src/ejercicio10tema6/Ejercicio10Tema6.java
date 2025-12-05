/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10tema6;

/**
 *
 * @author DAVID
 */
public class Ejercicio10Tema6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Objetos que se crean de la clase Electrodomestico
        Electrodomestico lavadora = new Electrodomestico(1.2f, 0.25f, "A++");
        Electrodomestico frigorifico = new Electrodomestico(0.8f, 0.25f, "A+");
        Electrodomestico horno = new Electrodomestico(2.0f, 0.25f, "B");

        //Definir horas de uso para la simulación
        float horasUso = 5;

        //Mostrar datos de cada objeto creado
        lavadora.mostrarDatos(horasUso);
        frigorifico.mostrarDatos(horasUso);
        horno.mostrarDatos(horasUso);
    }
}