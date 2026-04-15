
package ejercicio05t11;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Ejercicio05T11
 * 
 * @author Usuario
 */
public class Ejercicio05T11 {

    /**
     * Método main
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] meses = 
            new String[] {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", 
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        
        Map<Integer, String> treeMap = new TreeMap<>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        
        for(int i=meses.length - 1; i>=0; i--) {
            treeMap.put(i + 1, meses[i]);
            linkedHashMap.put(i + 1, meses[i]);
        }
        
        Iterator<Integer> it;
        Integer clave = 0;
        
        //TreeMap
        System.out.println("TreeMap: ");
        it = treeMap.keySet().iterator();
        while(it.hasNext()) {
            clave = it.next();
            System.out.println("Clave: " + clave + ". Valor: " + treeMap.get(clave));
        }
        System.out.println("\n");
        
        //LinkedHashMap
        System.out.println("LinkedHashMap: ");      
        it = linkedHashMap.keySet().iterator();
        while(it.hasNext()) {
            clave = it.next();
            System.out.println("Clave: " + clave + ". Valor: " + linkedHashMap.get(clave));
        }
        System.out.println("\n");
    }
    
}
