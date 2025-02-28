package com.example.CadenaLibrerias.service;

import com.example.CadenaLibrerias.model.Libreria;
import com.example.CadenaLibrerias.model.Libro;
import com.example.CadenaLibrerias.repository.LibreriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibreriaServiceImp implements LibreriaService{

    @Autowired
    private LibreriaRepository libreriaRepository;

    @Override
    public Libreria agregarLibreria(Libreria libreria) {
        return libreriaRepository.save(libreria);
    }

    @Override
    public List<Libreria> obtenerLibrerias() {
        return libreriaRepository.findAll();
    }

    @Override
    public List<Libro> obtenerLibrosLibreria(int libreriaId) {
        Optional<Libreria> libreria = libreriaRepository.findById(libreriaId);
        return libreria.orElseThrow().getLibros();
    }
}
