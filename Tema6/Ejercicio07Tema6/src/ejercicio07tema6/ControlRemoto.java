/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ejercicio07tema6;

/**
 *
 * @author DAVID
 */
public interface ControlRemoto {
    void encender();//Método para encender el dispositivo
    void apagar();//Método para apagar el dispositivo
    void subirVolumen();//Método para subir el volumen
    void bajarVolumen();//Método para bajar el volumen
    void cambiarCanal(float canal);//Método para cambiar el canal, recibe un número decimal como parámetro
}