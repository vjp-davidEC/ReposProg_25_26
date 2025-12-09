/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

/**
 *
 * @author alumno
 */
public abstract class Ciclistas {
    //Atributo estático
    private static int numeroCiclistasCreados;
    
    //Atributos
    private String nombre;
    private int energia;
    private boolean estaEscapado;
    private double kmDeMeta;
    private int numeroBidones;
    private double velocidad;
    private int nivelHidratacion;
    
    //Constructores
    public Ciclistas(){
        this.nombre = "";
        this.energia = 50;
        this.estaEscapado = false;
        this.kmDeMeta = 120;
        this.numeroBidones = 2;
        this.velocidad = 0;
        this.nivelHidratacion = 50;
    }

    public Ciclistas(String nombre, int energia, boolean estaEscapado, double kmDeMeta, int numeroBidones, double velocidad, int nivelHidratacion) {
        this.nombre = nombre;
        this.energia = energia;
        this.estaEscapado = estaEscapado;
        this.kmDeMeta = kmDeMeta;
        this.numeroBidones = numeroBidones;
        this.velocidad = velocidad;
        this.nivelHidratacion = nivelHidratacion;
    }

    //Getters/Setters
    public static int getNumeroCiclistasCreados() {
        return numeroCiclistasCreados;
    }

    public static void setNumeroCiclistasCreados(int numeroCiclistasCreados) {
        Ciclistas.numeroCiclistasCreados = numeroCiclistasCreados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public boolean isEstaEscapado() {
        return estaEscapado;
    }

    public void setEstaEscapado(boolean estaEscapado) {
        this.estaEscapado = estaEscapado;
    }

    public double getKmDeMeta() {
        return kmDeMeta;
    }

    public void setKmDeMeta(double kmDeMeta) {
        this.kmDeMeta = kmDeMeta;
    }

    public int getNumeroBidones() {
        return numeroBidones;
    }

    public void setNumeroBidones(int numeroBidones) {
        this.numeroBidones = numeroBidones;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public int getNivelHidratacion() {
        return nivelHidratacion;
    }

    public void setNivelHidratacion(int nivelHidratacion) {
        this.nivelHidratacion = nivelHidratacion;
    }

    //Mostrar
    @Override
    public String toString() {
        return "Ciclistas: " + nombre + ", con energia " + energia + ", esta " + estaEscapado + ", esta a " + kmDeMeta + " km de meta " + ", numeroBidones " + numeroBidones + ", velocidad " + velocidad + " y nivelHidratacion " + nivelHidratacion;
    }
    
    //Métodos
    private void cogerBidones(){
        if(kmDeMeta > 10){
            numeroBidones += 2;
        }else{
            System.out.println("No puedes coger bidones a menos de 10 km de meta");
        }
    }
    
    private void tirarBidones(){
        numeroBidones -= 1;
    }
    
    //Métodos abstractos
    public abstract void comer();
    public abstract void beber();
    
    public void aumentarNumeroCiclistas(){
        numeroCiclistasCreados++;
    }
    
    public void numeroCiclistas(){
        System.out.println("Los ciclistas creados son: " + numeroCiclistasCreados);
    }
}
