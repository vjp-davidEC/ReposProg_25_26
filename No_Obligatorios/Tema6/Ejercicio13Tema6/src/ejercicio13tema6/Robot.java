/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13tema6;

/**
 *
 * @author DAVID
 */
public class Robot implements Operable, Revisable {
    //Atributos
    private boolean activo;
    private boolean estadoSistemas;
    private int nivelBateria;

    //Constructores
    public Robot(){
        activo = false;
        estadoSistemas = false;
        nivelBateria = 0;
    }
    public Robot(boolean estadoSistemas, int nivelBateria) {
        this.activo = false;
        this.estadoSistemas = estadoSistemas;
        this.nivelBateria = nivelBateria;
    }
    
    //Getters/Setters
    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public boolean isEstadoSistemas() {
        return estadoSistemas;
    }

    public void setEstadoSistemas(boolean estadoSistemas) {
        this.estadoSistemas = estadoSistemas;
    }

    public int getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(int nivelBateria) {
        this.nivelBateria = nivelBateria;
    }
    
    //Mostrar
    @Override
    public String toString() {
        return "Robot{" + "activo=" + activo + ", estadoSistemas=" + estadoSistemas + ", nivelBateria=" + nivelBateria + '}';
    }

    //Métodos abtractos de las interfaces Operable-Revisable
    @Override
    public void activar() {
        if (activo) {
            //Si ya estaba activo, se informa al usuario
            System.out.println("'El robot ya estaba activo'");
        } else if (!estadoSistemas) {
            //No se puede activar si los sistemas presentan fallos
            System.out.println("No se puede activar: Fallos en los sistemas");
        } else if (nivelBateria <= 20) {
            //No se puede activar si la batería está por debajo del 20%
            System.out.println("No se puede activar: Bateria insuficiente");
        } else {
            //Si pasa todas las validaciones, se activa correctamente
            activo = true;
            System.out.println("'El robot esta activado'");
        }
    }

    @Override
    public void desactivar() {
        if (activo) {
            //Si estaba activo, se desactiva
            activo = false;
            System.out.println("'El robot esta desactivado'");
        } else {
            //Si ya estaba apagado, se informa al usuario
            System.out.println("'El robot ya estaba desactivado'");
        }
    }

    @Override
    public String realizarRevision() {
        if (!estadoSistemas) {
            //Detecta fallos en los sistemas
            return "'Fallos detectados en los sistemas del robot'";
        } else if (nivelBateria <= 20) {
            //Detecta batería baja y muestra el nivel actual
            return "'La bateria del robot esta baja. Nivel de bateria: " + nivelBateria + "%'";
        } else {
            //Todo correcto: sistemas operativos y batería adecuada
            return "'Todos los sistemas estan operativos y el nivel de bateria es adecuado'";
        }
    }
}