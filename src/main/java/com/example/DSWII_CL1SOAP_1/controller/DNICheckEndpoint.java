package com.example.DSWII_CL1SOAP_1.controller;

import model.DNICheckRequest;
import model.DNICheckResponse;
import service.DNICheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class DNICheckEndpoint {
    private static final String NAMESPACE_URI = "http://example.com/DSWII_CL1SOAP_1";

    @Autowired
    private DNICheckService dniCheckService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "DNICheckRequest")
    @ResponsePayload
    public DNICheckResponse checkDNI(@RequestPayload DNICheckRequest request) {
        DNICheckResponse response = new DNICheckResponse();
        response.setDebeSacarDNI(dniCheckService.debeSacarDNI(request.getAnioNacimiento()));
        return response;
    }
}
