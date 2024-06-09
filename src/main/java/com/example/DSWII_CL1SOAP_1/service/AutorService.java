package com.example.DSWII_CL1SOAP_1.service;

import com.example.DSWII_CL1SOAP_1.model.Autor;
import com.example.DSWII_CL1SOAP_1.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutorService {

    @Autowired
    private AutorRepository autorRepository;

    public Autor createAutor(Autor autor) {
        return autorRepository.save(autor);
    }

    public Autor updateAutor(Autor autor) {
        return autorRepository.save(autor);
    }

    public List<Autor> getAllAutores() {
        return autorRepository.findAll();
    }

    public Optional<Autor> getAutorById(int id) {
        return autorRepository.findById(id);
    }

    public void deleteAutor(int id) {
        autorRepository.deleteById(id);
    }
}
