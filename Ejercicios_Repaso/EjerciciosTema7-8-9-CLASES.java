-- EJERCICIOS PROG TEMA7-8-9 --
-- DAVID ESCUDERO COCA --

-- TEMA 8 --
1.
public class Asignatura {
    //Atributos
    private String nombre;
    private double nota;
    
    //Constructores
    public Asignatura(){
        nombre = "";
        nota = 0;
    }

    public Asignatura(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    //Getters/Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    //Mostrar
    @Override
    public String toString() {
        return "Asignatura{" + "nombre=" + nombre + ", nota=" + nota + '}';
    }
}
6.
public class Empleado {
    //Atributos
    private String nombre;
    private int horasTrabajadas;
    private double tarifaHora;
    
    //Constructores
    public Empleado(){
        nombre = "";
        horasTrabajadas = 0;
        tarifaHora = 0;
    }

    public Empleado(String nombre, int horasTrabajadas, double tarifaHora) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
    }

    //Getters/Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }
    
    //Metodo
    public double calcularSueldo(){
        if (horasTrabajadas <= 40) {
            return horasTrabajadas * tarifaHora;
        }else {
            int horasExtra = horasTrabajadas - 40;
            return (40 * tarifaHora) + (horasExtra * tarifaHora * 1.5);
        }
    }

    //Mostrar
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", horasTrabajadas=" + horasTrabajadas + ", tarifaHora=" + tarifaHora + '}';
    }   
}
7.
public class Dia {
    //Atributos
    private String nombreDia;
    private int temperatura;
    
    //Constructores
    public Dia(){
        nombreDia = "";
        temperatura = 0;
    }

    public Dia(String nombreDia, int temperatura) {
        this.nombreDia = nombreDia;
        this.temperatura = temperatura;
    }

    //Getters/Setters
    public String getNombreDia() {
        return nombreDia;
    }

    public void setNombreDia(String nombreDia) {
        this.nombreDia = nombreDia;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    //Mostrar
    @Override
    public String toString() {
        return "Dia{" + "nombreDia=" + nombreDia + ", temperatura=" + temperatura + '}';
    }
}
9.
public class Asignatura {
    //Atributos
    private String nombreAsignatura;
    private float nota;
    
    //Constructores
    public Asignatura(){
        nombreAsignatura = "";
        nota = 0f;
    }

    public Asignatura(String nombreAsignatura, float nota) {
        this.nombreAsignatura = nombreAsignatura;
        this.nota = nota;
    }

    //Getters/Setters
    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    //Mostrar
    @Override
    public String toString() {
        return "Asignatura{" + "nombreAsignatura=" + nombreAsignatura + ", nota=" + nota + '}';
    }
}
9.1.
public class Alumno {
    //Atributos
    private String nombreAlumno;
    private Asignatura[] notas;
    
    //Constructores
    public Alumno(){
        nombreAlumno = "";
        notas = new Asignatura[4];//Array ya creado
    }

    public Alumno(String nombreAlumno, Asignatura[] notas) {
        this.nombreAlumno = nombreAlumno;
        this.notas = notas;
    }

    //Getters/Setters
    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public Asignatura[] getNotas() {
        return notas;
    }

    public void setNotas(Asignatura[] notas) {
        this.notas = notas;
    }

    //Metodos
    //Método que permite introducir las notas del alumno
    public void rellenarNotas(String[] asignaturas) {
        Scanner entrada = new Scanner(System.in);
        //Se recorre todas las asignaturas del alumno
        for (int i = 0; i < asignaturas.length; i++) {
            //Se pide la nota correspondiente a esa asignatura
            System.out.print("Nota de " + asignaturas[i] + ": ");
            float nota = entrada.nextFloat();
            //Se crea el objeto Asignatura con su nombre y nota
            notas[i] = new Asignatura(asignaturas[i], nota);
        }
    }
    
    //Método que muestra por pantalla todas las notas del alumno
    public void mostrarNotas() {
        System.out.println("Alumno: " + nombreAlumno);
        for (int i = 0; i < notas.length; i++) {
            System.out.println(" - " + notas[i].getNombreAsignatura() + ": " + notas[i].getNota());
        }
    }
    
    //Método que calcula la media del alumno
    public float calcularMedia() {
        float suma = 0f;
        //Se suma todas las notas
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i].getNota();
        }
        //Se devuelve la media
        return suma / notas.length;
    }
    
    //Método que cuenta cuántas asignaturas tiene suspensas el alumno
    public int contarSuspensos() {
        int contador = 0;
        for (int i = 0; i < notas.length; i++) {
            //Si la nota es menor que 5, sumamos un suspenso
            if (notas[i].getNota() < 5) {
                contador++;
            }
        }
        return contador;
    }
    
    //Método que devuelve la nota de una asignatura según su posición en el array
    public float getNotaPorPosicion(int pos) {
        return notas[pos].getNota();
    }
    
    //Mostrar
    @Override
    public String toString() {
        return "Alumno{" + "nombreAlumno=" + nombreAlumno + ", notas=" + notas + '}';
    }
}
12.
public class Mueble {
    //Atributos
    private double precio;
    private String descripcion;
    
    //Constructores
    public Mueble(){
        precio = 0;
        descripcion = "";
    }

    public Mueble(double precio, String descripcion) {
        this.precio = precio;
        this.descripcion = descripcion;
    }

