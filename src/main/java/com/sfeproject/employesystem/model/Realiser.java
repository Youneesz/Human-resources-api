package com.sfeproject.employesystem.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

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

    @ManyToOne
    @JoinColumn(name = "CODE_EMP")
  //  @JsonBackReference(value = "employeTaches")
    @JsonIgnore
    private Employe employeTaches;

    @ManyToOne
    @JoinColumn(name = "CODE_TACHE")
    private Tache tache;

    @ManyToOne
    @JoinColumn(name = "CODE_BUREAU")
    private Bureau bureau;
    @Column(name = "DATE_AFFECTATION")
    private Date dateAffectation;

    public Realiser() {
    }

    public Employe getEmployee() {
        return employeTaches;
    }

    public void setEmployee(Employe employee) {
        this.employeTaches = employee;
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
