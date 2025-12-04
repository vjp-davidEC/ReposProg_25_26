/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio09tema6;

/**
 *
 * @author alumno
 */
public class Vehiculo implements Gravable {
    //Atributo
    private int cc;
    private String matricula;
    private String dniPropietario;
    
    //Constructores
    public Vehiculo(){
        cc = 0;
        matricula = "";
        dniPropietario = "";
    }

    public Vehiculo(int cc, String matricula, String dniPropietario) {
        this.cc = cc;
        this.matricula = matricula;
        this.dniPropietario = dniPropietario;
    }
    
    //Getters/Setters
    public int getCc() {    
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDniPropietario() {
        return dniPropietario;
    }

    public void setDniPropietario(String dniPropietario) {    
        this.dniPropietario = dniPropietario;
    }

    //Mostrar
    public void mostrarDatos() {
        System.out.println("--VEHICULO--");
        System.out.println("Matricula: " + matricula);
        System.out.println("Cilindrada: " + cc + " cc");
        System.out.println("Propietario (DNI): " + dniPropietario);
        System.out.println("Impuesto de circulacilon: " + calcularImpuesto() + " euros");
    }

    //Método de la interfaz Gravable
    @Override
    public double calcularImpuesto() {
        if (cc < 1000) {
            return 12;
        } else if (cc <= 1499) {
            return 34;
        } else if (cc <= 1999) {
            return 71;
        } else if (cc <= 2999) {
            return 122;
        } else {
            return 152;
        }
    }
}