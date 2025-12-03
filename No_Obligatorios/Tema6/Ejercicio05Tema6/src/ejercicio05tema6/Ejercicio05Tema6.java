/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05tema6;

/**
 *
 * @author alumno
 */
public class Ejercicio05Tema6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Objetos que se crean de las clase {Ornitorrinco y Murcielago}
        Ornitorrinco orni = new Ornitorrinco("Perry", "Macho", "Marron", 5, 2);
        Murcielago murci = new Murcielago("Pipistrellus pipistrellus", "Hembra", "Negro", 3, 10);
        
        //Mostrar los datos del ornitorrinco y se simulan sus comportamientos ovíparos
        System.out.println("--Datos del Ornitorrinco--");
        orni.mostrarDatos();
        orni.ponerHuevo();
        orni.incubarHuevo();
        orni.mostrarNumHuevos();
        
        //Mostrar los datos del murciélago y se simulan sus comportamientos de vuelo
        System.out.println("\n--Datos del Murcielago--");
        murci.mostrarDatos();
        murci.aumentarAlturaVuelo();
        murci.bajarAlturaVuelo();
        murci.mostrarAlturaVuelo();

        System.out.println("");
        
        //Objetos que se crean usando tipos de interfaces
        Oviparo ovip = new Ornitorrinco("Orni", "Hembra", "Gris", 4, 1);
        Volador volad = new Murcielago("Nocturno", "Macho", "Gris oscuro", 2, 15.40);
        
        //Se llaman a los métodos definidos en la interfaz Oviparo, usando polimorfismo
        System.out.println("--Datos del Oviparo--");
        ovip.ponerHuevo();
        ovip.incubarHuevo();
        System.out.println(ovip.obtenerMensajeOviparo());
        ovip.mostrarNumHuevos();
        
        //Se llaman a los métodos definidos en la interfaz Volador, usando polimorfismo
        System.out.println("\n--Datos del Volador--");
        volad.aumentarAlturaVuelo();
        volad.bajarAlturaVuelo();
        System.out.println(volad.obtenerMensajeVolador());
        volad.mostrarAlturaVuelo();
    }
}