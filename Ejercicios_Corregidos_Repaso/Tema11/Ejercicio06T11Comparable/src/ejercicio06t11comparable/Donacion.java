
package ejercicio06t11comparable;

/**
 * Clase Donación
 * 
 * @author Usuario
 */
public class Donacion implements Comparable<Donacion> {
    
    //ATRIBUTOS
    private String donante;
    private int importeDonacion;

    //CONSTRUCTORES
    public Donacion() {
        this.donante = "";
        this.importeDonacion = 0;
    }
    
    public Donacion(String donante, int importeDonacion) {
        this.donante = donante;
        this.importeDonacion = importeDonacion;
    }

    //GETTERS Y SETTERS
    public String getDonante() {
        return donante;
    }

    public void setDonante(String donante) {
        this.donante = donante;
    }

    public int getImporteDonacion() {
        return importeDonacion;
    }

    public void setImporteDonacion(int importeDonacion) {
        this.importeDonacion = importeDonacion;
    }
        
    //MOSTRAR DONACIÓN
    public void mostrarDonacion(){
        System.out.println("Donante: " + this.donante);
        System.out.println("Importe: " + this.importeDonacion);
    }

    @Override
    public int compareTo(Donacion d) {
        if(this.importeDonacion < d.getImporteDonacion()) {
            return 1;
        } else if (this.importeDonacion > d.getImporteDonacion()) {
            return -1;
        } else {
            return 0;
        }        
    }
    
}
