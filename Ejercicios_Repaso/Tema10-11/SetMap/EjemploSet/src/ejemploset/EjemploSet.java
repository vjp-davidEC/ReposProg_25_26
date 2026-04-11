
package ejemploset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Ejemplo de conjuntos
 * 
 * @author Usuario
 */
public class EjemploSet {

    public static void mostrarSet(Set<String> conjunto) {
        Iterator<String> it = conjunto.iterator();
        
        String nombre;
        while(it.hasNext()) {
            nombre = it.next();
            System.out.println("Nombre: " + nombre);
        }   
    }
    
    public static void rellenarSet(Set<String> conjunto) {
        conjunto.add("Juan");
        conjunto.add("Pedro");
        conjunto.add("María");
        conjunto.add("Ana");
        conjunto.add("Daniel");
        conjunto.add("Daniel");
        conjunto.add("Daniel");
        conjunto.add("Sonia");
    }
    
    /**
     * Método main
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //HASH_SET
        Set<String> hashSet = new HashSet<>();
        rellenarSet(hashSet);
        
        System.out.println("*** HASH_SET ***");
        mostrarSet(hashSet);
        System.out.println("");
        
        //LINKED_HASH_SET
        Set<String> linkedHashSet = new LinkedHashSet<>();
        rellenarSet(linkedHashSet);
        
        System.out.println("*** LINKED_HASH_SET ***");
        mostrarSet(linkedHashSet);
        System.out.println("");
        
        //TREE_SET
        Set<String> treeSet = new TreeSet<>();
        rellenarSet(treeSet);
        
        System.out.println("*** TREE_SET ***");
        mostrarSet(treeSet);
        System.out.println("");
    }

}
