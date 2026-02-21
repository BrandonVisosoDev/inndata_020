import java.util.ArrayList;
import java.util.List;

public class Categoria {

    private String nombreCategoria;
    private List<Producto> productos; // Lista de productos

    public Categoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
        this.productos = new ArrayList<>();
    }

    // Agregar producto a la lista
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    // Mostrar todos los productos de la categoría
    public void mostrarProductos() {
        System.out.println("=== Categoría: " + nombreCategoria + " ===");
        for (Producto p : productos) {
            p.mostrarProducto(); // Polimorfismo: cada producto se muestra según su clase
            System.out.println("-------------------");
        }
    }
}