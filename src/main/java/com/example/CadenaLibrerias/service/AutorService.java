package com.example.CadenaLibrerias.service;

import com.example.CadenaLibrerias.model.Autor;

import java.util.List;

public interface AutorService {
    Autor agregarAutor(Autor autor);
    List<Autor> obtenerAutores();
}
