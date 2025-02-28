package com.example.CadenaLibrerias.controller;

import com.example.CadenaLibrerias.model.Libreria;
import com.example.CadenaLibrerias.model.Libro;
import com.example.CadenaLibrerias.service.LibreriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/librerias")
public class LibreriaController {
    @Autowired
    private LibreriaService libreriaService;

    @PostMapping("/add")
    public ResponseEntity<Libreria> addLibreria(@RequestBody Libreria libreria) {
        return new ResponseEntity<>(libreriaService.agregarLibreria(libreria), HttpStatus.OK);
    }

    @GetMapping("/get")
    public ResponseEntity<List<Libreria>> getLibrerias() {
        return new ResponseEntity<>(libreriaService.obtenerLibrerias(), HttpStatus.OK);
    }
    @GetMapping("/getLibros")
    public ResponseEntity<List<Libro>> getLibrosLibreria(@RequestParam int libreriaId) {
        return new ResponseEntity<>(libreriaService.obtenerLibrosLibreria(libreriaId),HttpStatus.OK);
    }
    @GetMapping("/test")
    public String test() {
        return "test OK";
    }

}
