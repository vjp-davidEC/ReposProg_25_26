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
    
    //Constructor que inicializa el objeto
    public Numero(){
        valor = 0;
    }
    
    public Numero(int v){
        valor = v;
    }
    
    //Getter y Setter
    public int getValor() {
        return valor;
    }
    
    public void setValor(int v){
        valor = v;
    }
    
    //Método que muestra la tabla de multiplicar del numero almacenado
    public void mostrarTabla(){
        for (int i = 0; i <= 10; i++){//Bucle for que va desde el 0 al 10
            System.out.println(getValor() + " x " + i + " = " + (getValor() * i));//Resultado
        }
    }
}