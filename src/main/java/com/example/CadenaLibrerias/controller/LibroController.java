package com.example.CadenaLibrerias.controller;

import com.example.CadenaLibrerias.model.Libro;
import com.example.CadenaLibrerias.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libros")
public class LibroController {
    @Autowired
    private LibroService libroService;
    @PostMapping("/add")
    public ResponseEntity<Libro> addLibro(@RequestBody Libro libro){
        return new ResponseEntity<>(libroService.agregarLibro(libro), HttpStatus.OK);
    }
    @GetMapping("/get")
    public ResponseEntity<List<Libro>> getLibros(){
        return new ResponseEntity<>(libroService.obtenerLibros(),HttpStatus.OK);
    }
}
