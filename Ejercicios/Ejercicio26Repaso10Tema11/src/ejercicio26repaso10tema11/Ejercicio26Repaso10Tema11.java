package ejercicio26repaso10tema11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Ejercicio26Repaso10Tema11 {

    public static void main(String[] args) {
        Set<Persona> conjuntoTree = new TreeSet<>();
        conjuntoTree.add(new Persona("Quique", 38));
        conjuntoTree.add(new Persona("Elena", 26));
        conjuntoTree.add(new Persona("Alba", 33));
        conjuntoTree.add(new Persona("Julian", 45));
        conjuntoTree.add(new Persona("Martin", 7));
        
        System.out.println("Mostrando TreeSet \n");
        mostrarConjunto(conjuntoTree);
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
        
        //LINKEDHASHSET
        Set<Persona> conjuntoLinkedHash = new LinkedHashSet<>();
        conjuntoLinkedHash.add(new Persona("Quique", 38));
        conjuntoLinkedHash.add(new Persona("Elena", 26));
        conjuntoLinkedHash.add(new Persona("Alba", 33));
        conjuntoLinkedHash.add(new Persona("Julian", 45));
        conjuntoLinkedHash.add(new Persona("Martin", 7));
        
        System.out.println("Mostrando LinkedHashSet \n");
        mostrarConjunto(conjuntoLinkedHash);
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
        Map<Integer, Persona> mapaTree = new TreeMap<>();
        mapaTree.put(1, new Persona("Quique", 38));
        mapaTree.put(2, new Persona("Elena", 26));
        mapaTree.put(3, new Persona("Alba", 33));
        mapaTree.put(4, new Persona("Julian", 45));
        mapaTree.put(5, new Persona("Martin", 7));
        
        System.out.println("Mostrando TreeMap \n");
        mostrarMapa(mapaTree);
        
        //HASHMAP
        Map<Integer, Persona> mapaHash = new HashMap<>();
        mapaHash.put(1, new Persona("Quique", 38));
        mapaHash.put(2, new Persona("Elena", 26));
        mapaHash.put(3, new Persona("Alba", 33));
        mapaHash.put(4, new Persona("Julian", 45));
        mapaHash.put(5, new Persona("Martin", 7));
        
        System.out.println("");
        System.out.println("Mostrando HashMap \n");
        mostrarMapa(mapaHash);
        
        //LINKEDHASHMAP
        Map<Integer, Persona> mapaLinkedHash = new LinkedHashMap<>();
        mapaLinkedHash.put(1, new Persona("Quique", 38));
        mapaLinkedHash.put(2, new Persona("Elena", 26));
        mapaLinkedHash.put(3, new Persona("Alba", 33));
        mapaLinkedHash.put(4, new Persona("Julian", 45));
        mapaLinkedHash.put(5, new Persona("Martin", 7));
        
        System.out.println("");
        System.out.println("Mostrando LinkedHashMap \n");
        mostrarMapa(mapaLinkedHash);
    }
    
    public static void mostrarConjunto(Set<Persona> conjunto) {
        if(conjunto.isEmpty()) {
              System.out.println("El conjunto esta vacio");
        } else {
            Iterator<Persona> it = conjunto.iterator();

            Persona pAux;
            while(it.hasNext()) {
                pAux = it.next();
                System.out.println(pAux);
            }
        }    
    }
    
    public static void mostrarLista(List<Persona> lista) {       
        if(lista.isEmpty()) {
            System.out.println("La lista esta vacia");
        } else {
            for(Persona pAux : lista) {
                System.out.println(pAux);
            }
        }
    }
    
    public static void mostrarMapa(Map<Integer, Persona> mapa) {
        if(mapa.isEmpty()) {
              System.out.println("El mapa esta vacio");
        } else {
            Iterator<Integer> it = mapa.keySet().iterator();

            Integer clave;
            Persona pAux;
            while(it.hasNext()) {
                clave = it.next();
                pAux = mapa.get(clave);
                
                System.out.println("Clave: " + clave);
                System.out.println(pAux);
            }
        }    
    }
}