package com.example.CadenaLibrerias.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "librerias")
public class Libreria implements Serializable {
    public Libreria(){}

    public Libreria(int id, String nombre, String dueno, String direccion, List<Libro> libros) {
        this.id = id;
        this.nombre = nombre;
        this.dueno = dueno;
        this.direccion = direccion;
        this.libros = libros;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String nombre;
    @Column
    private String dueno;
    @Column
    private String direccion;

    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinTable(name = "librerias_libros", joinColumns = @JoinColumn(name = "libreria_id"),inverseJoinColumns = @JoinColumn(name = "libro_id"))
    private List<Libro> libros;

    public Libreria(String nombre, String dueno, String direccion){
        this.nombre = nombre;
        this.dueno = dueno;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

}
