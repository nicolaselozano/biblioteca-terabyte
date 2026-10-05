package biblioteca.modelo;

public class EstadisticasDTO {

    private final int totalTitulos;
    private final int totalEjemplares;
    private final int disponibles;
    private final int prestados;
    private final int librosSinStock;

    private final String topLibroTitulo;
    private final String topLibroAutor;
    private final int topLibroPrestados;

    public EstadisticasDTO(
            int totalTitulos,
            int totalEjemplares,
            int disponibles,
            int prestados,
            int librosSinStock,
            String topLibroTitulo,
            String topLibroAutor,
            int topLibroPrestados) {
        this.totalTitulos = totalTitulos;
        this.totalEjemplares = totalEjemplares;
        this.disponibles = disponibles;
        this.prestados = prestados;
        this.librosSinStock = librosSinStock;
        this.topLibroTitulo = topLibroTitulo;
        this.topLibroAutor = topLibroAutor;
        this.topLibroPrestados = topLibroPrestados;
    }

    public int getTotalTitulos()     { return totalTitulos; }
    public int getTotalEjemplares()  { return totalEjemplares; }
    public int getDisponibles()      { return disponibles; }
    public int getPrestados()        { return prestados; }
    public int getLibrosSinStock()   { return librosSinStock; }

    public String getTopLibroTitulo()      { return topLibroTitulo; }
    public String getTopLibroAutor()       { return topLibroAutor; }
    public int getTopLibroPrestados()      { return topLibroPrestados; }

    public boolean hayLibroMasPrestado() { return topLibroTitulo != null; }

}
