/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio21tema5;

/**
 *
 * @author DAVID
 */
public class CuentaClave extends Cuenta{//Clase que se hereda de Cuenta
    //Atributo
    private String clave;
    
    //Constructores
    public CuentaClave(){
        super();//Se pone para llamar al constructor de la clase Cuenta sin parámetros
        clave = "";
    }
    
    public CuentaClave(float s, String c){
        super(s);//Se pone para llamar al constructor de la clase Cuenta con parámetro
        clave = c;
    }
    
    //Getter y setter
    public String getClave() {
        return clave;
    }

    public void setClave(String c) {
        clave = c;
    }
    
    //Mostrar
    public void extraer(float cantidad){
        if(getSaldo() >= cantidad){
            super.extraer(cantidad);
        }
    }
}