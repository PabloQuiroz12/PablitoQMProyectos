import Multicenter.Categorias.Electrodomestico;
import Multicenter.Categorias.Herramienta;
import Multicenter.Categorias.Juguete;
import Multicenter.Categorias.Mueble;
import Multicenter.GestionProductos;
import Multicenter.Producto;


public class Main {
    public static void main(String[] args) {
        GestionProductos aplicacion = new GestionProductos();

        Juguete j1 = new Juguete("Ultimate Garage", "Hot Wheels", 1600, "Estados Unidos", 2, 5, "Diversion",1);
        Juguete j2 = new Juguete("Pirámide de argollas eco", "Fisher Price", 80, "Estados Unidos", 2, 5, "Educativo",2);
        Juguete j3 = new Juguete("Ultra Scream Machine", "Nerf", 600, "Estados Unidos", 2, 5, "Diversion",3);
        aplicacion.agregarProd2(j1);
        aplicacion.agregarProd2(j2);
        aplicacion.agregarProd2(j3);

        Mueble m1 = new Mueble("Sofá Cama","Palermo",3000,"Argentina",3,5,"Azul","Tapizado en tela","Sala de estar",4);
        Mueble m2 = new Mueble("Mesa de Noche","Fremont",500,"Estados Unidos",5,5,"Negro","Tablero aglomera","Dormitorio",5);
        Mueble m3 = new Mueble("Sofá Cama","Palermo",3000,"Argentina",5,5,"Azul","Tapizado en tela","Sala de estar",6);
        aplicacion.agregarProd2(m1);
        aplicacion.agregarProd2(m2);
        aplicacion.agregarProd2(m3);

        Electrodomestico e1= new Electrodomestico("Licuadora jarra pica hielo","Brügmann",350,"Alemania",5,5,"Negro","Vidrio","Pequenho","Cocina",7);
        Electrodomestico e2 = new Electrodomestico("Exprimidor de Cítricos profesional","Ufesa",500,"Francia",4,5,"Blanco","Acero","Pequenho","Cocina",8);
        Electrodomestico e3 = new Electrodomestico("Licuadora","Philips",450,"Paises Bajos",5,5,"Rojo","Vidrio","Pequenho","Cocina",9);
        aplicacion.agregarProd2(e1);
        aplicacion.agregarProd2(e2);
        aplicacion.agregarProd2(e3);

        Herramienta h1 = new Herramienta("Taladro Inalambrico","Einhell",450,"Alemania",5,5,"Electrica","Plastico y metal",10);
        Herramienta h2 = new Herramienta("Amoladora Angular","Makita",1900, "Japon",4,5,"Electrica","Plastico y metal",11);
        Herramienta h3 = new Herramienta("Hidrolavadora","Karcher",2300,"Alemania",5,5,"Automotriz","Plastico",12);
        aplicacion.agregarProd2(h1);
        aplicacion.agregarProd2(h2);
        aplicacion.agregarProd2(h3);

        aplicacion.mostrarListaDeProductos();

        Producto p = aplicacion.buscarProd2("Taladro Inalambrico");
        if (p != null && p instanceof Juguete){
            System.out.println((Juguete)p);
        }
        if (p != null && p instanceof Mueble){
            System.out.println((Mueble)p);
        }
        if (p != null && p instanceof Electrodomestico){
            System.out.println((Electrodomestico)p);
        }
        if (p != null && p instanceof Herramienta){
            System.out.println((Herramienta)p);
        }

        aplicacion.obtenerProdSinStock();

            //aplicacion.menu();
    }
}
