package com.example.Persona.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;


@Entity
@Table(name = "libro")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
@Audited


public class Libro extends Base {

    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)   //extiende de base el ID
    //private Long id;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "fecha")
    private Date fecha;

    @Column(name="genero")
    private String genero;

    @Column(name = "paginas")
    private int paginas;

    @ManyToMany(cascade = CascadeType.REFRESH)
    private List<Autor>autores;


}
