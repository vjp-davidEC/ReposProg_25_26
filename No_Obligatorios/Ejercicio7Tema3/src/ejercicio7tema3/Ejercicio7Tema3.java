/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7tema3;
import java.util.Scanner;
/**
 *
 * @author DAVID
 */
public class Ejercicio7Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int diasSemana;
        boolean laborable = false;
        
        System.out.println("Por favor, introduce un numero de dia de la semana:");
        diasSemana = entrada.nextInt();
        
        switch (diasSemana) {
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
                laborable = true;
                break;//Le decimos que del 1 al 5 se trabaja y por eso se para hasta el break
            case 6: 
            case 7: 
                laborable = false;//Le decimos que el 6 y 7 no se trabaja y por eso tmb se para en el break
        }
        if (diasSemana == 0 || diasSemana > 7){
            System.out.println("Numero de dia invalido");//Lo pongo para que quede en cuenta que 0 y mayor a 7 salga que invalido
        }
        if (laborable) {
            System.out.println("El dia " + diasSemana + " es laborable");
        }else {
            System.out.println("El dia " + diasSemana + " no es laborable");
        }
    }
    
}
