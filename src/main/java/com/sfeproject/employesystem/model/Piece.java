package com.sfeproject.employesystem.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "piece")
public class Piece implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "CODE_PIECE", nullable = false)
    private Integer codePiece;

    @Column(name = "INTITULE_PIECE")
    private String intitulePiece;

    @Column(name = "DESCRIPTION_PIECE")
    private String descriptionPiece;

}
