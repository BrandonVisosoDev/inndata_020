public class ProductoLibro extends ProductoAbstracto {

    // Atributos específicos de un libro
    private String autor;
    private Integer paginas;
    private String editorial;

    // Constructor: inicializa lo común con super y lo específico aquí
    public ProductoLibro(String nombre, Double precio, Integer codigo, String descripcion,
                         String autor, Integer paginas, String editorial) {
        super(nombre, precio, codigo, descripcion);
        this.autor = autor;
        this.paginas = paginas;
        this.editorial = editorial;
    }

    @Override
    public void mostrarProducto() {
        // Datos comunes heredados
        System.out.println("Nombre: " + getNombre());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Descripcion: " + getDescripcion());

        // Datos específicos del libro
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + paginas);
        System.out.println("Editorial: " + editorial);
    }
}