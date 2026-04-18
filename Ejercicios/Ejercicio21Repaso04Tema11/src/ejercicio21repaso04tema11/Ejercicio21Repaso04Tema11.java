package ejercicio21repaso04tema11;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Ejercicio21Repaso04Tema11 {

    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        String[] meses = new String[] {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", 
                "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        
        for (int i = 0; i < meses.length; i++) {
            hashSet.add(meses[i]);
            linkedHashSet.add(meses[i]);
        }
        
        System.out.println("---HASHSET---");
        for (String mes : hashSet) {
            System.out.println(mes + " ");
        }
        
        System.out.println("\n---LINKEDHASHSET---");
        for (String mes : linkedHashSet) {
            System.out.println(mes + " ");
        }
    }
}