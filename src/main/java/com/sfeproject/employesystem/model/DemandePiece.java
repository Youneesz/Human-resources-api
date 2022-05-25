package com.sfeproject.employesystem.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "demande_piece")
public class DemandePiece implements Serializable{


    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "NUM_DEMANDE", nullable = false)
    private Integer numDemande;


//    @Column(name = "CODE_EMP", nullable = false)
    @ManyToOne
    @JoinColumn(name = "CODE_EMP")
    private Employe employe;

//    @Column(name = "CODE_PIECE", nullable = false)

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "CODE_PIECE")
    private Piece piece;

    @Column(name = "DATE_DEMANDE")
    private Date dateDemande;

    @Column(name = "DATE_ETAT")
    private Date dateEtat;

    @Column(name = "ETAT_DEMANDE")
    private String etat;

    @Column(name = "MOTIF_REFUS")
    private String motifRefus;

    public DemandePiece(Integer numDemande, Employe employee, Piece piece, Date dateDemande, Date dateEtat, String etat, String motifRefus) {
        this.numDemande = numDemande;
        this.employe = employee;
        this.piece = piece;
        this.dateDemande = dateDemande;
        this.dateEtat = dateEtat;
        this.etat = etat;
        this.motifRefus = motifRefus;
    }

    public DemandePiece() {}



    public Integer getNumDemande() {
        return numDemande;
    }

    public void setNumDemande(Integer numDemande) {
        this.numDemande = numDemande;
    }

    public Employe getEmployee() {
        return employe;
    }

    public void setEmployee(Employe employee) {
        this.employe = employee;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public Date getDateDemande() {
        return dateDemande;
    }

    public void setDateDemande(Date dateDemande) {
        this.dateDemande = dateDemande;
    }

    public Date getDateEtat() {
        return dateEtat;
    }

    public void setDateEtat(Date dateEtat) {
        this.dateEtat = dateEtat;
    }

    public String getEtatDemande() {
        return etat;
    }

    public void setEtatDemande(String etat) {
        this.etat = etat;
    }

    public String getMotifRefus() {
        return motifRefus;
    }

    public void setMotifRefus(String motifRefus) {
        this.motifRefus = motifRefus;
    }

    @Override
    public String toString() {
        return "DemandePiece{" +
                "numDemande=" + numDemande +
                ", employee=" + employe +
                ", codePiece=" + piece +
                ", dateDemande=" + dateDemande +
                ", dateEtat=" + dateEtat +
                ", etatDemande='" + etat + '\'' +
                ", motifRefus='" + motifRefus + '\'' +
                '}';
    }
}
