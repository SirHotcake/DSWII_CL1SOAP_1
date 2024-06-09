package com.example.DSWII_CL1SOAP_1.service;

import java.util.Arrays;

public class CalculoNotasService {
    public double calcularPromedio(double[] notas) {
        Arrays.sort(notas);
        double suma = notas[1] * 0.2 + notas[2] * 0.3 + notas[3] * 0.5;
        return suma;
    }
}
