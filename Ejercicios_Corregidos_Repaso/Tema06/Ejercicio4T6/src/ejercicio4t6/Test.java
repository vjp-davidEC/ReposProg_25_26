
package ejercicio4t6;

/**
 * Clase Test
 * 
 * @author Daniel
 */
public class Test {

    public static void main(String[] args) {
        
        Perro perro = new Perro("Lucas", 8, 30);
        System.out.println("**** PERRO *****");
        System.out.println(perro);
        perro.mostrarSonido();
        perro.mostrarAlimentacion();
        perro.mostrarHabitat();
        perro.mostrarNombreCientifico();
        
        Lobo lobo = new Lobo("Nelson", 12, 65);
        System.out.println("\n**** LOBO *****");
        System.out.println(lobo);
        lobo.mostrarSonido();
        lobo.mostrarAlimentacion();
        lobo.mostrarHabitat();
        lobo.mostrarNombreCientifico();
        
        Leon leon = new Leon("Noa", 10, 200);
        System.out.println("\n**** LEON *****");
        System.out.println(leon);
        leon.mostrarSonido();
        leon.mostrarAlimentacion();
        leon.mostrarHabitat();
        leon.mostrarNombreCientifico();
        
        Gato gato = new Gato("Bimba", 20, 3);
        System.out.println("\n**** GATO *****");
        System.out.println(gato);
        gato.mostrarSonido();
        gato.mostrarAlimentacion();
        gato.mostrarHabitat();
        gato.mostrarNombreCientifico();
        
        System.out.println("\n------ POLIMORFISMO ------");
        
        Animal animalPerro = new Perro("Lucas", 8, 30);
        System.out.println("\n**** PERRO *****");
        System.out.println(animalPerro);
        animalPerro.mostrarSonido();
        animalPerro.mostrarAlimentacion();
        animalPerro.mostrarHabitat();
        animalPerro.mostrarNombreCientifico();
        
        Animal animalLobo = new Lobo("Nelson", 12, 65);
        System.out.println("\n**** LOBO *****");
        System.out.println(animalLobo);
        animalLobo.mostrarSonido();
        animalLobo.mostrarAlimentacion();
        animalLobo.mostrarHabitat();
        animalLobo.mostrarNombreCientifico();
        
        Animal animalLeon = new Leon("Noa", 10, 200);
        System.out.println("\n**** LEON *****");
        System.out.println(animalLeon);
        animalLeon.mostrarSonido();
        animalLeon.mostrarAlimentacion();
        animalLeon.mostrarHabitat();
        animalLeon.mostrarNombreCientifico();
        
        Animal animalGato = new Gato("Bimba", 20, 3);
        System.out.println("\n**** GATO *****");
        System.out.println(animalGato);
        animalGato.mostrarSonido();
        animalGato.mostrarAlimentacion();
        animalGato.mostrarHabitat();
        animalGato.mostrarNombreCientifico();       
        
    }
}
