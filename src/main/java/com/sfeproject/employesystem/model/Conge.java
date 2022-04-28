package com.sfeproject.employesystem.model;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "conge")
public class Conge implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODE_CONGE", nullable = false)
    private Integer codeConge;

    @Column(name = "INTITULE_CONGE")
    private String intituleConge;

    @Column(name = "DESCRIPTION_CONGE")
    private String descriptionConge;

}
