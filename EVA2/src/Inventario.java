import java.util.ArrayList;
import java.util.List;

    public class Inventario<T> {

        private List<T> elementos; // Lista genérica

        public Inventario() {
            elementos = new ArrayList<>();
        }

        // Agregar elemento al inventario
        public void agregar(T elemento) {
            elementos.add(elemento);
        }

        // Mostrar todos los elementos
        public void mostrar() {
            for (T e : elementos) {
                System.out.println(e);
            }
        }

        // Opcional: obtener lista completa
        public List<T> getElementos() {
            return elementos;
       }


}
