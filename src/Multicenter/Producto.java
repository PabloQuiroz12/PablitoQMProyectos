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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getIndustria() {
        return industria;
    }

    public void setIndustria(String industria) {
        this.industria = industria;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
