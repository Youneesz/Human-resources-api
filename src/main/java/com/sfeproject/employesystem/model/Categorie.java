package com.sfeproject.employesystem.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "categorie")
public class Categorie implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "CODE_CAT", nullable = false)
    private Integer codeCat;

    @Column(name = "INTITULE_CAT")
    private String intituleCat;

}
