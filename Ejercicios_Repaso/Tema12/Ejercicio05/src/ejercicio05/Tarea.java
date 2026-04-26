
package ejercicio05;

public class Tarea {
    private String descripcion;
    private boolean completada;
    
    public Tarea() {
        descripcion = "";
        completada = false;
    }

    public Tarea(String descripcion, boolean completada) {
        this.descripcion = descripcion;
        this.completada = completada;
    }
    
    public Tarea(String descripcion) {
        this.descripcion = descripcion;
        this.completada = false;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }
    
    public void completar() {
        this.completada = true;
    }

    @Override
    public String toString() {
        return "La tarea con descripcion " + descripcion + ", " + completada + " esta completada";
    }
}