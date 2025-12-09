
package ejercicio7t7;

/**
 *
 * @author d3stroya
 */
public class Televisor implements ControlRemoto {
    private boolean encendido;
    private int canal;
    private int volumen;

    public Televisor() {
        this.encendido = false;
        this.canal = 1;
        this.volumen = 10;
    }
    
    public Televisor(int canal, int volumen) {
        this.encendido = false;
        this.canal = canal;
        this.volumen = volumen;
    }

    public float getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
        
    @Override
    public void apagar() {
        if(encendido) {
            System.out.println("La TV se apagará en 10s");
            encendido = false;
        }
    }
    
    @Override
    public void encender() {
        if(!encendido) {
            encendido = true;
            System.out.println("Estás viendo el canal " + canal);
        }
    }

    @Override
    public void bajarVolumen() {
        if(encendido) {
            volumen--;
            System.out.println("Volumen " + volumen);
        }
    }

    @Override
    public void subirVolumen() {
        if(encendido) {
            volumen++;
            System.out.println("Volumen " + volumen);
        }
    }

    @Override
    public void cambiarCanal(float canal) {
        if(encendido) {
            this.canal = (int)canal;
            System.out.println("Estás viendo el canal " + canal);
        }
    }
      

    @Override
    public String toString() {
        return "Televisor{" + "encendido=" + encendido + ", canal=" + canal + ", volumen=" + volumen + '}';
    }
        
}
