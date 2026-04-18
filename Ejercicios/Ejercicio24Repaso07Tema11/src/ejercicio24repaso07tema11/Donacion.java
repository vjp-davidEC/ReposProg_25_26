package ejercicio24repaso07tema11;

public class Donacion {
    //Atributos
    private String nombrePersona;
    private float cantidad;
    
    //Constructores
    public Donacion() {
        nombrePersona = "";
        cantidad = 0f;
    }

    public Donacion(String nombrePersona, float cantidad) {
        this.nombrePersona = nombrePersona;
        this.cantidad = cantidad;
    }
    
    //Getters/Setters
    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }
    
    //Mostrar
    @Override
    public String toString() {
        return " -NombrePersona: " + nombrePersona + "\n -Cantidad: " + cantidad;
    }
}