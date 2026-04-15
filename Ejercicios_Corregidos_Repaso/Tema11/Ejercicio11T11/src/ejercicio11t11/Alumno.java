/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11t11;

/**
 *
 * @author Usuario
 */
public class Alumno implements Comparable<Alumno> {
    private String dni;
    private int numExpediente;
    private float notaMedia;

    public Alumno() {
        this.dni = "";
        this.numExpediente = 0;
        this.notaMedia = 0.0f;
    }
    
    public Alumno(String dni, int numExpediente, float notaMedia) {
        this.dni = dni;
        this.numExpediente = numExpediente;
        this.notaMedia = notaMedia;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getNumExpediente() {
        return numExpediente;
    }

    public void setNumExpediente(int numExpediente) {
        this.numExpediente = numExpediente;
    }

    public float getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(float notaMedia) {
        this.notaMedia = notaMedia;
    }

    @Override
    public String toString() {
        return "Alumno{" + "dni=" + dni + ", numExpediente=" + numExpediente + ", notaMedia=" + notaMedia + '}';
    }

    
    @Override
    public int compareTo(Alumno t) {
        if  (this.numExpediente < t.getNumExpediente()){
            return -1;
        }
        else{
            if  (this.numExpediente > t.getNumExpediente()){
                return 1;
            }
            else{
                return 0;
            }
        }
    }
}
