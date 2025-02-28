package com.example.CadenaLibrerias.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "libros")
public class Libro implements Serializable {
    public Libro(){}

    public Libro(int id, String titulo, Double precio, Editorial editorial, Autor autor, List<Libreria> librerias) {
        this.id = id;
        this.titulo = titulo;
        this.precio = precio;
        this.editorial = editorial;
        this.autor = autor;
        this.librerias = librerias;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String titulo;
    @Column
    private Double precio;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "editorial_id")
    @JsonBackReference
    private Editorial editorial;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "autor_id")
    @JsonBackReference
    private Autor autor;
    @ManyToMany(mappedBy = "libros",fetch = FetchType.EAGER)
    @JsonBackReference
    private List<Libreria> librerias;

    public Libro(String titulo, Double precio){
        this.titulo = titulo;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", titulo=" + titulo +
                ", precio=" + precio +
                ", editorial=" + (editorial != null ? editorial.getNombre() : "N/A") +
                ", autor=" + (autor != null ? autor.getNombre() : "N/A") +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public List<Libreria> getLibrerias() {
        return librerias;
    }

    public void setLibrerias(List<Libreria> librerias) {
        this.librerias = librerias;
    }
}
