package ejercicio06;

public class Producto implements Comparable<Producto> {
    private String nombre;
    private double precio;
    
    public Producto() {
        nombre = "";
        precio = 0;
    }

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "El producto " + nombre + " tiene un precio de " + precio + " Euros";
    }
    
    @Override
    public int compareTo(Producto p) {
        if (this.precio < p.getPrecio()) {
            return 1;
        } else if (this.precio > p.getPrecio()) {
            return -1;
        } else {
            return 0;
        }
    }
}