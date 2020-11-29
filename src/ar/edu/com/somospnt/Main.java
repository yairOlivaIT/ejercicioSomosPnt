package ar.edu.com.somospnt;

public class Main {
    public static void main(String[] args) {

        Producto cocaCola = new Producto("Coca-Cola", Unidad.LITRO, 18);
        Producto cocaColaZero = new Producto("Coca-Cola Zero", Unidad.LITRO, 20);
        Producto shampooSedal = new Producto("Shampoo Sedal", Unidad.ML, 19);
        Producto frutillas = new Producto("Frutillas", Unidad.KILO, 64);
        ListaArticulos listaArticulos = new ListaArticulos();

        listaArticulos.agregarProductos(cocaColaZero);
        listaArticulos.agregarProductos(cocaCola);
        listaArticulos.agregarProductos(shampooSedal);
        listaArticulos.agregarProductos(frutillas);


        listaArticulos.mostrarProductos();

        System.out.println("=============================");

        listaArticulos.productosOrdenados();

    }
}