    //Getters/Setters
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    //Mostrar
    @Override
    public String toString() {
        return "Descripcion: " + descripcion + "\nPrecio: " + precio;
    }
}
14.
public class Alumno {
    //Atributos
    private String nombre;
    private int edad;
    private float notaMedia;
    
    //Constructores
    public Alumno(){
        nombre = "";
        edad = 0;
        notaMedia = 0f;
    }

    public Alumno(String nombre, int edad, float notaMedia) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaMedia = notaMedia;
    }

    //Getters/Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(float notaMedia) {
        this.notaMedia = notaMedia;
    }

    //Mostrar
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nEdad: " + edad + "\nNota media: " + notaMedia;
    }
}
15-16.
public class Socios {
    //Atributos
    private String nombreSocio;
    private float precioAbonado;
    
    //Constructores
    public Socios(){
        nombreSocio = "";
        precioAbonado = 0f;
    }

    public Socios(String nombreSocio, float precioAbonado) {
        this.nombreSocio = nombreSocio;
        this.precioAbonado = precioAbonado;
    }

    //Getters/Setters
    public String getNombreSocio() {
        return nombreSocio;
    }

    public void setNombreSocio(String nombreSocio) {
        this.nombreSocio = nombreSocio;
    }

    public float getPrecioAbonado() {
        return precioAbonado;
    }

    public void setPrecioAbonado(float precioAbonado) {
        this.precioAbonado = precioAbonado;
    }

    //Mostrar
    @Override
    public String toString() {
        return " - " + "NombreSocio: " + nombreSocio + "\n - PrecioAbonado: " + precioAbonado;
    }
}
15-16-1.
public class Pelicula {
    //Atributos
    private String titulo;
    private float costeLicencia;
    private Socios[] socios;
    
    //Constructores
    public Pelicula(){
        titulo = "";
        costeLicencia = 0f;
        socios = new Socios[4];
    }

    public Pelicula(String titulo, float costeLicencia, Socios[] socios) {
        this.titulo = titulo;
        this.costeLicencia = costeLicencia;
        this.socios = socios;
    }
    
    public Pelicula(String titulo, float costeLicencia) {
        this.titulo = titulo;
        this.costeLicencia = costeLicencia;
        socios = new Socios[4];
    }

    //Getters/Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getCosteLicencia() {
        return costeLicencia;
    }

    public void setCosteLicencia(float costeLicencia) {
        this.costeLicencia = costeLicencia;
    }

    public Socios[] getSocios() {
        return socios;
    }

    public void setSocios(Socios[] socios) {
        this.socios = socios;
    }
    
    //Metodos
    //Se rellenan los socios y en el main las peliculas
    public void rellenarSocios() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce los 4 socios que han asistido:");
        for (int i = 0; i < socios.length; i++) {
            System.out.print("Nombre socio " + (i + 1) + ": ");
            String nombre = entrada.nextLine();
            System.out.print("Precio abonado: ");
            float precio = entrada.nextFloat();
            entrada.nextLine(); // limpiar buffer 
            socios[i] = new Socios(nombre, precio);
        } 
    }
    
    //Muestra los socios de esta película
    public void mostrarSocios() {
        for (Socios s : socios) {
            System.out.println(s.toString());
        }
    }
    
    //Calcula el beneficio bruto con la suma de los precios abonados
    public float calcularBeneficioBruto() {
        float suma = 0f;
        for (Socios s : socios) {
            suma += s.getPrecioAbonado();
        }
        return suma;
    }
    
    //Calcula el beneficio neto de restar bruto y coste licencia
    public float calcularBeneficioNeto() {
        return calcularBeneficioBruto() - costeLicencia;
    }
    
    //Cuenta cuántos socios han pagado más que un mínimo
    public int contarSociosConPrecioMayor(float minimo) {
        int contador = 0;
        for (Socios s : socios) {
            if (s.getPrecioAbonado() > minimo) {
                contador++;
            }
        }
        return contador;
    }
    
    //Muestra socios cuyo nombre empieza por una letra
    public void mostrarSociosPorLetra(char letra) {
        letra = Character.toLowerCase(letra);
        for (Socios s : socios) {
            if (s.getNombreSocio().toLowerCase().charAt(0) == letra) {
                System.out.println(s.toString());
            }
        }
    }
    
    //Devuelve true si el título empieza por un texto
    public boolean empiezaPorTexto(String texto){
        String tituloMin = titulo.toLowerCase();
        String textoMin = texto.toLowerCase();
        boolean coincide = true;
        
        //Si el texto es más largo que el título
        if(textoMin.length() > tituloMin.length()){
            coincide = false;
        }else{
            //Comparación letra a letra
            for(int i = 0; i < textoMin.length() && coincide; i++){
                if(tituloMin.charAt(i) != textoMin.charAt(i)){
                    coincide = false;
                }
            }
        }
        return coincide;
    }
    
    //Se cambia el 'a' por 'e' en el título
    public void cambiarAporE() {
        String nuevo = titulo.replace('a', 'e');
        titulo = nuevo;
        System.out.println("Nuevo titulo: " + nuevo);
    }
    
    //Convierte el título a mayúsculas
    public void convertirTituloMayusculas() {
        titulo = titulo.toUpperCase();
    }

    //Mostrar
    @Override
    public String toString() {
        return "Titulo: " + titulo + " - " + "\nCosteLicencia: " + costeLicencia + " - " + "\nSocios: " + socios;
    }
}