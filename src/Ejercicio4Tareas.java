 import java.util.Deque;
import java.util.LinkedList;

public class Ejercicio4Tareas {

    public static void main(String[] args) {

        Deque<String> tareas = new LinkedList<>();

        // Tareas normales al final
        tareas.offerLast("Revisar correos");
        tareas.offerLast("Actualizar reporte");

        // Tareas urgentes al inicio
        tareas.offerFirst("Reiniciar servidor");
        tareas.offerFirst("Resolver caída del sistema");

        System.out.println("Orden de ejecución de tareas:");
        System.out.println(tareas);

        System.out.println("------------------------");

        while (!tareas.isEmpty()) {
            String tareaActual = tareas.pollFirst();

            System.out.println("Ejecutando tarea: " + tareaActual);
            System.out.println("Tareas restantes: " + tareas.size());
            System.out.println("------------------------");
        }
    }
}