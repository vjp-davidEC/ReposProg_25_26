package ejercicio25repaso08tema11;

public class Sede implements Comparable<Sede>{
    //Atributos
    private String nombreSede;
    private double ingresos;
    
    //Constructores
    public Sede() {
        nombreSede = "";
        ingresos = 0;
    }

    public Sede(String nombreSede, double ingresos) {
        this.nombreSede = nombreSede;
        this.ingresos = ingresos;
    }
    
    //Getters/Setters
    public String getNombreSede() {
        return nombreSede;
    }

    public void setNombreSede(String nombreSede) {
        this.nombreSede = nombreSede;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }
    
    //Mostrar
    @Override
    public String toString() {
        return "Nombre de la sede: " + nombreSede + "\nIngresos: " + ingresos;
    }
    
    @Override
    public int compareTo(Sede s) {
        if (this.ingresos < s.getIngresos()) {
            return 1;
        } else if (this.ingresos > s.getIngresos()) {
            return -1;
        } else {
            return 0;
        }
    }
}