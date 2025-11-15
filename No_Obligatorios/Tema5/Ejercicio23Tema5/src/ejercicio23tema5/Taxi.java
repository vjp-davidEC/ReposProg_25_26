/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio23tema5;

/**
 *
 * @author DAVID
 */
public class Taxi extends Vehiculo{//Clase que se hereda de Vehiculo
    //Atributo
    private int numeroLicencia;
    
    //Constructores
    public Taxi(){
        super();//Se pone para llamar al constructor de la clase Vehiculo sin parámetros
        numeroLicencia = 0;
    }
    
    public Taxi(String m, String no, int np, int nl){
        super(m, no, np);//Se pone para llamar al constructor de la clase Vehiculo con parámetros
        numeroLicencia = nl;
    }
    
    //Getter y setter
    public int getNumeroLicencia() {
        return numeroLicencia;
    }

    public void setNumeroLicencia(int nl) {
        this.numeroLicencia = nl;
    }
    
    //Mostrar
    public void mostrarDatosTaxi(){
        super.mostrarDatosVehiculo();
        System.out.println("Numero de licencia: " + getNumeroLicencia());
    }
}