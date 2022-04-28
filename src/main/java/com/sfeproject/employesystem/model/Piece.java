package com.sfeproject.employesystem.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "piece")
public class Piece implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODE_PIECE", nullable = false)
    private Integer codePiece;

    @Column(name = "INTITULE_PIECE")
    private String intitulePiece;

    @Column(name = "DESCRIPTION_PIECE")
    private String descriptionPiece;

}
