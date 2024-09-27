package com.example.Persona.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;

import java .util.List;

import java.io.Serializable;
import java.util.ArrayList;

@Entity
@Table(name = "persona")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
@Audited

public class Persona extends Base{

    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)   //extiende de base el ID
    //private Long id;

    @Column(name="nombre")
    private String nombre;

    @Column(name="apellido")
    private String apellido;

    @OneToOne(cascade = CascadeType.ALL)    //Permite hacer la persistencia, eliminacion, y actualizacion
    @JoinColumn(name = "fk_domicilio")      //mediante la misma persona.
    private Domicilio domicilio;            //Este es el forein key

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(
            name = "persona_libro",
            joinColumns = @JoinColumn(name = "persona_id"),
            inverseJoinColumns = @JoinColumn(name = "libro_id")
    )
    private List<Libro> libros = new ArrayList<Libro>();
}

