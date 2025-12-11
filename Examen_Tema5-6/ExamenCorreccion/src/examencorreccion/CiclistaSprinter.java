/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examencorreccion;

/**
 *
 * @author alumno
 */
public class CiclistaSprinter extends Ciclistas implements Pedaleable{
    //Atributo
    private double aceleracion;
    
    //Constructores
    public CiclistaSprinter() {
        super();
        this.aceleracion = 0;
    }

    public CiclistaSprinter(double aceleracion, String nombre, int energia, boolean estaEscapado, double kmDeMeta, int numeroBidones, double velocidad, int nivelHidratacion) {
        super(nombre, energia, estaEscapado, kmDeMeta, numeroBidones, velocidad, nivelHidratacion);
        this.aceleracion = aceleracion;
    }

    //Getter/Setter
    public double getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(double aceleracion) {
        this.aceleracion = aceleracion;
    }

    //Mostrar
    @Override
    public String toString() {
        return super.toString() + "CiclistaSprinter" + " aceleracion: " + aceleracion;
    }
    
    //Llamamos los métodos abstractos {comer-beber}
    @Override
    public void comer(){
        if(getKmDeMeta() > 10){
            setEnergia(getEnergia() + 25);
            System.out.println("El sprinter " + getNombre() + " acaba de tomar un gel."
                        + " Su energia ahora es de " + getEnergia());
        }
    }
    
    @Override
    public void beber(){
        if(getNumeroBidones() <= 0){
            cogerBidones();
        }
        
        setNivelHidratacion(getNivelHidratacion() + 5);
        tirarBidones();
        System.out.println("El sprinter " + getNombre() + " se ha hidratado."
                    + " Su nivel de hidratacion es de " + getNivelHidratacion());
    }
    
    //Llamamos a los métodos de la interfaz
    @Override
    public void sprintar(){
        if(getKmDeMeta() < 1 && getEnergia() >= 50){
            setVelocidad(getEnergia() + aceleracion);
            setEnergia(getEnergia() - 50);
            System.out.println("El sprinter " + getNombre() + " esta esprintando a " + getVelocidad() + " km/h");
        }else{
            System.out.println("Aun no puedes esprintar");
        }
    }
    
    @Override
    public void atacar(){
        if(!isEstaEscapado()){
            setEstaEscapado(true);
            setNivelHidratacion(getNivelHidratacion() - (10/100));
            System.out.println("El sprinter " + getNombre() + " esta atacando");
        }
    }
    
    @Override
    public float recuperar(int kmRecuperacion){
        if(getKmDeMeta() > 5){
            setEnergia(getEnergia() + (5 * kmRecuperacion));
            System.out.println(getNombre() + " esta recuperando");
        }
        return getEnergia();
    }
}
