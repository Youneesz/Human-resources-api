package com.sfeproject.employesystem.model;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "tache")
public class Tache implements Serializable {

    private static final long serialVersionUID = 1L;

    public Tache(Integer codeTache, String intituleTache, String descriptionTache) {
        this.codeTache = codeTache;
        this.intituleTache = intituleTache;
        this.descriptionTache = descriptionTache;
    }

    public Tache() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODE_TACHE", nullable = false)
    private Integer codeTache;

    @Column(name = "INTITULE_TACHE")
    private String intituleTache;

    @Column(name = "DESCRIPTION_TACHE")
    private String descriptionTache;

}
