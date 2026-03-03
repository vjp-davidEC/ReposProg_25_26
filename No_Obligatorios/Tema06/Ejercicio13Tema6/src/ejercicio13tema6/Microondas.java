/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13tema6;

/**
 *
 * @author DAVID
 */
public class Microondas implements Operable, Revisable {
    //Atributos
    private boolean activo;
    private boolean estadoCalentador;
    private boolean puertaCerrada;

    //Constructores
    public Microondas(){
        activo = false;
        estadoCalentador = false;
        puertaCerrada = false;
    }
    public Microondas(boolean estadoCalentador, boolean puertaCerrada) {
        this.activo = false;
        this.estadoCalentador = estadoCalentador;
        this.puertaCerrada = puertaCerrada;
    }
    
    //Getters/Setters
    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public boolean getEstadoCalentador() {
        return estadoCalentador;
    }

    public void setEstadoCalentador(boolean estadoCalentador) {
        this.estadoCalentador = estadoCalentador;
    }

    public boolean getPuertaCerrada() {
        return puertaCerrada;
    }

    public void setPuertaCerrada(boolean puertaCerrada) {
        this.puertaCerrada = puertaCerrada;
    }

    //Mostrar
    @Override
    public String toString() {
        return "Microondas{" + "activo=" + activo + ", estadoCalentador=" + estadoCalentador + ", puertaCerrada=" + puertaCerrada + '}';
    }

    //Métodos abtractos de las interfaces Operable-Revisable
    @Override
    public void activar() {
        if (activo) {
            //Si ya estaba activo, se informa al usuario
            System.out.println("'El microondas ya estaba activo'");
        } else if (!estadoCalentador) {
            //No se puede activar si el calentador está averiado
            System.out.println("No se puede activar: El calentador no funciona");
        } else if (!puertaCerrada) {
            //No se puede activar si la puerta está abierta
            System.out.println("No se puede activar: La puerta esta abierta");
        } else {
            //Si pasa todas las validaciones, se activa correctamente
            activo = true;
            System.out.println("'El microondas esta activado'");
        }
    }

    @Override
    public void desactivar() {
        if (activo) {
            //Si estaba activo, se desactiva
            activo = false;
            System.out.println("'El microondas esta desactivado'");
        } else {
            //Si ya estaba apagado, se informa al usuario
            System.out.println("'El microondas ya estaba desactivado'");
        }
    }

    @Override
    public String realizarRevision() {
        if (!estadoCalentador) {
            //Detecta fallo en el calentador
            return "'Fallos detectados en el calentador del microondas'";
        } else if (!puertaCerrada) {
            //Detecta puerta abierta
            return "'La puerta esta abierta. Por favor, cierrala'";
        } else {
            //Todo correcto
            return "'El calentador funciona correctamente y la puerta esta cerrada'";
        }
    }
}