/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01tema5;

/**
 *
 * @author DAVID
 */
public class Coche {
    //Los atributos privados del coche
    private String marca;
    private String modelo;
    private String color;
    private int velocidad;
    private boolean motorEncendido = false;
    
    //Métodos para establecer{Marca-Modelo-Color}
    public void establecerMarca(String m) {
        marca = m;
    }
    
    public void establecerModelo(String mo){
        modelo = mo;
    }
    
    public void establecerColor(String c) {
        color = c;
    }
    
    //Métodos para {arrancar-apagar-acelerar-frenar}Coche
    public void arrancarCoche(){
        motorEncendido = true;
        velocidad = 10;
        System.out.println("Motor arrancado. La velocidad inicial es 10");
    }
    
    public void apagarCoche() {
        motorEncendido = false;
        velocidad = 0;
        System.out.println("Motor apagado. La velocidad es 0");
    }
    
    public void acelerarCoche(){
        velocidad += 20;
        System.out.println("Acelerandooo. La velocidad actual es " + velocidad);
    }
    
    public void frenarCoche(){
        velocidad -= 6;
        if (velocidad < 0){
            velocidad = 0;
        }
        System.out.println("Frenandooo. La velocidad actual es " + velocidad);
    }
    
    //Método para mostrar el estado actual del coche
    public void obtenerEstado(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Motor encendido: " + motorEncendido);
    }
}