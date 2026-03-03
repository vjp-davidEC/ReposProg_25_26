/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01tema5;

/**
 *
 * @author DAVID
 */
public class Ejercicio01Tema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        
        Coche miCoche = new Coche();//Crear el primer coche y establecer los atributos
        miCoche.establecerMarca("Ferrari");
        miCoche.establecerModelo("Amalfi");
        miCoche.establecerColor("Rojo");
        
        System.out.println(""); 
       
        Coche cochePadre = new Coche();//Crear el segundo coche y establecer los atributos
        cochePadre.establecerMarca("Lamborghini");
        cochePadre.establecerModelo("Huracan STO");
        cochePadre.establecerColor("Negro");
        
        System.out.println("");
        
        miCoche.arrancarCoche();//Decir a mi coche que arranque
        cochePadre.arrancarCoche();//Decir a cochePadre que arranque
        
        for (i = 0; i < 5; i++){//Acelerar miCoche 5 veces
            miCoche.acelerarCoche();
        }
        
        for (i = 0; i < 2; i++){//Frenar miCoche 2 veces
            miCoche.frenarCoche();
        }
        
        for (i = 0; i < 3; i++){//Acelerar cochePadre 3 veces
            cochePadre.acelerarCoche();
        }
        
        cochePadre.apagarCoche();//Apagar cochePadre
        
        System.out.println("\nEstado de mi coche: ");//Mostrar el estado actual de miCoche
        miCoche.obtenerEstado();
        
        System.out.println("\nEstado de cochePadre: ");//Mostrar el estado actual de cochePadre
        cochePadre.obtenerEstado();
    }
}