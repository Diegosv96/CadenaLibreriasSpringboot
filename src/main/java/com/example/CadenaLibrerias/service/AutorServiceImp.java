package com.example.CadenaLibrerias.service;

import com.example.CadenaLibrerias.model.Autor;
import com.example.CadenaLibrerias.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorServiceImp implements AutorService {

    @Autowired
    private AutorRepository autorRepository;
    @Override
    public Autor agregarAutor(Autor autor) {
        return autorRepository.save(autor);
    }

    @Override
    public List<Autor> obtenerAutores() {
        return autorRepository.findAll();
    }
}
