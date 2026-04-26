package ejercicio06;

public class Palabra {
    private String texto;
    private int longitud;
    
    public Palabra() {
        texto = "";
        longitud = 0;
    }

    public Palabra(String texto, int longitud) {
        this.texto = texto;
        this.longitud = longitud;
    }
    
    public Palabra(String texto) {
        this.texto = texto;
        this.longitud = texto.length();
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "La palabra con el texto " + texto + ", tiene una longitud de " + longitud;
    }
}