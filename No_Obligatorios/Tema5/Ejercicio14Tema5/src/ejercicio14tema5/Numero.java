/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14tema5;

/**
 *
 * @author DAVID
 */
public class Numero {
    //Atributo privado de la clase
    private int valor;
    
    //Método setter que permite asignar un valor al atributo
    public void setValor(int v){
        valor = v;
    }
    
    //Método que muestra la tabla de multiplicar del numero almacenado
    public void mostrarTabla(){
        for (int i = 0; i <= 10; i++){//Bucle for que va desde el 0 al 10
            System.out.println(valor + " x " + i + " = " + (valor * i));//Resultado
        }
    }
}