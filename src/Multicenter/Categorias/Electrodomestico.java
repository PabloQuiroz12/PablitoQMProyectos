package Multicenter.Categorias;

import Multicenter.Producto;

public class Electrodomestico extends Producto {
    private String color;
    private String material;
    private String tamanho;
    private String categoria;

    public Electrodomestico(String nombre, String marca, int precio, String industria, int garantia, int stock, String color, String material, String tamanho, String categoria, int id) {
        super(nombre, marca, precio, industria, garantia, stock, id );
        this.color = color;
        this.material = material;
        this.tamanho = tamanho;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Electrodomestico{\n\t"
                + super.toString()
                + "\n\t\t\tcolor='" + color + '\''
                + ", material='" + material + '\''
                + ", tamanho='" + tamanho + '\''
                + ", categoria='" + categoria + '\''
                + "} " ;
    }
}
