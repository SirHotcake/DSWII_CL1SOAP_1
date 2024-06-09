package com.example.DSWII_CL1SOAP_1.controller;

import model.CalcularDescuentoRequest;
import model.CalcularDescuentoResponse;
import service.DescuentoAlmacenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class DescuentoAlmacenEndpoint {
    private static final String NAMESPACE_URI = "http://example.com/DSWII_CL1SOAP_1";

    @Autowired
    private DescuentoAlmacenService descuentoAlmacenService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "CalcularDescuentoRequest")
    @ResponsePayload
    public CalcularDescuentoResponse calcularDescuento(@RequestPayload CalcularDescuentoRequest request) {
        CalcularDescuentoResponse response = new CalcularDescuentoResponse();
        response.setTotal(descuentoAlmacenService.calcularTotal(request.getCantidad(), request.getPrecioUnitario()));
        return response;
    }
}
