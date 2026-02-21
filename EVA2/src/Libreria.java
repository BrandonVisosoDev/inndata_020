
    public class Libreria {

        private String nombreLibreria;
        private Inventario<Categoria> inventario; // Inventario genérico de categorías

        public Libreria(String nombreLibreria) {
            this.nombreLibreria = nombreLibreria;
            this.inventario = new Inventario<>();
        }

        // Agregar categoría a la librería
        public void agregarCategoria(Categoria categoria) {
            inventario.agregar(categoria);
        }

        // Mostrar todas las categorías y sus productos
        public void mostrarLibreria() {
            System.out.println("=== Librería: " + nombreLibreria + " ===");
            for (Categoria c : inventario.getElementos()) {
                c.mostrarProductos();
            }
        }
    }



