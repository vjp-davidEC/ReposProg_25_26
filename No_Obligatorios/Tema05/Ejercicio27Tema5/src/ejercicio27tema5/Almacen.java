/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio27tema5;

/**
 *
 * @author DAVID
 */
public class Almacen {
    //Atributos
    private int papasKg;
    private int chocosKg;
    
    //Constructores
    public Almacen(){
        papasKg = 0;
        chocosKg = 0;
    }
    
    public Almacen(int pkg, int ckg){
        papasKg = pkg;
        chocosKg = ckg;
    }
    
    //Getters y setters
    public int getPapasKg() {
        return papasKg;
    }

    public void setPapasKg(int pkg) {
        papasKg = pkg;
    }

    public int getChocosKg() {
        return chocosKg;
    }

    public void setChocosKg(int ckg) {
       chocosKg = ckg;
    }
    
    //Método para aniadir kilos de chocos y papas al almacen
    public void addChocos(int x){
        if(x > 0){
            chocosKg = chocosKg + x;
        }
    }
    
    public void addPapas(int x){
        if(x > 0){
            papasKg = papasKg + x;
        }
    }
    
    //Método que muestra los kilos de chocos y papas disponibles
    public void showChocos(){
        System.out.println("Quedan " + chocosKg + " kilos de chocos en el almacen");
    }
    
    public void showPapas(){
        System.out.println("Quedan " + papasKg + " kilos de papas en el almacen");
    }
    
    //Método que calcula cuantos comersales se pueden atender
    public int getComersales(){
        int porPapas = papasKg * 3;
        int porChocos = chocosKg * 6;
        return Math.min(porPapas, porChocos);//Devolver el kilo de papas y chocos para poder atender a los clientes
    }
}