package com.example.DSWII_CL1SOAP_1.controller;

import model.CalcularCostoRequest;
import model.CalcularCostoResponse;
import service.EstacionamientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class EstacionamientoEndpoint {
    private static final String NAMESPACE_URI = "http://example.com/DSWII_CL1SOAP_1";

    @Autowired
    private EstacionamientoService estacionamientoService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "CalcularCostoRequest")
    @ResponsePayload
    public CalcularCostoResponse calcularCosto(@RequestPayload CalcularCostoRequest request) {
        CalcularCostoResponse response = new CalcularCostoResponse();
        response.setCosto(estacionamientoService.calcularCosto(request.getHoras(), request.getMinutos()));
        return response;
    }
}
