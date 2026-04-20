package ejercicio05;

public class Donacion implements Comparable<Donacion> {
    private String nombreDonante;
    private double cantidad;
    
    public Donacion() {
        nombreDonante = "";
        cantidad = 0;
    }

    public Donacion(String nombreDonante, double cantidad) {
        this.nombreDonante = nombreDonante;
        this.cantidad = cantidad;
    }

    public String getNombreDonante() {
        return nombreDonante;
    }

    public void setNombreDonante(String nombreDonante) {
        this.nombreDonante = nombreDonante;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "El donante es " + nombreDonante + " y la cantidad que ha dado ha sido " + cantidad + " Euros";
    }
    
    @Override
    public int compareTo(Donacion d) {
        if (this.cantidad < d.getCantidad()) {
            return 1;
        } else if (this.cantidad > d.getCantidad()) {
            return -1;
        } else {
            return 0;
        }
    }
}