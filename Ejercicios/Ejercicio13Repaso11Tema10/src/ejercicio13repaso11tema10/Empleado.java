package ejercicio13repaso11tema10;

public class Empleado {
    private String nombre;
    private int horas;
    private int tarifa;

    /* COnstructor por defecto */
    public Empleado() {
        this.nombre = "";
        this.horas = 0;
        this.tarifa = 0;
    }
    
    /* COnstructor parametrizado */
    public Empleado(String nombre, int horas, int tarifa) {
        this.nombre = nombre;
        this.horas = horas;
        this.tarifa = tarifa;
    }

    /* Getters y Setters */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getTarifa() {
        return tarifa;
    }

    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }
    
    /* Muestra los atributos del empleado */
    public void mostrarEmpleado(){
        System.out.println("EMPLEADO");
        System.out.println("  Nombre: "+this.nombre);
        System.out.println("  Horas: "+this.horas);
        System.out.println("  Tarifa: "+this.tarifa);
        System.out.print("\n");  //Salto de línea
    }
    
    public static float calcularSueldoBruto(Empleado empleado){
        int hExtra;
        float sueldo;
        if  (empleado.getHoras() <= 40){
            sueldo = empleado.getHoras() * empleado.getTarifa();
        }
        else{
            hExtra = empleado.getHoras() - 40;
            sueldo = (hExtra * (empleado.getTarifa()*1.5f))+(40 * empleado.getTarifa());
        }
        return sueldo;
    }

    @Override
    public String toString() {
        return nombre + " trabajo " + horas + " horas y su tarifa es de " + tarifa + " euros";
    }
}