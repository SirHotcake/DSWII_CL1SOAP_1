package com.example.DSWII_CL1SOAP_1.controller;

import com.example.DSWII_CL1SOAP_1.model.Publicacion;
import com.example.DSWII_CL1SOAP_1.service.PublicacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.List;
import java.util.Optional;

@Endpoint
public class PublicacionController {

    private static final String NAMESPACE_URI = "http://example.com/DSWII_CL1SOAP_1";

    @Autowired
    private PublicacionService publicacionService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "CreatePublicacionRequest")
    @ResponsePayload
    public CreatePublicacionResponse createPublicacion(@RequestPayload CreatePublicacionRequest request) {
        CreatePublicacionResponse response = new CreatePublicacionResponse();
        Publicacion publicacion = new Publicacion();
        publicacion.setTitulo(request.getTitulo());
        publicacion.setResumen(request.getResumen());
        publicacion.setFechPublicacion(request.getFechPublicacion());
        // Set autor
        response.setPublicacion(publicacionService.createPublicacion(publicacion));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "UpdatePublicacionRequest")
    @ResponsePayload
    public UpdatePublicacionResponse updatePublicacion(@RequestPayload UpdatePublicacionRequest request) {
        UpdatePublicacionResponse response = new UpdatePublicacionResponse();
        Optional<Publicacion> publicacionOpt = publicacionService.getPublicacionById(request.getIdPublicacion());
        if (publicacionOpt.isPresent()) {
            Publicacion publicacion = publicacionOpt.get();
            publicacion.setTitulo(request.getTitulo());
            publicacion.setResumen(request.getResumen());
            publicacion.setFechPublicacion(request.getFechPublicacion());
            // Set autor
            response.setPublicacion(publicacionService.updatePublicacion(publicacion));
        } else {
            // Handle publicacion not found
        }
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetAllPublicacionesRequest")
    @ResponsePayload
    public GetAllPublicacionesResponse getAllPublicaciones(@RequestPayload GetAllPublicacionesRequest request) {
        GetAllPublicacionesResponse response = new GetAllPublicacionesResponse();
        List<Publicacion> publicaciones = publicacionService.getAllPublicaciones();
        response.setPublicaciones(publicaciones);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetPublicacionByIdRequest")
    @ResponsePayload
    public GetPublicacionByIdResponse getPublicacionById(@RequestPayload GetPublicacionByIdRequest request) {
        GetPublicacionByIdResponse response = new GetPublicacionByIdResponse();
        Optional<Publicacion> publicacion = publicacionService.getPublicacionById(request.getIdPublicacion());
        if (publicacion.isPresent()) {
            response.setPublicacion(publicacion.get());
        } else {
            // Handle publicacion not found
        }
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "DeletePublicacionRequest")
    @ResponsePayload
    public DeletePublicacionResponse deletePublicacion(@RequestPayload DeletePublicacionRequest request) {
        DeletePublicacionResponse response = new DeletePublicacionResponse();
        publicacionService.deletePublicacion(request.getIdPublicacion());
        response.setMessage("Publicacion deleted successfully");
        return response;
    }
}
