package Ejercicio2;

import java.util.Scanner;

public class PaginacionArchivo {
    public static void main(String[] args) {
        Scanner dato=new Scanner(System.in);
        System.out.println("Ingrese el tamaño del archivo--> ");
        long tamañoArchivo= dato.nextLong();
        System.out.println("Ingrese el tamaño de la pagina---> ");
        long tamañoPagina= dato.nextLong();
        int numeroPaginas=(int) Math.ceil((double)tamañoArchivo/tamañoPagina);
        System.out.println("Se nesecitan "+numeroPaginas+" paginas para almacenar el archivo");
    }

}
