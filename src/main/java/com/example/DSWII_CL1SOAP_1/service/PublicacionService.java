package com.example.DSWII_CL1SOAP_1.service;

import com.example.DSWII_CL1SOAP_1.model.Publicacion;
import com.example.DSWII_CL1SOAP_1.repository.PublicacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PublicacionService {

    @Autowired
    private PublicacionRepository publicacionRepository;

    public Publicacion createPublicacion(Publicacion publicacion) {
        return publicacionRepository.save(publicacion);
    }

    public Publicacion updatePublicacion(Publicacion publicacion) {
        return publicacionRepository.save(publicacion);
    }

    public List<Publicacion> getAllPublicaciones() {
        return publicacionRepository.findAll();
    }

    public Optional<Publicacion> getPublicacionById(int id) {
        return publicacionRepository.findById(id);
    }

    public void deletePublicacion(int id) {
        publicacionRepository.deleteById(id);
    }
}
