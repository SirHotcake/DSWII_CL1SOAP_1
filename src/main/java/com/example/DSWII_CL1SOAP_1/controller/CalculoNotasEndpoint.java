package com.example.DSWII_CL1SOAP_1.controller;

import model.CalcularPromedioRequest;
import model.CalcularPromedioResponse;
import service.CalculoNotasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CalculoNotasEndpoint {
    private static final String NAMESPACE_URI = "http://example.com/DSWII_CL1SOAP_1";

    @Autowired
    private CalculoNotasService calculoNotasService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "CalcularPromedioRequest")
    @ResponsePayload
    public CalcularPromedioResponse calcularPromedio(@RequestPayload CalcularPromedioRequest request) {
        CalcularPromedioResponse response = new CalcularPromedioResponse();
        double[] notas = {request.getNota1(), request.getNota2(), request.getNota3(), request.getNota4()};
        response.setPromedio(calculoNotasService.calcularPromedio(notas));
        return response;
    }
}
