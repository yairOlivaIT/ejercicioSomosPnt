package ar.edu.com.somospnt;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class ListaArticulos {

    List<Producto> productoList;
    TreeSet<Producto> productos;

    public ListaArticulos(){
        this.productoList = new ArrayList<>();
        this.productos = new TreeSet<>();
    }

    public void agregarProductos(Producto producto){
        this.productoList.add(producto);
    }

    public void mostrarProductos(){
        for(Producto p : productoList){
            System.out.println(p.toString());
        }
    }

    public void productosOrdenados(){
        productos.addAll(productoList);
        System.out.println("Producto más caro: " + productos.last().getNombre());
        System.out.println("Producto mas barato: " + productos.first().getNombre());
    }
}
