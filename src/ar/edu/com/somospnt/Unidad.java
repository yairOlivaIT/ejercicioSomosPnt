package ar.edu.com.somospnt;

public enum Unidad {

    KILO("Unidad de venta: ","kilo"), LITRO("Litros:",1.5), ML("Contenido:",500);

    private String unidad;
    private String kilo;

    private double cantidad;

    private Unidad(String unidad, double cantidad) {
        this.unidad = unidad;
        this.cantidad = cantidad;
        this.kilo = "";
    }


    private Unidad(String unidad, String kilo) {
        this.unidad = unidad;
        this.kilo = kilo;
        this.cantidad=0;
    }


    public String getUnidad() {
        return unidad;
    }


    public String getKilo() {
        return kilo;
    }


    public double getCantidad() {
        return cantidad;
    }



    @Override
    public String toString() {
        return getUnidad()  + "" + (getCantidad() ==0 ? getKilo() : getCantidad() ).toString();
    }


}