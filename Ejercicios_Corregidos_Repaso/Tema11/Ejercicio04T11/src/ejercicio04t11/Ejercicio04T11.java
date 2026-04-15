package ejercicio04t11;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Ejercicio04T11
 * 
 * @author Usuario
 */
public class Ejercicio04T11 {

    /**
     * Método main
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] meses = 
                new String[] {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", 
                "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        
        for(int i=0; i<meses.length; i++) {
            hashSet.add(meses[i]);
            linkedHashSet.add(meses[i]);
        }
        
        //HashSet
        System.out.println("HashSet: ");
        for(String mes: hashSet) {
            System.out.print(mes + " ");
        }
        System.out.println("\n");
        
        //LinkedHashSet
        System.out.println("LinkedHashSet: ");
        for(String mes: linkedHashSet) {
            System.out.print(mes + " ");
        }     
        System.out.println("\n");
        
    }
    
}
