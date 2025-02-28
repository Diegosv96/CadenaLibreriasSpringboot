package com.example.CadenaLibrerias.repository;

import com.example.CadenaLibrerias.model.Libreria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface LibreriaRepository extends JpaRepository<Libreria,Integer> {
//    @Query("FROM Libreria l WHERE l.id = :id")
//    Libreria getLibreriaById(@Param("id") int libreriaId);
}
