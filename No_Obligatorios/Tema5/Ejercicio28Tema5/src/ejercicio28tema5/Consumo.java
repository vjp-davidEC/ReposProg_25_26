/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio28tema5;

/**
 *
 * @author DAVID
 */
public class Consumo {
    //Atributos
    private double kms;
    private double litros;
    private double vmed;
    private double pgas;
    
    //Constructores
    public Consumo(){
        kms = 0;
        litros = 0;
        vmed = 0;
        pgas = 0;
    }

    public Consumo(double kms, double litros, double vmed, double pgas) {
        this.kms = kms;
        this.litros = litros;
        this.vmed = vmed;
        this.pgas = pgas;
    }
    
    //Getters/Obtener y setters/establecer
    public double obtenerKms() {
        return kms;
    }

    public void establecerKms(double kms) {
        this.kms = kms;
    }

    public double obtenerLitros() {
        return litros;
    }

    public void establecerLitros(double litros) {
        this.litros = litros;
    }

    public double obtenerVmed() {
        return vmed;
    }

    public void establecerVmed(double vmed) {
        this.vmed = vmed;
    }

    public double obtenerPgas() {
        return pgas;
    }

    public void establecerPgas(double pgas) {
        this.pgas = pgas;
    }
    
    public double getTiempo(){//Método que calcula el tiempo de viaje
        if(vmed > 0){
            return kms / vmed;
        }else{
            return 0;
        }
    }
    
    public double consumoMedio(){//Método que calcula el consumo medio de combustible en litros cada 100km
        if(kms > 0){
            return(litros * 100) / kms;
        }else{
            return 0;
        }
    }
    
    public double consumoEuros(){//Método que calcula el consumo en euros cada 100km
        return consumoMedio() * pgas;
    }
}