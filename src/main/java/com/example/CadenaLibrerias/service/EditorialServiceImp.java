package com.example.CadenaLibrerias.service;

import com.example.CadenaLibrerias.model.Editorial;
import com.example.CadenaLibrerias.repository.EditorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EditorialServiceImp implements EditorialService{
    @Autowired
    private EditorialRepository editorialRepository;
    @Override
    public Editorial agregarEditorial(Editorial editorial) {
        return editorialRepository.save(editorial);
    }

    @Override
    public List<Editorial> obtenerEditoriales() {
        return editorialRepository.findAll();
    }
}
