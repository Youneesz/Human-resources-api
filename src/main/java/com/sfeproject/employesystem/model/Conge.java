package com.sfeproject.employesystem.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "conge")
public class Conge implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "CODE_CONGE", nullable = false)
    private Integer codeConge;

    @Column(name = "INTITULE_CONGE")
    private String intituleConge;

    @Column(name = "DESCRIPTION_CONGE")
    private String descriptionConge;

}
