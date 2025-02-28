package com.example.CadenaLibrerias.service;

import com.example.CadenaLibrerias.model.Libro;

import java.util.List;

public interface LibroService {
    Libro agregarLibro(Libro libro);
    List<Libro> obtenerLibros();
}
