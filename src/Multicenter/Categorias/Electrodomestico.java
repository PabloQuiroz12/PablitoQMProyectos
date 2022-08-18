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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


}
