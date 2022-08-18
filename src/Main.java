import Multicenter.Categorias.Electrodomestico;
import Multicenter.Categorias.Herramienta;
import Multicenter.Categorias.Juguete;
import Multicenter.Categorias.Mueble;
import Multicenter.GestionProductos;
import Multicenter.Producto;

public class Main {
    public static void main(String[] args) {
        GestionProductos aplicacion = new GestionProductos();

        aplicacion.agregarProd2(new Juguete("Ultimate Garage", "Hot Wheels", 1600, "Estados Unidos", 2, 5, "Diversion",1));
        aplicacion.agregarProd2(new Juguete("Pirámide de argollas eco", "Fisher Price", 80, "Estados Unidos", 2, 5, "Educativo",2));
        aplicacion.agregarProd2(new Juguete("Ultra Scream Machine", "Nerf", 600, "Estados Unidos", 2, 5, "Diversion",3));

        aplicacion.agregarProd2(new Mueble("Sofá Cama","Palermo",3000,"Argentina",3,5,"Azul","Tapizado en tela","Sala de estar",4));
        aplicacion.agregarProd2(new Mueble("Mesa de Noche","Fremont",500,"Estados Unidos",5,5,"Negro","Tablero aglomera","Dormitorio",5));
        aplicacion.agregarProd2(new Mueble("Sofá Cama","Palermo",3000,"Argentina",5,5,"Azul","Tapizado en tela","Sala de estar",6));

        aplicacion.agregarProd2(new Electrodomestico("Licuadora jarra pica hielo","Brügmann",350,"Alemania",5,5,"Negro","Vidrio","Pequenho","Cocina",7));
        aplicacion.agregarProd2(new Electrodomestico("Exprimidor de Cítricos profesional","Ufesa",500,"Francia",4,5,"Blanco","Acero","Pequenho","Cocina",8));
        aplicacion.agregarProd2(new Electrodomestico("Licuadora","Philips",450,"Paises Bajos",5,5,"Rojo","Vidrio","Pequenho","Cocina",9));

        aplicacion.agregarProd2(new Herramienta("Taladro Inalambrico","Einhell",450,"Alemania",5,5,"Electrica","Plastico y metal",10));
        aplicacion.agregarProd2(new Herramienta("Amoladora Angular","Makita",1900, "Japon",4,5,"Electrica","Plastico y metal",11));
        aplicacion.agregarProd2(new Herramienta("Hidrolavadora","Karcher",2300,"Alemania",5,5,"Automotriz","Plastico",12));

        aplicacion.mostrarListaDeProductos();

        String nombre = "LICUADORA";
        Producto p = aplicacion.buscarProd2(nombre);
        if (p != null){
            System.out.println(p);
        }else {
            System.out.println("NO HAY EL PRODUCTO: " + nombre);
        }

        System.out.println("\t");
        String nombreInexistente = "NERF";
        Producto p2 = aplicacion.buscarProd2(nombreInexistente);
        if (p2 != null){
            System.out.println(p2);
        }else {
            System.out.println("NO HAY EL PRODUCTO: " + nombreInexistente);
        }

        aplicacion.obtenerProdSinStock();

        //aplicacion.menu();
    }
}
