/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio19t2;

/**
 *
 * @author usuario
 */
public class Ejercicio19T2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 3, b = 6, c;
        c = a / b;
        System.out.println("El valor de c es: "+c);
        
        c = a % b;
        System.out.println("El valor de c es: "+c);
        
        /*
        i++ y ++i son muy similares pero no exactamente iguales. Ambos incrementan el número,
        pero ++i incrementan el número antes de que i++ se evalúe la expresión actual, 
        mientras que incrementa el número después de que se evalúa la expresión.
        
        Ejemplo: 
            int i = 3;
            int a = i++; // a = 3, i = 4
            int b = ++a; // b = 4, a = 4
        */
        
        a++;
        System.out.println("El valor de a es: "+a);
        
        ++a;
        System.out.println("El valor de a es: "+a);
        
        c = ++a + b++;
        System.out.println("El valor de a es: "+a);
        System.out.println("El valor de b es: "+b);
        System.out.println("El valor de c es: "+c);
        
        c = ++a + ++b;
        System.out.println("El valor de a es: "+a);
        System.out.println("El valor de b es: "+b);
        System.out.println("El valor de c es: "+c);
        
    }
    
}
