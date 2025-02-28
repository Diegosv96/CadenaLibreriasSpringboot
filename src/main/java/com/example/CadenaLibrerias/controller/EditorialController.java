package com.example.CadenaLibrerias.controller;

import com.example.CadenaLibrerias.model.Editorial;
import com.example.CadenaLibrerias.service.EditorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/editoriales")
public class EditorialController {

    @Autowired
    private EditorialService editorialService;

    @PostMapping("/add")
    public ResponseEntity<Editorial> addEditorial(@RequestBody Editorial editorial) {
        return new ResponseEntity<>(editorialService.agregarEditorial(editorial), HttpStatus.OK);
    }
    @GetMapping("/get")
    public ResponseEntity<List<Editorial>> getEditoriales(){
        return new ResponseEntity<>(editorialService.obtenerEditoriales(),HttpStatus.OK)
;    }
}
