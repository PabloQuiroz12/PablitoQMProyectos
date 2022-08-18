package Multicenter;


import Multicenter.Categorias.*;

import java.util.Scanner;


public class GestionProductos {
    Scanner teclado = new Scanner(System.in);
    String moneda = " Bs";
    public boolean control = true;

    private static final Electrodomestico[] listaElectrodomesticos = new Electrodomestico[3];
    private static final Juguete[] listaJuguetes = new Juguete[3];
    private static final Herramienta[] listaHerramientas = new Herramienta[3];
    private static final Mueble[] listaMuebles = new Mueble[3];
    int indiceJ = 0;
    int indiceM = 0;
    int indiceE = 0;
    int indiceH = 0;


    public void mostrarListaDeProductos() {
        System.out.println("__________________________________________________________________________");
        System.out.println("BIENVENIDO(A) A MULTICENTER !!!");
        System.out.println("LISTA DE PRODUCTOS EN LA TIENDA:");

        System.out.println("\t");
        System.out.println("------------PRODUCTOS------------");
        System.out.println("----JUGUETES");
        auxMostrarListaDeProductos(listaJuguetes);
        System.out.println("----MUEBLES");
        auxMostrarListaDeProductos(listaMuebles);
        System.out.println("----ELECTRODOMESTICOS");
        auxMostrarListaDeProductos(listaElectrodomesticos);
        System.out.println("----HERRAMIENTAS");
        auxMostrarListaDeProductos(listaHerramientas);
        System.out.println("__________________________________________________________________________");

    }
    protected void auxMostrarListaDeProductos(Producto []listProd){
        for(int i = 0 ; i < listProd.length ; i++){
            if (listProd[i] != null)
                System.out.println((i+1)+". "+listProd[i].getNombre());
        }
    }


    public void agregarProd2(Producto p) {
        if (p instanceof Juguete) {
            if (indiceJ < listaJuguetes.length) {
                listaJuguetes[indiceJ++] = (Juguete) p;
            }
        } else if (p instanceof Mueble) {
            if (indiceM < listaMuebles.length) {
                listaMuebles[indiceM++] = (Mueble) p;
            }
        } else if (p instanceof Electrodomestico) {
            if (indiceE < listaElectrodomesticos.length) {
                listaElectrodomesticos[indiceE++] = (Electrodomestico) p;
            }
        } else if (p instanceof Herramienta) {
            if (indiceH < listaHerramientas.length) {
                listaHerramientas[indiceH++] = (Herramienta) p;
            }
        }
    }

    /*public void buscarProd() {

        try {
            System.out.print("INGRESE EL INDICE DEL PRODUCTO QUE DESEA BUSCAR: ");
            int iD = Integer.parseInt(teclado.nextLine());
            System.out.println();
            for (int i = 0; i < 3; i++)
                if (listaJuguetes[i].getId() == iD) {
                    System.out.println("\t");
                    System.out.println("__________________________________________________________________________");
                    System.out.println("EL PRODUCTO BUSCADO ES: "
                            + listaJuguetes[i].getNombre()
                            + " (" + listaHerramientas[i].getPrecio()
                            + moneda + ")");
                    System.out.println("\t");
                    System.out.println("Marca: " + listaJuguetes[i].getMarca());
                    System.out.println("Industria: " + listaJuguetes[i].getIndustria());
                    System.out.println("Stock: " + listaJuguetes[i].getStock());
                    System.out.println("__________________________________________________________________________");
                    control = false;
                }
            for (int i = 0; i < 3; i++) {
                if (listaMuebles[i].getId() == iD) {
                    System.out.println("\t");
                    System.out.println("__________________________________________________________________________");
                    System.out.println("EL PRODUCTO BUSCADO ES: "
                            + listaMuebles[i].getNombre()
                            + " (" + listaHerramientas[i].getPrecio()
                            + moneda + ")");
                    System.out.println("\t");
                    System.out.println("Marca: " + listaMuebles[i].getMarca());
                    System.out.println("Industria: " + listaMuebles[i].getIndustria());
                    System.out.println("Stock: " + listaMuebles[i].getStock());
                    System.out.println("__________________________________________________________________________");
                    control = false;
                }
            }
            for (int i = 0; i < 3; i++) {
                if (listaElectrodomesticos[i].getId() == iD) {
                    System.out.println("\t");
                    System.out.println("__________________________________________________________________________");
                    System.out.println("EL PRODUCTO BUSCADO ES: "
                            + listaElectrodomesticos[i].getNombre()
                            + " (" + listaHerramientas[i].getPrecio()
                            + moneda + ")");
                    System.out.println("\t");
                    System.out.println("Marca: " + listaElectrodomesticos[i].getMarca());
                    System.out.println("Industria: " + listaElectrodomesticos[i].getIndustria());
                    System.out.println("Stock: " + listaElectrodomesticos[i].getStock());
                    System.out.println("__________________________________________________________________________");
                    control = false;
                }
            }
            for (int i = 0; i < 3; i++) {
                if (listaHerramientas[i].getId() == iD) {
                    System.out.println("\t");
                    System.out.println("__________________________________________________________________________");
                    System.out.println("EL PRODUCTO BUSCADO ES: "
                            + listaHerramientas[i].getNombre()
                            + " (" + listaHerramientas[i].getPrecio()
                            + moneda + ")");
                    System.out.println("\t");
                    System.out.println("Marca: " + listaHerramientas[i].getMarca());
                    System.out.println("Industria: " + listaHerramientas[i].getIndustria());
                    System.out.println("Stock: " + listaHerramientas[i].getStock());
                    System.out.println("__________________________________________________________________________");
                    control = false;
                }
            }
        } catch (NumberFormatException a) {
            //a.printStackTrace();
        }

    }*/

    public Producto buscarProd2(String nombreProd) {
        Producto buscado = auxBuscarProd2(nombreProd,listaJuguetes);
        if(buscado != null)
            return buscado;
        buscado = auxBuscarProd2(nombreProd,listaMuebles);
        if(buscado != null)
            return buscado;
        buscado = auxBuscarProd2(nombreProd,listaElectrodomesticos);
        if(buscado!= null)
            return buscado;
        buscado = auxBuscarProd2(nombreProd,listaHerramientas);
        return buscado;
    }

    protected Producto auxBuscarProd2(String nombreProd, Producto []listProd){
        for(int i=0 ; i < listProd.length ; i++){
            if(listProd[i] != null && listProd[i].getNombre().equals(nombreProd)){
                return listProd[i];
            }
        }
        return null;
    }


    public void obtenerProdSinStock() {
        System.out.println("\t");
        auxProdSinStock(listaJuguetes);
        auxProdSinStock(listaMuebles);
        auxProdSinStock(listaElectrodomesticos);
        auxProdSinStock(listaHerramientas);
    }

    protected void auxProdSinStock(Producto[] listaProd) {
        for (int i = 0; i < listaProd.length; i++) {
            if (listaProd[i] != null && listaProd[i].getStock() == 0) {
                System.out.println("PRODUCTO SIN STOCK: " + listaProd[i].getNombre());
            }
        }
    }

    /*public void menu(){
        GestionProductos menu = new GestionProductos();
        while (control) {
            menu.buscarProd();
            menu.obtenerProdSinStock();
        }
    }*/


}
