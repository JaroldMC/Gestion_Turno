import java.util.Deque;
import java.util.LinkedList;

public class Ejercicio2Historial {

    public static void main(String[] args) {

        // Crear historial
        Deque<String> historial = new LinkedList<>();

        // Visitar páginas
        historial.addLast("Google");
        historial.addLast("YouTube");
        historial.addLast("Moodle");

        // Mostrar historial actual
        System.out.println("Historial actual:");
        System.out.println(historial);

        System.out.println("---------------------");

        // Retroceder
        String paginaAnterior = historial.removeLast();

        System.out.println("Retrocediendo desde: " + paginaAnterior);

        // Página actual
        System.out.println("Página actual: " + historial.peekLast());

        System.out.println("---------------------");

        // Avanzar simulando nueva página
        historial.addLast("Facebook");

        System.out.println("Nueva página visitada: Facebook");

        System.out.println("---------------------");

        // Mostrar historial final
        System.out.println("Historial final:");
        System.out.println(historial);
    }
}