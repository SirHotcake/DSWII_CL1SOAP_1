package com.example.DSWII_CL1SOAP_1.service;

public class NumerosParesService {
    public int[] obtenerParesDescendentes() {
        int[] pares = new int[6];
        int index = 0;
        for (int i = 20; i >= 10; i -= 2) {
            pares[index++] = i;
        }
        return pares;
    }
}

