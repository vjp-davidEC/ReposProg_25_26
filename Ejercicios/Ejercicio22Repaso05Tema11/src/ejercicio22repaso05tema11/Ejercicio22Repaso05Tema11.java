package ejercicio22repaso05tema11;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Ejercicio22Repaso05Tema11 {

    public static void main(String[] args) {
        Map<Integer,String> treeMap = new TreeMap<>();
        Map<Integer,String> linkedHashMap = new LinkedHashMap<>();
        String[] meses = new String[] {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", 
                "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        
        for (int i = meses.length - 1; i >= 0; i--) {
            treeMap.put(i + 1, meses[i]);
            linkedHashMap.put(i + 1, meses[i]);
        }
        
        Iterator<Integer> it;
        Integer clave = 0;
        
        System.out.println("---TREEMAP---");
        it = treeMap.keySet().iterator();
        while (it.hasNext()) {
            clave = it.next();
            System.out.println("Clave: " + clave + ", valor: " + treeMap.get(clave));
        }
        
        System.out.println("\n---LINKEDHASHMAP---");
        it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            clave = it.next();
            System.out.println("Clave: " + clave + ", valor: " + linkedHashMap.get(clave));
        }
    }
}