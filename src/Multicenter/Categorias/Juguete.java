package Multicenter.Categorias;

import Multicenter.Producto;

public class Juguete extends Producto {
    private String tipoDeUso;

    public Juguete(String nombre, String marca, int precio, String industria, int garantia, int stock, String tipoDeUso, int id) {
        super(nombre, marca, precio, industria, garantia, stock,id);
        this.tipoDeUso = tipoDeUso;

    }

    public String getTipoDeUso() {
        return tipoDeUso;
    }

    public void setTipoDeUso(String tipoDeUso) {
        this.tipoDeUso = tipoDeUso;
    }
}
