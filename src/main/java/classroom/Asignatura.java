package classroom;

public class Asignatura {

    public String nombre;
    public int codigoInterno;
    public int codigoExterno;
    public Tipo tipo;

    public Asignatura() {
        this("Sin nombre", 0, 0, Tipo.FUNDAMENTACION);
    }

    public Asignatura(int codigoInterno, Tipo tipo) {
        this("Sin nombre", codigoInterno, 0, tipo);
    }

    public Asignatura(int codigoExterno, Tipo tipo, boolean esExterno) {
        this("Sin nombre", 0, codigoExterno, tipo); // Asegurando que se pase correctamente el valor de codigoExterno
    }

    public Asignatura(String nombre, Tipo tipo) {
        this(nombre, 0, 0, tipo);
    }

    public Asignatura(String nombre, int codigoInterno, int codigoExterno, Tipo tipo) {
        this.nombre = nombre;
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.tipo = tipo;
    }

    public void cambiarDatos(int codigoInterno) {
        this.codigoInterno = codigoInterno;
        this.codigoExterno = 50; // Modificado para este caso
    }

    public void cambiarDatos(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigoInterno(int codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    public void setCodigoInterno(double codigoInterno) {
        this.codigoInterno = (int) codigoInterno;
    }
}
