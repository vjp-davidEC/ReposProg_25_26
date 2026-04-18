package ejercicio16repaso15tema10;

public class Empleados {
    //Atributos
    private String nombreEmpleado;
    private int sueldo;
    
    //Constructores
    public Empleados() {
        nombreEmpleado = "";
        sueldo = 0;
    }

    public Empleados(String nombreEmpleado, int sueldo) {
        this.nombreEmpleado = nombreEmpleado;
        this.sueldo = sueldo;
    }

    //Getters/Setters
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    //Mostrar
    @Override
    public String toString() {
        return "El nombre del empleado es " + nombreEmpleado + " y tiene un sueldo de " + sueldo;
    }
}