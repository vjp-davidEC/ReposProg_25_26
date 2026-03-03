/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio08tema5;

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
    
    //Método getter que devuelve el valor almacenado al atributo
    public int getValor(){
        return valor;
    }
    
    //Mostrar
    public void mostrarNumero(){
        System.out.println(getValor());
    }
}