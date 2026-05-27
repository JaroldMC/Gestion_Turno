import java.util.PriorityQueue;

public class Ejercicio3Hospital {


    static class Paciente implements Comparable<Paciente> {

        String nombre;
        int prioridad;


        public Paciente(String nombre, int prioridad) {
            this.nombre = nombre;
            this.prioridad = prioridad;
        }

        // Ordenar por prioridad
        @Override
        public int compareTo(Paciente otro) {
            return Integer.compare(this.prioridad, otro.prioridad);
        }
    }
    public static void main(String[] args){
        PriorityQueue<Paciente> pacientes = new PriorityQueue<>();

        pacientes.offer(new Paciente("Juan", 2));
        pacientes.offer(new Paciente("Maria", 1));
        pacientes.offer(new Paciente("Carlos", 3));
        pacientes.offer(new Paciente("Ana", 3));
        pacientes.offer(new Paciente("Luis", 2));
        pacientes.offer(new Paciente("Sofia", 1));

        System.out.println("Orden de atencion de pacientes:");
        System.out.println("-------------------------------");

        while(!pacientes.isEmpty()){
            Paciente p = pacientes.poll();
            System.out.println("Paciente: " + p.nombre + ", | Prioridad: " + p.prioridad);

        }

    }
}