/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio20tema5;

/**
 *
 * @author alumno
 */
public class Cuenta {
    //Atributos
    private float saldo;
    
    //Constructores
    public Cuenta(){
        saldo = 0;
    }
    
    public Cuenta(float s){
        saldo = s;
    }
    
    //Getter y Setter
    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    //Métodos
    public void ingresar(float cant){
        this.saldo = saldo + cant;
    }
    
    public void extraer(float cant){
        this.saldo = saldo - cant;
    }
    
    //Mostrar
    @Override
    public String toString() {
        return "Cuenta{" + "saldo=" + getSaldo() + '}';
    }
}