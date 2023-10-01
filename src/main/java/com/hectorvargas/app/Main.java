package com.hectorvargas.app;

import com.hectorvargas.dominio.MaquinaDispensadora;
import com.hectorvargas.dominio.Producto;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MaquinaDispensadora maquina = new MaquinaDispensadora();
        Producto producto1 = new Producto(1, "yupi", 1.200, 4, 8);
        Producto producto2 = new Producto(2, "papasMargarita", 1.800, 3, 8);
        Producto producto3 = new Producto(3, "Frunas", 2.000, 8, 8);
        Producto producto4 = new Producto(4, "galletaFestival", 800, 4, 8);
        Producto producto5 = new Producto(5, "mrBrownie", 1.000, 3, 8);
        Producto producto6 = new Producto(6, "jugoHit", 1.500, 0, 8);
        Producto producto7 = new Producto(7, "ponyMaltamini", 2.000, 8, 8);
        Producto producto8 = new Producto(8, "nucita", 1.250, 7, 8);
        Producto producto9 = new Producto(9, "maniMono", 2.000, 6, 8);
        Producto producto10 = new Producto(10, "galletaMilo", 1.000, 5, 8);



        maquina.agregarProducto(producto1);
        maquina.agregarProducto(producto2);
        maquina.agregarProducto(producto3);
        maquina.agregarProducto(producto4);
        maquina.agregarProducto(producto5);
        maquina.agregarProducto(producto6);
        maquina.agregarProducto(producto7);
        maquina.agregarProducto(producto8);
        maquina.agregarProducto(producto9);
        maquina.agregarProducto(producto10);


        maquina.sacarUnidadPorCodigo(1);
        maquina.sacarUnidadPorNombre("papasMargarita");
        System.out.println();

        List<String> agotados = maquina.consultarProductosAgotados();
        System.out.println("Productos agotados: " + agotados);

        int totalUnidadesProducto = maquina.consultarTotalUnidadesProducto(3);
        System.out.println("Total de unidades de Frunas: " + totalUnidadesProducto);

        int totalUnidadesTodosProductos = maquina.consultarTotalUnidadesTodosProductos();
        System.out.println("Total de unidades de todos los productos: " + totalUnidadesTodosProductos);

        maquina.aumentarCantidadProducto(7, 6);


    }
}