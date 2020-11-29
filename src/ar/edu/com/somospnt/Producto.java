package ar.edu.com.somospnt;

import java.util.Objects;

public class Producto implements Comparable <Producto> {

    private String nombre;
    private Unidad unidad;
    private Integer precio;

    public Producto(String nombre,Unidad unidad,Integer precio){
        this.nombre = nombre;
        this.unidad = unidad;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Unidad getUnidad() {
        return unidad;
    }

    public void setUnidad(Unidad unidad) {
        this.unidad = unidad;
    }

    @Override
    public int compareTo(Producto o) {
        if (getPrecio() < o.getPrecio()) {
            return -1;
        }
        if (getPrecio() > o.getPrecio()) {
            return 1;
        }
        return 0;
    }


    @Override
    public String toString() {
        return "Nombre: " + getNombre() +  " /// " + getUnidad().toString() +  " /// " + " Precio: $" + getPrecio();
    }
}
