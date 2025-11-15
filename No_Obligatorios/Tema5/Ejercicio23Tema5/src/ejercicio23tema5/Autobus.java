/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio23tema5;

/**
 *
 * @author DAVID
 */
public class Autobus extends Vehiculo{//Clase que se hereda de Vehiculo
    //Atributo
    private int numeroPlazas;
    
    //Constructores
    public Autobus(){
        super();//Se pone para llamar al constructor de la clase Vehiculo sin parámetros
        numeroPlazas = 0;
    }
    
    public Autobus(String m, String mo, int np, int plazasExtra){
        super(m, mo, np);//Se pone para llamar al constructor de la clase Vehiculo con parámetros
        numeroPlazas = plazasExtra;
    }
    
    //Getter y setter
    public int getNumeroPlazasBus() {
        return numeroPlazas;
    }

    public void setNumeroPlazasBus(int plazasExtra) {
        numeroPlazas = plazasExtra;
    }
    
    //Mostrar
    public void mostrarDatosAutobus(){
        super.mostrarDatosVehiculo();
        System.out.println("Numero de plazas: " + getNumeroPlazasBus());
    }
}