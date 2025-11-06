/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebatema5;

/**
 *
 * @author alumno
 */
public class PruebaTema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Bicicleta bici1 = new Bicicleta();
        bici1.setMarca("Orbea");
        bici1.setColor("Azul");
        bici1.setTipo("Montania");
        bici1.setAntiguedad(6);
        
        Bicicleta bici2 = new Bicicleta();
        bici2.setMarca("Canondale");
        bici2.setColor("Roja");
        bici2.setTipo("Carretera");
        bici2.setAntiguedad(15);
        
        System.out.println("");
        
        bici1.mostraBicicleta();
        System.out.println("");
        bici2.mostraBicicleta();
        System.out.println("");
        
        bici1.mostrarAntiguedad();
        bici2.mostrarAntiguedad();
        
    }
    
}
