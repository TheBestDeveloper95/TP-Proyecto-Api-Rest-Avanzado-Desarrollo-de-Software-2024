package com.example.Persona.repositories;


import com.example.Persona.entities.Base;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface BaseRepository <E extends Base,ID extends Serializable> extends JpaRepository<E, ID> {


}
