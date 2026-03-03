/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ejercicio12tema6;

/**
 *
 * @author DAVID
 */
public interface Alquilabre {
    public void entregar();//Método abstracto que marca el objeto como entregado
    public void devolver();//Método abstracto que marca el objeto como devuelto
    public boolean esEntregado();//Método abstracto que indica si el objeto está actualmente entregado
}