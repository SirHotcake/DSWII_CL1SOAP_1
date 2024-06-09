package com.example.DSWII_CL1SOAP_1.controller;

import com.example.DSWII_CL1SOAP_1.model.Autor;
import com.example.DSWII_CL1SOAP_1.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.List;
import java.util.Optional;

@Endpoint
public class AutorController {

    private static final String NAMESPACE_URI = "http://example.com/DSWII_CL1SOAP_1";

    @Autowired
    private AutorService autorService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "CreateAutorRequest")
    @ResponsePayload
    public CreateAutorResponse createAutor(@RequestPayload CreateAutorRequest request) {
        CreateAutorResponse response = new CreateAutorResponse();
        Autor autor = new Autor();
        autor.setNomAutor(request.getNomAutor());
        autor.setApeAutor(request.getApeAutor());
        autor.setFechNacAutor(request.getFechNacAutor());
        response.setAutor(autorService.createAutor(autor));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "UpdateAutorRequest")
    @ResponsePayload
    public UpdateAutorResponse updateAutor(@RequestPayload UpdateAutorRequest request) {
        UpdateAutorResponse response = new UpdateAutorResponse();
        Optional<Autor> autorOpt = autorService.getAutorById(request.getIdAutor());
        if (autorOpt.isPresent()) {
            Autor autor = autorOpt.get();
            autor.setNomAutor(request.getNomAutor());
            autor.setApeAutor(request.getApeAutor());
            autor.setFechNacAutor(request.getFechNacAutor());
            response.setAutor(autorService.updateAutor(autor));
        } else {
            // Handle autor not found
        }
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetAllAutoresRequest")
    @ResponsePayload
    public GetAllAutoresResponse getAllAutores(@RequestPayload GetAllAutoresRequest request) {
        GetAllAutoresResponse response = new GetAllAutoresResponse();
        List<Autor> autores = autorService.getAllAutores();
        response.setAutores(autores);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetAutorByIdRequest")
    @ResponsePayload
    public GetAutorByIdResponse getAutorById(@RequestPayload GetAutorByIdRequest request) {
        GetAutorByIdResponse response = new GetAutorByIdResponse();
        Optional<Autor> autor = autorService.getAutorById(request.getIdAutor());
        if (autor.isPresent()) {
            response.setAutor(autor.get());
        } else {
            // Handle autor not found
        }
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "DeleteAutorRequest")
    @ResponsePayload
    public DeleteAutorResponse deleteAutor(@RequestPayload DeleteAutorRequest request) {
        DeleteAutorResponse response = new DeleteAutorResponse();
        autorService.deleteAutor(request.getIdAutor());
        response.setMessage("Autor deleted successfully");
        return response;
    }
}
