package com.sfeproject.employesystem.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "demande_conge")
public class DemandeConge implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "NUM_DEMANDE", nullable = false)
    private Integer numDemande;

    //    @Column(name = "CODE_CONGE", nullable = false)
    @ManyToOne
    @JoinColumn(name = "CODE_CONGE")
    private Conge conge;

    //    @Column(name = "CODE_EMP", nullable = false)
    @ManyToOne()
    @JsonBackReference
    @JoinColumn(name = "CODE_EMP")
    private Employe employe;

    @Column(name = "DATE_DEMANDE")
    private Date dateDemande;

    @Column(name = "EXERCICE")
    private Integer exercice;

    @Column(name = "DATE_DEBUT")
    private Date dateDebut;

    @Column(name = "DATE_FIN")
    private Date dateFin;

    @Column(name = "DATE_ETAT")
    private Date dateEtat;

    @Column(name = "ETAT")
    private String etat;

    @Column(name = "MOTIF")
    private String motif;

    public DemandeConge(Integer numDemande, Conge conge, Employe employee, Date dateDemande, Integer exercice, Date dateDebut, Date dateFin, Date dateEtat, String etat, String motif) {
        this.numDemande = numDemande;
        this.conge = conge;
        this.employe = employee;
        this.dateDemande = dateDemande;
        this.exercice = exercice;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.dateEtat = dateEtat;
        this.etat = etat;
        this.motif = motif;
    }

    public DemandeConge() {
    }


    public Integer getNumDemande() {
        return numDemande;
    }

    public void setNumDemande(Integer numDemande) {
        this.numDemande = numDemande;
    }

    public Conge getConge() {
        return this.conge;
    }

    public void setConge(Conge conge) {
        this.conge = conge;
    }

    public Employe getEmp() {
        return employe;
    }

    public void setEmp(Employe employee) {
        this.employe = employee;
    }

    public Date getDateDemande() {
        return dateDemande;
    }

    public void setDateDemande(Date dateDemande) {
        this.dateDemande = dateDemande;
    }

    public Integer getexercice() {
        return exercice;
    }

    public void setexercice(Integer exercice) {
        this.exercice = exercice;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public Date getDateEtat() {
        return dateEtat;
    }

    public void setDateEtat(Date dateEtat) {
        this.dateEtat = dateEtat;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public String getmotif() {
        return motif;
    }

    public void setmotif(String motif) {
        this.motif = motif;
    }
}
