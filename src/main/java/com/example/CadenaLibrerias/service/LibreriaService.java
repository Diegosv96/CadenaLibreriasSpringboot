package com.example.CadenaLibrerias.service;

import com.example.CadenaLibrerias.model.Libreria;
import com.example.CadenaLibrerias.model.Libro;

import java.util.List;

public interface LibreriaService {
    Libreria agregarLibreria(Libreria libreria);
    List<Libreria> obtenerLibrerias();
    List<Libro> obtenerLibrosLibreria(int libreriaId);
}
