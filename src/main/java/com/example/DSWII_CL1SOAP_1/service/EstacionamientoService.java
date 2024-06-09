package com.example.DSWII_CL1SOAP_1.service;

public class EstacionamientoService {
    public double calcularCosto(int horas, int minutos) {
        double tarifaPorHora = 1.5;
        double totalHoras = horas + (minutos > 0 ? 1 : 0);
        return totalHoras * tarifaPorHora;
    }
}

