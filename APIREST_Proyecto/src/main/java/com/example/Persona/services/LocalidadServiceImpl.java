package com.example.Persona.services;

import com.example.Persona.entities.Localidad;
import com.example.Persona.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl <Localidad, Long> implements LocalidadService{
    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }
}
