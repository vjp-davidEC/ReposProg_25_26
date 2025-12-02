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
        Ornitorrinco orni = new Ornitorrinco("Perry", "Macho", "Marron", 5, 2);
        Murcielago murci = new Murcielago("Pipistrellus pipistrellus", "Hembra", "Negro", 3, 10);


        orni.mostrarDatos();
        orni.ponerHuevo();
        orni.incubarHuevo();
        orni.mostrarNumHuevos();

        System.out.println();
        murci.mostrarDatos();
        murci.aumentarAlturaVuelo();
        murci.bajarAlturaVuelo();
        murci.mostrarAlturaVuelo();

        System.out.println("");

        Oviparo ovip = new Ornitorrinco("Orni", "Hembra", "Gris", 4, 1);
        Volador volad = new Murcielago("Nocturno", "Macho", "Gris oscuro", 2, 15);

        ovip.ponerHuevo();
        ovip.incubarHuevo();
        System.out.println(ovip.obtenerMensajeOviparo());
        ovip.mostrarNumHuevos();

        System.out.println();
        volad.aumentarAlturaVuelo();
        volad.bajarAlturaVuelo();
        System.out.println(volad.obtenerMensajeVolador());
        volad.mostrarAlturaVuelo();
    }
}