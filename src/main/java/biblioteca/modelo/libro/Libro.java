package biblioteca.modelo.libro;

public class Libro {

    private final String titulo;
    private String autor;
    private int stock;
    private int prestados;

    public Libro(String titulo, String autor, int stock) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("titulo no puede ser vacío");
        }
        if (autor == null || autor.trim().isEmpty()) {
            throw new IllegalArgumentException("autor no puede ser vacío");
        }
        if (stock < 0) {
            throw new IllegalArgumentException("stock no puede ser negativo");
        }
        this.titulo = titulo.trim();
        this.autor = autor.trim();
        this.stock = stock;
        this.prestados = 0;
    }

    public String getTitulo() { return titulo; }
    public String getAutor()  { return autor; }
    public int getStock()     { return stock; }
    public int getPrestados() { return prestados; }

    public void setAutor(String autor) {
        if (autor == null || autor.trim().isEmpty()) {
            throw new IllegalArgumentException("autor no puede ser vacío");
        }
        this.autor = autor.trim();
    }

}
