package com.example.DSWII_CL1SOAP_1.controller;

import model.NumerosParesRequest;
import model.NumerosParesResponse;
import service.NumerosParesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class NumerosParesEndpoint {
    private static final String NAMESPACE_URI = "http://example.com/DSWII_CL1SOAP_1";

    @Autowired
    private NumerosParesService numerosParesService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "NumerosParesRequest")
    @ResponsePayload
    public NumerosParesResponse obtenerNumerosPares(@RequestPayload NumerosParesRequest request) {
        NumerosParesResponse response = new NumerosParesResponse();
        response.setNumerosPares(numerosParesService.obtenerParesDescendentes());
        return response;
    }
}
