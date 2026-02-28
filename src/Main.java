import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

        // VARIABLES

        String numeros;

        // Ponemos la clase Scanner para leer datos

        Scanner input = new Scanner(System.in);


        // ENTRADA

        // Creamos la lista para los números con tipos en Wrappers

        List<Integer> list = new ArrayList<>();

        // Pedimos al usuario los números y agregamos el try pa evitar problemas

        try {
            System.out.println("Digite varios números enteros en fila: ");
            numeros = input.nextLine(); // Leemos sus numeros


            // Limpiamos espacios que deje el usuario al inicio y final

            String numeros_sin_espacios = numeros.trim();

            // Como lo tenemos en String lo debemos cortar por espacios

            String[] numeros_divididos = numeros_sin_espacios.split("\\s+");

            // Convertir de String a int todos

            for (String numerosDividido : numeros_divididos) {

                int numeros_int = Integer.parseInt(numerosDividido);

                // Agregarlos a la lista

                list.add(numeros_int);
            }


            // LÓGICA DEL EJERCICIO

            // Filtraremos numeros mayores y crearemos otra lista con los válidos.

            List<Integer> validos = new ArrayList<>();


            for (Integer numero : list) {
                if (numero < 10) {
                    validos.add(numero);

                }
            }

            // Mostrar ahora numeros validos

            System.out.println("Lista valida: " + validos);

            // Multiplicamos

            System.out.println("Multiplicados por 2: ");
            for (Integer numero : validos) {
                System.out.println(numero + " x 2 = " + (numero * 2));
            }


            // Por último haremos una suma

            int suma = 0;

            for (Integer numero : validos) {
                suma += numero; // vamos acumulando
            }

            System.out.println("La suma de los números válidos es: " + suma);

        } catch (NumberFormatException e) {

            // Aquí personalizas tu mensaje
            throw new RuntimeException("Error: Solo se permiten números enteros y menores a 10.");

        } finally {
            input.close(); // Cerramos scanner
        }




    }


    }



