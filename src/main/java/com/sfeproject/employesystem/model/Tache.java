package com.sfeproject.employesystem.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "tache")
public class Tache implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "CODE_TACHE", nullable = false)
    private Integer codeTache;

    @Column(name = "INTITULE_TACHE")
    private String intituleTache;

    @Column(name = "DESCRIPTION_TACHE")
    private String descriptionTache;

}
