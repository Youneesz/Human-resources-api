package com.sfeproject.employesystem.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
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

}