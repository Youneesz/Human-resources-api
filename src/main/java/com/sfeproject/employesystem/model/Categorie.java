package com.sfeproject.employesystem.model;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "categorie")
public class Categorie implements Serializable {

    public Categorie(Integer codeCat, String intituleCat) {
        this.codeCat = codeCat;
        this.intituleCat = intituleCat;
    }

    public Categorie() {}

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODE_CAT", nullable = false)
    private Integer codeCat;

    @Column(name = "INTITULE_CAT")
    private String intituleCat;

}
