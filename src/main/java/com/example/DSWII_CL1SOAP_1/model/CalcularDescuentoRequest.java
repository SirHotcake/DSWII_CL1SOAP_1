package com.example.DSWII_CL1SOAP_1.model;

public class CalcularDescuentoRequest {
    private double cantidad;
    private double precioUnitario;

    // Getters and Setters
    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
}
