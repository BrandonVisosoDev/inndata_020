public abstract class ProductoAbstracto implements Producto {

    private String nombre;
    private Double precio;
    private Integer codigo;
    private String descripcion;

    // Constructor para inicializar atributos
    public ProductoAbstracto(String nombre, Double precio, Integer codigo, String descripcion) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    // Implementaciones de los métodos de la interfaz
    
    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public Double getPrecio() {
        return precio;
    }

    @Override
    public Integer getCodigo() {
        return codigo;
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }

    // Metodo abstracto
    @Override
    public abstract void mostrarProducto();
}