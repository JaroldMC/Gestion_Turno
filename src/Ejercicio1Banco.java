import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio1Banco {

    public static void main(String[] args) {

        // Crear cola de clientes
        Queue<String> clientes = new LinkedList<>();

        // Agregar clientes
        clientes.offer("Juan");
        clientes.offer("Pedro");
        clientes.offer("Maria");
        clientes.offer("Carlos");
        clientes.offer("Ana");
        clientes.offer("Luis");
        clientes.offer("Sofia");
        clientes.offer("Miguel");

        // Mostrar cliente en espera
        System.out.println("Cliente en espera: " + clientes.peek());

        System.out.println("----------------------");

        // Atender clientes
        while (!clientes.isEmpty()) {

            String atendido = clientes.poll();

            System.out.println("Cliente atendido: " + atendido);

            System.out.println("Clientes restantes: " + clientes.size());

            System.out.println("----------------------");
        }
    }
}