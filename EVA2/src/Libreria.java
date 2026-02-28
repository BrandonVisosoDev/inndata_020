public class Libreria {

    private String nombreLibreria;
    private Inventario<Categoria> inventario; // Inventario genérico de categorías

    public Libreria(String nombreLibreria) {
        this.nombreLibreria = nombreLibreria;
        this.inventario = new Inventario<>();
    }

    public void agregarCategoria(Categoria categoria) {
        inventario.agregar(categoria);
    }

    public void mostrarLibreria() {
        System.out.println("=== Librería: " + nombreLibreria + " ===");
        for (Categoria c : inventario.getElementos()) {
            c.mostrarProductos();
        }
    }

    // Aquí sí va el getter correcto
    public Inventario<Categoria> getInventario() {
        return inventario;
    }
}