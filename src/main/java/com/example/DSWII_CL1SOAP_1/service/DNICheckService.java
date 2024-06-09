package com.example.DSWII_CL1SOAP_1.service;

import java.time.Year;

public class DNICheckService {
    public boolean debeSacarDNI(int anioNacimiento) {
        int edad = Year.now().getValue() - anioNacimiento;
        return edad >= 18;
    }
}

