package com.example.CadenaLibrerias.service;

import com.example.CadenaLibrerias.model.Editorial;

import java.util.List;

public interface EditorialService {
    Editorial agregarEditorial(Editorial editorial);
    List<Editorial> obtenerEditoriales();
}
