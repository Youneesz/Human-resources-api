package com.sfeproject.employesystem.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "bureau")
public class Bureau implements Serializable {

    public Bureau(Integer codeBureau, String intituleBureau, String descriptionBureau) {
        this.codeBureau = codeBureau;
        this.intituleBureau = intituleBureau;
        this.descriptionBureau = descriptionBureau;
    }

    public Bureau() {}

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CODE_BUREAU", nullable = false)
    private Integer codeBureau;

    @Column(name = "INTITULE_BUREAU")
    private String intituleBureau;

    @Column(name = "DESCRIPTION_BUREAU")
    private String descriptionBureau;

}
