import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Libreria libreria = new Libreria("Mi Librería");

        int opcion;
        do {
            System.out.println("\n=== Menú Librería ===");
            System.out.println("1. Agregar categoría");
            System.out.println("2. Agregar producto a categoría");
            System.out.println("3. Mostrar librería");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    // Agregar categoría
                    System.out.print("Nombre de la categoría: ");
                    String nombreCat = sc.nextLine();
                    Categoria categoria = new Categoria(nombreCat);
                    libreria.agregarCategoria(categoria);
                    System.out.println("Categoría agregada con éxito.");
                    break;

                case 2:
                    // Agregar producto a una categoría
                    System.out.print("Nombre de la categoría: ");
                    String catBuscar = sc.nextLine();
                    Categoria categoriaEncontrada = null;

                    // Buscar categoría
                    for (Categoria c : libreria.getInventario().getElementos()) {
                        if (c.getNombreCategoria().equalsIgnoreCase(catBuscar)) {
                            categoriaEncontrada = c;
                            break;
                        }
                        }



                    if (categoriaEncontrada != null) {
                        System.out.println("¿Qué tipo de producto deseas agregar?");
                        System.out.println("1. Libro");
                        System.out.println("2. Revista");
                        int tipo = sc.nextInt();
                        sc.nextLine(); // limpiar buffer

                        System.out.print("Nombre del producto: ");
                        String nombre = sc.nextLine();
                        System.out.print("Precio: ");
                        double precio = sc.nextDouble();
                        
                        // Aqui tiraremos una exception

                        System.out.print("Código: ");
                        int codigo = sc.nextInt();

                        //
                        sc.nextLine(); // limpiar buffer
                        System.out.print("Descripción: ");
                        String descripcion = sc.nextLine();

                        if (tipo == 1) {
                            // Datos específicos de libro
                            System.out.print("Autor: ");
                            String autor = sc.nextLine();
                            System.out.print("Número de páginas: ");
                            int paginas = sc.nextInt();
                            sc.nextLine(); // limpiar buffer
                            System.out.print("Editorial: ");
                            String editorial = sc.nextLine();

                            ProductoLibro libro = new ProductoLibro(nombre, precio, codigo, descripcion,
                                    autor, paginas, editorial);
                            categoriaEncontrada.agregarProducto(libro);
                            System.out.println("Libro agregado con éxito.");
                        } else if (tipo == 2) {
                            // Datos específicos de revista
                            System.out.print("Número de edición: ");
                            int numeroEdicion = sc.nextInt();
                            System.out.print("Número de páginas: ");
                            int paginas = sc.nextInt();
                            sc.nextLine(); // limpiar buffer

                            ProductoRevista revista = new ProductoRevista(nombre, precio, codigo, descripcion,
                                    numeroEdicion, paginas);
                            categoriaEncontrada.agregarProducto(revista);
                            System.out.println("Revista agregada con éxito.");
                        } else {
                            System.out.println("Tipo de producto inválido.");
                        }
                    } else {
                        System.out.println("Categoría no encontrada.");
                    }
                    break;

                case 3:
                    // Mostrar librería completa
                    libreria.mostrarLibreria();
                    break;

                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida, intenta de nuevo.");
            }
        } while (opcion != 0);

        sc.close();
    }
}