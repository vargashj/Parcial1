package com.hectorvargas.dominio;

import java.util.ArrayList;
import java.util.List;


public class MaquinaDispensadora {
    private List<Producto> productos;

    public MaquinaDispensadora() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void sacarUnidadPorCodigo(int codigo) {
        for (Producto producto : productos) {
            if (producto.getCodigo() == codigo) {
                producto.disminuirCantidad(1);
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }

    public void sacarUnidadPorNombre(String nombre) {
        for (Producto producto : productos) {
            if (producto.getNombreHV().equalsIgnoreCase(nombre)) {
                producto.disminuirCantidad(1);
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }

    public List<String> consultarProductosAgotados() {
        List<String> agotados = new ArrayList<>();
        for (Producto producto : productos) {
            if (producto.getCantidadDisponibleHV() == 0) {
                agotados.add(producto.getNombreHV());
            }
        }
        return agotados;
    }

    public int consultarTotalUnidadesProducto(int codigo) {
        for (Producto producto : productos) {
            if (producto.getCodigo() == codigo) {
                return producto.getCantidadDisponibleHV();
            }
        }
        return 0;
    }

    public int consultarTotalUnidadesTodosProductos() {
        int total = 0;
        for (Producto producto : productos) {
            total += producto.getCantidadDisponibleHV();
        }
        return total;
    }

    public void aumentarCantidadProducto(int codigo, double cantidad) {
        for (Producto producto : productos) {
            if (producto.getCodigo() == codigo) {
                producto.aumentarCantidad();
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }



}











