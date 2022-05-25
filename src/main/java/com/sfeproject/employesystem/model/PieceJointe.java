package com.sfeproject.employesystem.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "piece_jointe")
public class PieceJointe implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODE_PIECE_J", nullable = false)
    private Integer codePieceJ;

//    @Column(name = "CODE_ACTUALITE", nullable = false)
    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "CODE_ACTUALITE")
    private Actualite actualite;

    @Column(name = "CHEMIN_PIECE_J")
    private String cheminPieceJ;

    public PieceJointe(String cheminPieceJ) {
        this.cheminPieceJ = cheminPieceJ;
    }

    public PieceJointe() {}

    public Integer getCodePieceJ() {
        return codePieceJ;
    }

    public void setCodePieceJ(Integer codePieceJ) {
        this.codePieceJ = codePieceJ;
    }

    public Actualite getActualite() {
        return actualite;
    }

    public void setActualite(Actualite actualite) {
        this.actualite = actualite;
    }

    public String getCheminPieceJ() {
        return cheminPieceJ;
    }

    public void setCheminPieceJ(String cheminPieceJ) {
        this.cheminPieceJ = cheminPieceJ;
    }
}
