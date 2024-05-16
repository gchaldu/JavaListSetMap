package com.collection.producto;

public class Producto implements Comparable<Producto>{

    private Integer id;
    private static Integer counter=0;
    private String nombre;

    public Producto(String nombre) {
        this.id = ++counter;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public static Integer getCounter() {
        return counter;
    }

    public static void setCounter(Integer counter) {
        Producto.counter = counter;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public int compareTo(Producto o) {
        return this.nombre.compareTo(o.nombre);
    }
}
