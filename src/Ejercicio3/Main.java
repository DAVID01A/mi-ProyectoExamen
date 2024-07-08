package Ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    ProcessManager processManager=new ProcessManager();
    Scanner s1=new Scanner(System.in);
    int opcion;
    do {
        System.out.println("\n Menu de gestion de procesos ");
        System.out.println("1-Crear proceso ");
        System.out.println("2-Ejecutar proceso ");
        System.out.println("3-Salir ");
        System.out.println("Ingrese una opcion ");
        opcion = s1.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Ingrese el Nombre del proceso: ");
                String nombre = s1.next();
                System.out.println("Ingrese el tiempo de ejecucion (minutos): ");
                int tiempo = s1.nextInt();
                processManager.crearProceso(nombre, tiempo);
                break;
            case 2:
                String resultado= processManager.ejecutarProceso();
                System.out.println(resultado);
                break;
            case 3:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opcion nom valida :( ");
        }
    }while (opcion !=3);
    }
}