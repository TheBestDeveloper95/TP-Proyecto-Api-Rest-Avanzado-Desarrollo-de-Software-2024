package com.example.Persona.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;


@Entity
@Table(name = "localidad")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
@Audited

public class Localidad extends Base {

    //@Id
    //@GeneratedValue( strategy = GenerationType.IDENTITY) //extiende de base el ID
    //private long id;

    @Column(name="denominación")
    private String denominacion;

    @OneToMany(mappedBy = "localidad", cascade = CascadeType.ALL, orphanRemoval = true)
    @Builder.Default
    private List<Domicilio> domicilios = new ArrayList<Domicilio>();



}
