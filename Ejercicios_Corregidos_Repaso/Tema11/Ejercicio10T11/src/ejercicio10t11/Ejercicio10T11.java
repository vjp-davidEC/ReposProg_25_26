
package ejercicio10t11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Ejercicio10T11
 * 
 * @author Usuario
 */
public class Ejercicio10T11 {

    /* Métodos mostrar */
    
    public static void mostrarConjunto(Set<Persona> conjunto) {
        if(!conjunto.isEmpty()) {
            Iterator<Persona> it = conjunto.iterator();

            Persona pAux;
            while(it.hasNext()) {
                pAux = it.next();
                System.out.println(pAux);
            }  
        } else {
            System.out.println("El conjunto está vacío");
        }    
    }
    
    public static void mostrarLista(List<Persona> lista) {       
        if(!lista.isEmpty()) {
            for(Persona pAux : lista) {
                System.out.println(pAux);
            }
        } else {
            System.out.println("La lista está vacía");
        }
    }
    
    public static void mostrarMapa(Map<Integer, Persona> mapa) {
        if(!mapa.isEmpty()) {
            Iterator<Integer> it = mapa.keySet().iterator();

            Integer clave;
            Persona pAux;
            while(it.hasNext()) {
                clave = it.next();
                pAux = mapa.get(clave);
                
                System.out.println("Clave: " + clave);
                System.out.println(pAux);
            }  
        } else {
            System.out.println("El mapa está vacío");
        }    
    }
    
    /**
     * Método main
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        //TREESET
        Set<Persona> conjunto = new TreeSet<>();
        conjunto.add(new Persona("Quique", 38));
        conjunto.add(new Persona("Elena", 26));
        conjunto.add(new Persona("Alba", 33));
        conjunto.add(new Persona("Julian", 45));
        conjunto.add(new Persona("Martin", 7));
        
        System.out.println("Mostrando TreeSet \n");
        mostrarConjunto(conjunto);
        System.out.println("");
        
        //HASHSET
        Set<Persona> conjuntoHash = new HashSet<>();
        conjuntoHash.add(new Persona("Quique", 38));
        conjuntoHash.add(new Persona("Elena", 26));
        conjuntoHash.add(new Persona("Alba", 33));
        conjuntoHash.add(new Persona("Julian", 45));
        conjuntoHash.add(new Persona("Martin", 7));
        
        System.out.println("Mostrando HashSet \n");
        mostrarConjunto(conjuntoHash);
        System.out.println("");
        
        //ARRAYLIST
        List<Persona> lista = new ArrayList<>();
        lista.add(new Persona("Quique", 38));
        lista.add(new Persona("Elena", 26));
        lista.add(new Persona("Alba", 33));
        lista.add(new Persona("Julian", 45));
        lista.add(new Persona("Martin", 7));
        
        Collections.sort(lista);
        System.out.println("Mostrando ArrayList \n");
        mostrarLista(lista);
        System.out.println("");
        
        //TREEMAP
        Map<Integer, Persona> mapa = new TreeMap<>();
        mapa.put(1, new Persona("Quique", 38));
        mapa.put(2, new Persona("Elena", 26));
        mapa.put(3, new Persona("Alba", 33));
        mapa.put(4, new Persona("Julian", 45));
        mapa.put(5, new Persona("Martin", 7));
        
        System.out.println("Mostrando Mapa \n");
        mostrarMapa(mapa);
    }
    
}
