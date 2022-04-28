package com.sfeproject.employesystem.model;
import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
@Entity
@Table(name = "realiser")
@IdClass(RealiserId.class)
public class Realiser implements Serializable {

    public Realiser(Integer codeEmp, Integer codeTache, Integer codeBureau, Integer numAffectation, Date dateAffectation) {
        this.codeEmp = codeEmp;
        this.codeTache = codeTache;
        this.codeBureau = codeBureau;
        this.numAffectation = numAffectation;
        this.dateAffectation = dateAffectation;
    }

    public Realiser() {}

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
