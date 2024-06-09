package com.example.DSWII_CL1SOAP_1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import java.util.Date;

@Entity
public class Publicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPublicacion;
    private String titulo;
    private String resumen;
    private Date fechPublicacion;

    @ManyToOne
    @JoinColumn(name = "idAutor")
    private Autor autor;

    // Getters and Setters
    public int getIdPublicacion() {
        return idPublicacion;
    }

    public void setIdPublicacion(int idPublicacion) {
        this.idPublicacion = idPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public Date getFechPublicacion() {
        return fechPublicacion;
    }

    public void setFechPublicacion(Date fechPublicacion) {
        this.fechPublicacion = fechPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    // CreatePublicacionRequest.java
    public class CreatePublicacionRequest {
        private String titulo;
        private String resumen;
        private Date fechPublicacion;
        private int idAutor;

        // Getters and Setters
    }

    // CreatePublicacionResponse.java
    public class CreatePublicacionResponse {
        private Publicacion publicacion;

        // Getters and Setters
    }

    // UpdatePublicacionRequest.java
    public class UpdatePublicacionRequest {
        private int idPublicacion;
        private String titulo;
        private String resumen;
        private Date fechPublicacion;
        private int idAutor;

        // Getters and Setters
    }

    // UpdatePublicacionResponse.java
    public class UpdatePublicacionResponse {
        private Publicacion publicacion;

        // Getters and Setters
    }

    // GetAllPublicacionesRequest.java
    public class GetAllPublicacionesRequest {
        // No fields required
    }

    // GetAllPublicacionesResponse.java
    public class GetAllPublicacionesResponse {
        private List<Publicacion> publicaciones;

        // Getters and Setters
    }

    // GetPublicacionByIdRequest.java
    public class GetPublicacionByIdRequest {
        private int idPublicacion;

        // Getters and Setters
    }

    // GetPublicacionByIdResponse.java
    public class GetPublicacionByIdResponse {
        private Publicacion publicacion;

        // Getters and Setters
    }

    // DeletePublicacionRequest.java
    public class DeletePublicacionRequest {
        private int idPublicacion;

        // Getters and Setters
    }

    // DeletePublicacionResponse.java
    public class DeletePublicacionResponse {
        private String message;

        // Getters and Setters
    }

}
