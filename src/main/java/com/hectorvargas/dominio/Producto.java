package com.hectorvargas.dominio;


public class Producto {
    private final int codigo;
    private int codigoHV;
    private String nombreHV;
    private double precioHV;
    private int cantidadDisponibleHV;
    private int capacidadMaximaHV;

    public Producto(int codigo, String nombreHV, double precioHV, int cantidadDisponibleHV, int capacidadMaximaHV) {
        this.codigo = codigo;
        this.codigoHV = codigoHV;
        this.nombreHV = nombreHV;
        this.precioHV = precioHV;
        this.cantidadDisponibleHV = cantidadDisponibleHV;
        this.capacidadMaximaHV = capacidadMaximaHV;
    }
    public void aumentarCantidad() {
        int cantidad = 0;
        if (cantidad + cantidadDisponibleHV <= capacidadMaximaHV) {
            cantidadDisponibleHV += cantidad;
        } else {
            System.out.println("capacidad máxima.");
        }
    }

    public void disminuirCantidad(int cantidad) {
        if (cantidadDisponibleHV >= cantidad) {
            cantidadDisponibleHV -= cantidad;
        } else {
            System.out.println("No hay suficientes unidades disponibles.");
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public int getCodigoHV() {
        return codigoHV;
    }

    public String getNombreHV() {
        return nombreHV;
    }

    public double getPrecioHV() {
        return precioHV;
    }

    public int getCantidadDisponibleHV() {
        return cantidadDisponibleHV;
    }

    public int getCapacidadMaximaHV() {
        return capacidadMaximaHV;
    }



    public void setPrecioHV(double precioHV) {
        this.precioHV = precioHV;
    }

    public void setCantidadDisponibleHV(int cantidadDisponibleHV) {
        this.cantidadDisponibleHV = cantidadDisponibleHV;
    }


}


