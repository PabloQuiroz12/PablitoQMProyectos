package Multicenter.Categorias;

import Multicenter.Producto;

public class Herramienta extends Producto {
    private String tipoHerramienta;
    private String material;

    public Herramienta(String nombre, String marca, int precio, String industria, int garantia, int stock, String tipoHerramienta, String material, int id) {
        super(nombre, marca, precio, industria, garantia, stock, id);
        this.tipoHerramienta = tipoHerramienta;
        this.material = material;
    }

    public String getTipoHerramienta() {
        return tipoHerramienta;
    }

    public void setTipoHerramienta(String tipoHerramienta) {
        this.tipoHerramienta = tipoHerramienta;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
