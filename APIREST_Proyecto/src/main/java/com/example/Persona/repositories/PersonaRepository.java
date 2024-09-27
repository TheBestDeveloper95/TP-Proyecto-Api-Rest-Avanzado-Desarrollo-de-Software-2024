package com.example.Persona.repositories;

import com.example.Persona.entities.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {

               // Métodos de consultas por nombre o apellido con Spring Data JPA
    List<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido);


    Page<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido, Pageable pageable);

                        // Misma consulta usando anotación @Query JPQL
    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro%")
    List<Persona> search(@Param("filtro") String filtro);


    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro%")
    Page<Persona> search(@Param("filtro") String filtro, Pageable pageable);

                          // Misma consulta usando SQL nativo
    @Query(value = "SELECT * FROM persona WHERE persona.nombre LIKE %:filtro% OR persona.apellido LIKE %:filtro%",nativeQuery = true)
    List<Persona> searchNativo(@Param("filtro") String filtro);


    @Query(value = "SELECT * FROM persona WHERE persona.nombre LIKE %:filtro% OR persona.apellido LIKE %:filtro%",countQuery = "SELECT count(*) FROM persona",nativeQuery = true)
    Page<Persona> searchNativo(@Param("filtro") String filtro, Pageable pageable);

                    //
    //boolean existsByDni(int dni);
}