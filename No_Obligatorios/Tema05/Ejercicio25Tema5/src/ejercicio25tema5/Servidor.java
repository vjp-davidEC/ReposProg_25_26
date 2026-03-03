/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio25tema5;

/**
 *
 * @author DAVID
 */
public class Servidor extends Ordenador{//Clase que se hereda de Ordenador
    //Atributos
    private double tamanioMonitor;
    private String modeloTeclado;
    private String modeloRaton;
    
    //Constructores
    public Servidor(){
        super();//Se pone para llamar al constructor de la clase Ordenador sin parámetros
        tamanioMonitor = 0;
        modeloTeclado = "";
        modeloRaton = "";
    }
    
    public Servidor(int cram, int cdd, String mp, String mtg, double p, double tm, String mt, String mr){
        super(cram, cdd, mp, mtg, p);//Se pone para llamar al constructor de la clase Ordenador con parámetros
        tamanioMonitor = tm;
        modeloTeclado = mt;
        modeloRaton = mr;
    }
    
    //Getter y setters/establecer
    public double getTamanioMonitor() {
        return tamanioMonitor;
    }

    public void establecerTamanioMonitor(double tm) {
        tamanioMonitor = tm;
    }

    public String getModeloTeclado() {
        return modeloTeclado;
    }

    public void establecerModeloTeclado(String mt) {
        modeloTeclado = mt;
    }

    public String getModeloRaton() {
        return modeloRaton;
    }

    public void establecerModeloRaton(String mr) {
        modeloRaton = mr;
    }
    
    //Mostrar
    public void mostrarDatosServidor(){
        super.mostrarDatosOrdenador();
        System.out.println("Tamanio del monitor: " + getTamanioMonitor() + " pulgadas");
        System.out.println("Modelo del teclado: " + getModeloTeclado());
        System.out.println("Modelo del raton: " + getModeloRaton());
    }
}