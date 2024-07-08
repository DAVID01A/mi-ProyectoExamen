package Ejercicio3;

public class Process {
    private int id;
    private String nombre;
    private int tiempo;

    public Process() {
    }

    public Process(int id, String nombre, int tiempo) {
        this.id = id;
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Process{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tiempo=" + tiempo +
                '}';
    }
}
