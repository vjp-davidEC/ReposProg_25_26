/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examencorreccion;

/**
 *
 * @author alumno
 */
public class CiclistaEscalador extends Ciclistas implements Pedaleable{
    //Atributos
    private double potencia;
    private double fuerza;

    //Constructores
    public CiclistaEscalador() {
        super();
        this.potencia = 0;
        this.fuerza = 0;
    }

    public CiclistaEscalador(double potencia, double fuerza, String nombre, int energia, boolean estaEscapado, double kmDeMeta, int numeroBidones, double velocidad, int nivelHidratacion) {
        super(nombre, energia, estaEscapado, kmDeMeta, numeroBidones, velocidad, nivelHidratacion);
        this.potencia = potencia;
        this.fuerza = fuerza;
    }

    //Getters/Setters
    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double getFuerza() {
        return fuerza;
    }

    public void setFuerza(double fuerza) {
        this.fuerza = fuerza;
    }

    //Mostrar
    @Override
    public String toString() {
        return super.toString() + "CiclistaEscalador" + " potencia: " + potencia + " y fuerza: " + fuerza;
    }
    
    //Llamamos los métodos abstractos {comer-beber}
    @Override
    public void comer(){
        if(getKmDeMeta() > 20){
            setEnergia(getEnergia() + 30);
            System.out.println("El escalador " + getNombre() + " acaba de tomar un gel."
                    + " Su energia ahora es de " + getEnergia());
        }
    }
    
    @Override
    public void beber(){
        if(getNumeroBidones() <= 0){
            cogerBidones();
        }
        
        setNivelHidratacion(getNivelHidratacion() + 10);
        tirarBidones();
        tirarBidones();
        System.out.println("El escalador " + getNombre() + " se ha hidratado."
                    + " Su nivel de hidratacion es de " + getNivelHidratacion());
    }
    
    //Llamamos a los métodos de la 
    @Override
    public void sprintar(){
        if(getKmDeMeta() < 0.3 && getEnergia() >= 20){
            setVelocidad(potencia/fuerza);
            setEnergia(getEnergia() - 20);
            System.out.println("El escalador " + getNombre() + " esta esprintando a " + getVelocidad() + " km/h");
        }else{
            System.out.println("Aun no puedes esprintar");
        }
    }
    
    @Override
    public void atacar(){
        if(!isEstaEscapado()){
            setEstaEscapado(true);
            setNivelHidratacion(getNivelHidratacion() - (20/100));
            System.out.println("El escalador " + getNombre() + " esta atacando");
        }
    }
    
    @Override
    public float recuperar(int kmRecuperacion){
        if(getKmDeMeta() > 15){
            setEnergia(getEnergia() + (5 * kmRecuperacion));
            System.out.println(getNombre() + " esta recuperando");
        }
        return getEnergia();
    }
}
