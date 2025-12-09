/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen;

/**
 *
 * @author alumno
 */
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CiclistaEscalador ciclisEscal = new CiclistaEscalador(50, 20, "Javier", 50, true, 20, 2, 35.67, 60);
        CiclistaSprinter cilisSprint = new CiclistaSprinter(25, "Lucas", 80, true, 4, 3, 30, 40);
        
        System.out.println("Los ciclistas creados son: " + Ciclistas.getNumeroCiclistasCreados());
        
        Ciclistas c = ciclisEscal;
        Ciclistas ciclisSprint2 = cilisSprint;
        
        System.out.println("\n--ESCALADOR");
        System.out.println(c.toString());
        c.comer();
        c.beber();
        System.out.println(c.toString());
        System.out.println("\n--SPRINTER--");
        System.out.println(ciclisSprint2.toString());
        ciclisSprint2.comer();
        ciclisSprint2.beber();
        System.out.println(ciclisSprint2.toString());
        
        Pedaleable ciclisEscal3 = (CiclistaEscalador) ciclisEscal;
        Pedaleable ciclisSprint3 = (CiclistaSprinter) cilisSprint;
        
        System.out.println("--ESCALADORx2--");
        System.out.println(ciclisEscal3.toString());
        ciclisEscal3.atacar();
        ciclisEscal3.recuperar(6);
        ciclisEscal3.sprintar();
        System.out.println(ciclisEscal3.toString());
        System.out.println("\n--SPRINTERx2--");
        System.out.println(ciclisSprint3.toString());
        ciclisSprint3.atacar();
        ciclisSprint3.recuperar(2);
        ciclisSprint3.sprintar();
        System.out.println(ciclisSprint3.toString());
    }
    
}
