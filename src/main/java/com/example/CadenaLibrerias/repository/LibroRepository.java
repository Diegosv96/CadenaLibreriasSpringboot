package com.example.CadenaLibrerias.repository;

import com.example.CadenaLibrerias.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LibroRepository extends JpaRepository<Libro,Integer> {
}
