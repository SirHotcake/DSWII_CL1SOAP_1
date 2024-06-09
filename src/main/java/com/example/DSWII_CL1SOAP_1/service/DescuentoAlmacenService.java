package com.example.DSWII_CL1SOAP_1.service;

public class DescuentoAlmacenService {
    public double calcularTotal(double cantidad, double precioUnitario) {
        double total = cantidad * precioUnitario;
        if (total > 200) {
            total *= 0.8;
        }
        return total;
    }
}
