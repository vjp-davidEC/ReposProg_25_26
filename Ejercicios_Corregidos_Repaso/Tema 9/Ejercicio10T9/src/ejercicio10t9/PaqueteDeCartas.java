/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10t9;

/**
 *
 * @author admin
 */
public class PaqueteDeCartas {
    private Carta[] baraja;
    private int cartaActual;
    private String[] vValores;
    private String[] vPalos;
    private int[] vPuntos; 

    public PaqueteDeCartas() {
        vValores = new String[] {"AS", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez", "Jack", "Queen", "King"};
        vPalos = new String[] {"Corazones", "Diamantes", "Tréboles", "Picas"};
        vPuntos = new int[] {11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
        cartaActual = 0;
        baraja = new Carta[52];
        for(int i = 0;i < vValores.length;i++){
            for(int j = 0;j < vPalos.length;j++){
                baraja[i*4+j] = new Carta(vValores[i], vPalos[j], vPuntos[i]);
            }
        }
    }

    public Carta[] getBaraja() {
        return baraja;
    }

    public void setBaraja(Carta[] baraja) {
        this.baraja = baraja;
    }

    public int getCartaActual() {
        return cartaActual;
    }

    public void setCartaActual(int cartaActual) {
        this.cartaActual = cartaActual;
    }

    public String[] getvValores() {
        return vValores;
    }

    public void setvValores(String[] vValores) {
        this.vValores = vValores;
    }

    public String[] getvPalos() {
        return vPalos;
    }

    public void setvPalos(String[] vPalos) {
        this.vPalos = vPalos;
    }

    public int[] getvPuntos() {
        return vPuntos;
    }

    public void setvPuntos(int[] vPuntos) {
        this.vPuntos = vPuntos;
    }
    
    
    public void barajar(){
        Carta aux;
        int azar;
        for(int i = 0;i < this.baraja.length;i++){
            azar = (int)(Math.random()*52); //Número aleatorio entre 0 y 51
            aux = baraja[i];
            baraja[i] = baraja[azar];
            baraja[azar] = aux;
        }
    }
    
    public Carta repartirCarta(){
        Carta repartida = baraja[this.cartaActual];
        this.cartaActual++;
        return repartida;
    }
    
    public void mostrarBaraja(){
        int i;
        for(i = 0;i < this.baraja.length;i++){
            System.out.println(baraja[i].getValor()+ " de " + baraja[i].getPalo()+ ". " + baraja[i].getPuntos()+ " puntos.");
        }
    }
}
