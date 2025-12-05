/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13tema6;

/**
 *
 * @author DAVID
 */
public class Ejercicio13Tema6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Objeto que se crea de la clase Robot
        Robot r1 = new Robot(true, 40);
        System.out.println("--ROBOT--");
        r1.activar();//Activa el robot
        System.out.println(r1.realizarRevision());//Realiza revisión y muestra resultado
        r1.desactivar();//Desactivar el robot

        //Objeto que se crea de la clase Microondas
        Microondas m1 = new Microondas(true, false);
        System.out.println("\n--MICROONDAS--");
        m1.activar();//Activar el microondas
        System.out.println(m1.realizarRevision());//Realiza revisión y muestra resultado
        m1.desactivar();//Desactiva el microondas

        //Objetos que se crean de las interfaces {Operable-Revisable}
        Operable r2 = new Robot(true, 2);
        Revisable m2 = new Microondas(true, true);

        System.out.println("\n--POLIFORMISMO {ROBOT/MICROONDAS}--");
        r2.activar();//Se accede al método común definido en la interfaz Operable
        m2.realizarRevision();//Se accede al método común definido en la interfaz Revisable
    }
}