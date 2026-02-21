public class ProductoRevista extends ProductoAbstracto {

    // Atributos específicos de una Revista
    private Integer numeroEdicion;
    private Integer paginas;


    // Constructor: inicializa lo común con super y lo específico aquí
    public ProductoRevista(String nombre, Double precio, Integer codigo, String descripcion,
                         Integer numeroEdicion, Integer paginas) {
        super(nombre, precio, codigo, descripcion);
        this.numeroEdicion = numeroEdicion;
        this.paginas = paginas;

    }

    @Override
    public void mostrarProducto() {
        // Datos comunes heredados
        System.out.println("Nombre: " + getNombre());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Descripcion: " + getDescripcion());

        // Datos específicos de Revista
        System.out.println("Numero Edicion: " + numeroEdicion);
        System.out.println("Páginas: " + paginas);

    }
}