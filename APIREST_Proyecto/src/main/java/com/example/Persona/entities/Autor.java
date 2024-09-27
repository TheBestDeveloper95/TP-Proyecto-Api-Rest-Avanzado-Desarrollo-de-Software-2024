package com.example.Persona.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
@Audited
@Table(name = "autor")
public class Autor extends Base{

    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)  //extiende de base el ID
    //private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "biografia", length = 1500)
    private String biografia;

    //@ManyToMany( cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    //@JoinTable (
    //        name = "autor_Libro",
    //        joinColumns = @JoinColumn(name = "autorId"),
    //                inverseJoinColumns = @JoinColumn (name = "libroID")
    //)
    //        @Builder.Default
    //        private List<Libro> libros = new ArrayList<>();
}
