package com.example.DSWII_CL1SOAP_1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAutor;
    private String nomAutor;
    private String apeAutor;
    private Date fechNacAutor;

    // Getters and Setters
    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public String getNomAutor() {
        return nomAutor;
    }

    public void setNomAutor(String nomAutor) {
        this.nomAutor = nomAutor;
    }

    public String getApeAutor() {
        return apeAutor;
    }

    public void setApeAutor(String apeAutor) {
        this.apeAutor = apeAutor;
    }

    public Date getFechNacAutor() {
        return fechNacAutor;
    }

    public void setFechNacAutor(Date fechNacAutor) {
        this.fechNacAutor = fechNacAutor;
    }

    // CreateAutorRequest.java
    public class CreateAutorRequest {
        private String nomAutor;
        private String apeAutor;
        private Date fechNacAutor;

        // Getters and Setters
    }

    // CreateAutorResponse.java
    public class CreateAutorResponse {
        private Autor autor;

        // Getters and Setters
    }

    // UpdateAutorRequest.java
    public class UpdateAutorRequest {
        private int idAutor;
        private String nomAutor;
        private String apeAutor;
        private Date fechNacAutor;

        // Getters and Setters
    }

    // UpdateAutorResponse.java
    public class UpdateAutorResponse {
        private Autor autor;

        // Getters and Setters
    }

    // GetAllAutoresRequest.java
    public class GetAllAutoresRequest {
        // No fields required
    }

    // GetAllAutoresResponse.java
    public class GetAllAutoresResponse {
        private List<Autor> autores;

        // Getters and Setters
    }

    // GetAutorByIdRequest.java
    public class GetAutorByIdRequest {
        private int idAutor;

        // Getters and Setters
    }

    // GetAutorByIdResponse.java
    public class GetAutorByIdResponse {
        private Autor autor;

        // Getters and Setters
    }

    // DeleteAutorRequest.java
    public class DeleteAutorRequest {
        private int idAutor;

        // Getters and Setters
    }

    // DeleteAutorResponse.java
    public class DeleteAutorResponse {
        private String message;

        // Getters and Setters
    }

}
