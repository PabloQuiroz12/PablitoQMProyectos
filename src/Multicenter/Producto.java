package Multicenter;

public class Producto {
    private String nombre;
    private String marca;
    private int precio;
    private String industria;
    private int stock;
    private int id;
    private int garantia;

    public Producto(String nombre, String marca, int precio, String industria, int garantia, int stock, int id) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.industria = industria;
        this.garantia = garantia;
        this.stock = stock;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", industria='" + industria + '\'' +
                ", stock=" + stock +
                ", id=" + id +
                ", garantia=" + garantia +
                '}';
    }
}
