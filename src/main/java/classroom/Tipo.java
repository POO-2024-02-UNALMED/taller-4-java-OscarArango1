package classroom;

public enum Tipo {
    DISCIPLINAR(10), FUNDAMENTACION(20), ELECTIVA(30);

    private int codigo;

    Tipo(int codigo) { // Constructor simplificado
        this.codigo = codigo;
    }
}