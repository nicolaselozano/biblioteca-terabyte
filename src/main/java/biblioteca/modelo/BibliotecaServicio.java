package biblioteca.modelo;

import biblioteca.modelo.estadisticas.EstadisticasDTO;
import biblioteca.modelo.libro.Libro;

import java.util.List;

public interface BibliotecaServicio {

    Resultado agregar(String titulo, String autor, int stock);
    List<Libro> listar();
    List<Libro> buscarParcial(String filtro);
    Resultado prestar(String titulo);
    Resultado devolver(String titulo);
    void ordenarPorTitulo();
    int tamano();
    EstadisticasDTO estadisticas();
}
