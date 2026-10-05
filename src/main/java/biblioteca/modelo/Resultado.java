package biblioteca.modelo;

public enum Resultado {

    OK("OK"),
    DUPLICADO("Ya existe un libro con ese titulo"),
    SIN_STOCK("Sin stock disponible"),
    SIN_PRESTAMOS("No hay prestamos activos de este libro"),
    NO_ENCONTRADO("Libro no encontrado"),
    ENTRO_INVALIDO("Entrada invalida");

    private final String mensaje;

    Resultado(String mensaje) {
        this.mensaje = mensaje;
    }

    public String mensaje() { return mensaje; }

    public boolean esOk() { return this == OK; }

    @Override
    public String toString() { return mensaje; }
}
