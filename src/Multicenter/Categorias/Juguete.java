package Multicenter.Categorias;

import Multicenter.Producto;

public class Juguete extends Producto {
    private String tipoDeUso;

    public Juguete(String nombre, String marca, int precio, String industria, int garantia, int stock, String tipoDeUso, int id) {
        super(nombre, marca, precio, industria, garantia, stock,id);
        this.tipoDeUso = tipoDeUso;

    }

    @Override
    public String toString() {
        return "Juguete{\n\t" + super.toString()
                + "\n\t\t\ttipoDeUso='" + tipoDeUso + '\''
                + "} " ;
    }
}
