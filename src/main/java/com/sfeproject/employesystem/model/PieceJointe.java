package com.sfeproject.employesystem.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "piece_jointe")
public class PieceJointe implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "CODE_PIECE_J", nullable = false)
    private Integer codePieceJ;

    @Column(name = "CODE_ACTUALITE", nullable = false)
    private Integer codeActualite;

    @Column(name = "CHEMIN_PIECE_J")
    private String cheminPieceJ;

    public Integer getCodePieceJ() {
        return codePieceJ;
    }

    public void setCodePieceJ(Integer codePieceJ) {
        this.codePieceJ = codePieceJ;
    }

    public Integer getCodeActualite() {
        return codeActualite;
    }

    public void setCodeActualite(Integer codeActualite) {
        this.codeActualite = codeActualite;
    }

    public String getCheminPieceJ() {
        return cheminPieceJ;
    }

    public void setCheminPieceJ(String cheminPieceJ) {
        this.cheminPieceJ = cheminPieceJ;
    }
}
