package Ejercicio3;

import java.util.LinkedList;
import java.util.Queue;

import static java.lang.Thread.*;

public class ProcessManager {
    private Queue<Process> processQueue;

    public ProcessManager() {
        this.processQueue = new LinkedList<>();
    }

    public void crearProceso(String nombre, int tiempo) {
        int id = processQueue.size() + 1;
        Process process = new Process(id, nombre, tiempo);
        processQueue.add(process);
        System.out.println("Proceso creado " + process);
    }

    public String ejecutarProceso() {
        if (processQueue.isEmpty()) {
            return "No hay proceso en la cola ";
        }
        Process process = processQueue.poll();
        System.out.println("Ejecutando proceso: " + process);
        try {
                sleep(process.getTiempo());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Proceso finalizado: " + process;
    }
}
