/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ejercicio05tema6;

/**
 *
 * @author alumno
 */
public interface Volador {
    public String obtenerMensajeVolador();//Devuelve un mensaje indicando que el animal es volador
    public void aumentarAlturaVuelo();//Incrementa la altura de vuelo
    public void bajarAlturaVuelo();//Reduce la altura de vuelo
    public void mostrarAlturaVuelo();//Muestra la altura actual
}