package com.example.CadenaLibrerias.service;

import com.example.CadenaLibrerias.model.Libro;
import com.example.CadenaLibrerias.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroServiceImp implements LibroService{
    @Autowired
    private LibroRepository libroRepository;
    @Override
    public Libro agregarLibro(Libro libro) {
        return libroRepository.save(libro);
    }

    @Override
    public List<Libro> obtenerLibros() {
        return libroRepository.findAll();
    }
}
