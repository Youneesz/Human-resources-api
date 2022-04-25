package com.sfeproject.employesystem.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Data
@Entity
@Table(name = "realiser")
public class Realiser implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "CODE_EMP", nullable = false)
    private Integer codeEmp;

    @Id
    @Column(name = "CODE_TACHE", nullable = false)
    private Integer codeTache;

    @Id
    @Column(name = "CODE_BUREAU", nullable = false)
    private Integer codeBureau;

    @Column(name = "NUM_AFFECTATION")
    private Integer numAffectation;

    @Column(name = "DATE_AFFECTATION")
    private Date dateAffectation;

}
