package com.sfeproject.employesystem.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "realiser")

public class Realiser implements Serializable {


    private static final long serialVersionUID = 1L;


    @Id
    @Column(name = "NUM_AFFECTATION")
    private Integer numAffectation;

    //    @Column(name = "CODE_EMP", nullable = false)
    @ManyToOne
    @JoinColumn(name = "CODE_EMP")
    @JsonBackReference
    private Employe employe;


    //    @Column(name = "CODE_TACHE", nullable = false)
    @ManyToOne
    @JoinColumn(name = "CODE_TACHE")
    private Tache tache;


    //    @Column(name = "CODE_BUREAU", nullable = false)
    @ManyToOne
    @JoinColumn(name = "CODE_BUREAU")
    private Bureau bureau;


    @Column(name = "DATE_AFFECTATION")
    private Date dateAffectation;

    public Realiser(Employe employee, Tache tache, Bureau bureau, Integer numAffectation, Date dateAffectation) {
        this.employe = employee;
        this.tache = tache;
        this.bureau = bureau;
        this.numAffectation = numAffectation;
        this.dateAffectation = dateAffectation;
    }

    public Realiser() {
    }

    public Employe getEmployee() {
        return employe;
    }

    public void setEmployee(Employe employee) {
        this.employe = employee;
    }

    public Tache getTache() {
        return tache;
    }

    public void setTache(Tache tache) {
        this.tache = tache;
    }

    public Bureau getBureau() {
        return bureau;
    }

    public void setBureau(Bureau bureau) {
        this.bureau = bureau;
    }

    public Integer getNumAffectation() {
        return numAffectation;
    }

    public void setNumAffectation(Integer numAffectation) {
        this.numAffectation = numAffectation;
    }

    public Date getDateAffectation() {
        return dateAffectation;
    }

    public void setDateAffectation(Date dateAffectation) {
        this.dateAffectation = dateAffectation;
    }
}
