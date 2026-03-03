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
        
        Bicicleta bici2 = new Bicicleta("Canondale", "Roja", "Carretera", 15, "David" , 18);
        System.out.println("");
        
        //Crear bici3 con el segundo conductor parametrizado
        Bicicleta bici3 = new Bicicleta("Mitical");
        bici3.setColor("Negro");
        bici3.setTipo("Montania");
        bici3.setAntiguedad(3);
        
        System.out.println("");
        
        System.out.println("Numero de bicicletas: " + Bicicleta.getContadorBicicletas());
        
        bici1.mostraBicicleta();
        System.out.println("");
        
        System.out.print(bici2.toString());
        System.out.println("");
        
        bici3.mostraBicicleta();
        System.out.println("");
        
        bici1.mostrarAntiguedad();
        bici2.mostrarAntiguedad();
    }
}